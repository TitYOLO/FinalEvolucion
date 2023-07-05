
package pFormularios;

import java.util.GregorianCalendar;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import pClases.ArregloCliente;
import pClases.Cliente;
import pFormularios.AccesoA;

public class AccesoA extends javax.swing.JFrame {

   
    public AccesoA() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lbUsuario = new javax.swing.JLabel();
        lbContraseña = new javax.swing.JLabel();
        jContraseña = new javax.swing.JPasswordField();
        bnLogin = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/usuario150.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(480, 170, 150, 160);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 51));
        jLabel2.setText("LOGIN ADMINISTRADOR");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(260, 60, 660, 110);

        txtUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(520, 360, 170, 50);

        lbUsuario.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(255, 204, 0));
        lbUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/login (1).png"))); // NOI18N
        lbUsuario.setText("USUARIO :");
        getContentPane().add(lbUsuario);
        lbUsuario.setBounds(320, 350, 210, 70);

        lbContraseña.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lbContraseña.setForeground(new java.awt.Color(255, 204, 0));
        lbContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/tamaño 01 padlock.png"))); // NOI18N
        lbContraseña.setText("CONTRASEÑA :");
        getContentPane().add(lbContraseña);
        lbContraseña.setBounds(290, 410, 200, 80);
        getContentPane().add(jContraseña);
        jContraseña.setBounds(520, 430, 170, 50);

        bnLogin.setForeground(new java.awt.Color(255, 204, 0));
        bnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/bt.pnh (1)_1.png"))); // NOI18N
        bnLogin.setContentAreaFilled(false);
        bnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnLoginMouseClicked(evt);
            }
        });
        bnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(bnLogin);
        bnLogin.setBounds(490, 520, 180, 50);

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/go-back-arrow.png"))); // NOI18N
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar);
        btnRegresar.setBounds(940, 570, 80, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/28707-representacin-en_la_presentacin_de_diapositivas-2560x1440.jpg"))); // NOI18N
        jLabel1.setText("login");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1140, 650);

        setSize(new java.awt.Dimension(1115, 687));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnLoginMouseClicked

        String Usuario = "administrador";
        String Contraseña = "gigajuan";

        String Pass = new String(jContraseña.getPassword());

        if(txtUsuario.getText().equals(Usuario)  && Pass.equals(Contraseña)){

            frmAdmin ad = new frmAdmin();
            ad.setVisible(true);
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(this,"Usuario / Contraseña Incorrecta");
        }
    }//GEN-LAST:event_bnLoginMouseClicked

    private void bnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bnLoginActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        MenuPrincipal objl2= new MenuPrincipal();
        objl2.setVisible(true);
        dispose();
        objl2.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(AccesoA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccesoA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccesoA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccesoA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccesoA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnLogin;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JPasswordField jContraseña;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbContraseña;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
