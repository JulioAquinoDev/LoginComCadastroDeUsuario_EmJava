package CONTROLLER;

import MODEL.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Julio Aquino
 */
public class UsuarioClass {
    private int idUsuario;
    private String nomeUsuario, loginUsuario, senhaUsuario;
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    
    /**
     * @return the idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the nomeUsuario
     */
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    /**
     * @param nomeUsuario the nomeUsuario to set
     */
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    /**
     * @return the loginUsuario
     */
    public String getLoginUsuario() {
        return loginUsuario;
    }

    /**
     * @param loginUsuario the loginUsuario to set
     */
    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

    /**
     * @return the senhaUsuario
     */
    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    /**
     * @param senhaUsuario the senhaUsuario to set
     */
    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }
    
    public void cadastrarUsuario(UsuarioClass user){
        String sql = "INSERT INTO Usuarios(nomeUsuario, loginUsuario, senhaUsuario) VALUES(?, ?, ?)";
        conn = new ConexaoBD().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, user.getNomeUsuario());
            pstm.setString(2, user.getLoginUsuario());
            pstm.setString(3, user.getSenhaUsuario());
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioClass cadastrarUsuario" + erro);
        }
    }
    
    public boolean consultarLogin(String login, String senha){
        boolean autenticado = false;
        String sql = "SELECT loginUsuario, senhaUsuario FROM Usuarios WHERE loginUsuario = ? AND senhaUsuario = ?";
        conn = new ConexaoBD().conectaBD();
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, login);
            pstm.setString(2, senha);
            
            rs = pstm.executeQuery();
            
            if(rs.next()){
                String loginBanco = rs.getString("loginUsuario");
                String senhaBanco = rs.getString("senhaUsuario");
                autenticado = true;
            }
            
            pstm.close();
                        
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"UsuarioClass consultarLogin: " + erro);
        }
          
        return autenticado;
    }
    
}
