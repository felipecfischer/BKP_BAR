package InterfaceBar;

import java.sql.*;
import DAL.ConexaoBD;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FrmLogin extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public FrmLogin() throws ClassNotFoundException {
        initComponents();
        setLocationRelativeTo(null); //Deixa a tela centralizada
        conn = ConexaoBD.conexaoBD(); //Recebe a função de conectar ao banco
    }

    public void Logar() {
        String sql = "SELECT * FROM tb_login WHERE login = ? AND  senha = ?";

        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, boxUser.getText());
            pst.setString(2, boxSenha.getText());

            rs = pst.executeQuery();

            if (rs.next()) {
                FrmPrincipal frmPrincipal = new FrmPrincipal();
                frmPrincipal.setVisible(true);
                dispose(); //FECHA TELA DE LOGIN
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos!");
            }

        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, error);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        txtUser = new javax.swing.JLabel();
        txtSenha = new javax.swing.JLabel();
        boxUser = new javax.swing.JTextField();
        btEntrar = new javax.swing.JButton();
        boxSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login de usuário");
        setFocusCycleRoot(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        txtUser.setText("USUÁRIO:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(58, 59, 0, 0);
        getContentPane().add(txtUser, gridBagConstraints);

        txtSenha.setText("SENHA: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 59, 0, 0);
        getContentPane().add(txtSenha, gridBagConstraints);

        boxUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxUserActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 190;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(55, 10, 0, 74);
        getContentPane().add(boxUser, gridBagConstraints);

        btEntrar.setText("ENTRAR");
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 131, 29, 74);
        getContentPane().add(btEntrar, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 190;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 10, 0, 74);
        getContentPane().add(boxSenha, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxUserActionPerformed
        
    }//GEN-LAST:event_boxUserActionPerformed

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        Logar(); 
    }//GEN-LAST:event_btEntrarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrmLogin().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FrmLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField boxSenha;
    private javax.swing.JTextField boxUser;
    private javax.swing.JButton btEntrar;
    private javax.swing.JLabel txtSenha;
    private javax.swing.JLabel txtUser;
    // End of variables declaration//GEN-END:variables
}
