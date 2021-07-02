package VIEW;

import CONTROLLER.UsuarioClass;
import javax.swing.JOptionPane;

/**
 *
 * @author Julio Aquino
 */
public class frmCadastrarUsuarioVIEW extends javax.swing.JFrame {

    /**
     * Creates new form frmCadastrarUsuarioVIEW
     */
    public frmCadastrarUsuarioVIEW() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CampoNomeCadastro = new javax.swing.JTextField();
        CampoLoginCadastro = new javax.swing.JTextField();
        CampoConfirmarSenhaCadastro = new javax.swing.JPasswordField();
        ButtonVoltar = new javax.swing.JButton();
        ButtonCadastrar = new javax.swing.JButton();
        ButtonLimpar = new javax.swing.JButton();
        CampoSenhaCadastro = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 2, 36)); // NOI18N
        jLabel1.setText("Cadastrar Usuário");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Login:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Senha:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Confirmar Senha:");

        CampoNomeCadastro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        CampoLoginCadastro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        CampoConfirmarSenhaCadastro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        ButtonVoltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ButtonVoltar.setText("Voltar");
        ButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVoltarActionPerformed(evt);
            }
        });

        ButtonCadastrar.setBackground(new java.awt.Color(0, 153, 255));
        ButtonCadastrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ButtonCadastrar.setText("Cadastrar");
        ButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCadastrarActionPerformed(evt);
            }
        });

        ButtonLimpar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ButtonLimpar.setText("Limpar");
        ButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLimparActionPerformed(evt);
            }
        });

        CampoSenhaCadastro.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ButtonVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addGap(31, 31, 31)
                        .addComponent(ButtonLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addGap(31, 31, 31)
                        .addComponent(ButtonCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoConfirmarSenhaCadastro)
                            .addComponent(CampoSenhaCadastro)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoLoginCadastro)
                            .addComponent(CampoNomeCadastro))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(CampoNomeCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(CampoLoginCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(CampoSenhaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(CampoConfirmarSenhaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonVoltar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ButtonLimpar)
                        .addComponent(ButtonCadastrar)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(458, 382));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVoltarActionPerformed
        // TODO add your handling code here:
        new frmLoginVIEW().setVisible(true);
        dispose();
    }//GEN-LAST:event_ButtonVoltarActionPerformed

    private void ButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCadastrarActionPerformed
        String nome, login, senha, confSenha;
        
        nome = CampoNomeCadastro.getText();
        login = CampoLoginCadastro.getText();
        senha = new String(CampoSenhaCadastro.getPassword());
        confSenha = new String (CampoConfirmarSenhaCadastro.getPassword());
        
        if(senha.equals(confSenha)){
            UsuarioClass user = new UsuarioClass();
            user.setNomeUsuario(nome);
            user.setLoginUsuario(login);
            user.setSenhaUsuario(senha);
            user.cadastrarUsuario(user);
            
            new frmLoginVIEW().setVisible(true);
            dispose();
            
        }else{
            JOptionPane.showMessageDialog(null, "Senhas diferente. Tente novamente.");
        }      
    }//GEN-LAST:event_ButtonCadastrarActionPerformed

    private void ButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimparActionPerformed
        CampoNomeCadastro.setText("");
        CampoLoginCadastro.setText("");
        CampoSenhaCadastro.setText("");
        CampoConfirmarSenhaCadastro.setText("");
    }//GEN-LAST:event_ButtonLimparActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmCadastrarUsuarioVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCadastrarUsuarioVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCadastrarUsuarioVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCadastrarUsuarioVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCadastrarUsuarioVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCadastrar;
    private javax.swing.JButton ButtonLimpar;
    private javax.swing.JButton ButtonVoltar;
    private javax.swing.JPasswordField CampoConfirmarSenhaCadastro;
    private javax.swing.JTextField CampoLoginCadastro;
    private javax.swing.JTextField CampoNomeCadastro;
    private javax.swing.JPasswordField CampoSenhaCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
