/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pFormularios;

import javax.swing.JOptionPane;
import pFormularios.Acceso;

public class Acceso extends javax.swing.JFrame {

    /**
     * Creates new form Acceso
     */
    public Acceso() {
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

        jLabel2 = new javax.swing.JLabel();
        lbContraseña = new javax.swing.JLabel();
        lbUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jContraseña = new javax.swing.JPasswordField();
        bnLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 51));
        jLabel2.setText("LOGIN VENDEDOR");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(340, -20, 460, 110);

        lbContraseña.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lbContraseña.setForeground(new java.awt.Color(255, 204, 0));
        lbContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/tamaño 01 padlock.png"))); // NOI18N
        lbContraseña.setText("CONTRASEÑA :");
        getContentPane().add(lbContraseña);
        lbContraseña.setBounds(330, 340, 200, 80);

        lbUsuario.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(255, 204, 0));
        lbUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/login (1).png"))); // NOI18N
        lbUsuario.setText("USUARIO :");
        getContentPane().add(lbUsuario);
        lbUsuario.setBounds(350, 260, 210, 70);

        txtUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(530, 270, 170, 50);
        getContentPane().add(jContraseña);
        jContraseña.setBounds(530, 360, 170, 50);

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
        bnLogin.setBounds(530, 450, 180, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/usuario150.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(490, 70, 150, 160);

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/go-back-arrow.png"))); // NOI18N
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar);
        btnRegresar.setBounds(900, 560, 80, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/28707-representacin-en_la_presentacin_de_diapositivas-2560x1440.jpg"))); // NOI18N
        jLabel1.setText("login");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1140, 650);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(850, 200, 100, 100);

        setSize(new java.awt.Dimension(1156, 692));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnLoginMouseClicked
        
        String Usuario = "vendedor";
        String Contraseña = "gigajuan";
        
        String Pass = new String(jContraseña.getPassword());
        
        if(txtUsuario.getText().equals(Usuario)  && Pass.equals(Contraseña)){
            
            FrmVendedor GN = new FrmVendedor();
            GN.setVisible(true);
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
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceso().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbContraseña;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
