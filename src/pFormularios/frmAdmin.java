
package pFormularios;

import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import pClases.Cliente;
import pClases.ArregloCliente;

public class frmAdmin extends javax.swing.JFrame {

    ArregloCliente f  = new ArregloCliente();
    
    public frmAdmin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tRegistros = new javax.swing.JTable();
        btnReturn = new javax.swing.JButton();
        btnListado = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        bntSALIR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnEliminar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setText("ADMINISTRADOR");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(430, 30, 220, 80);

        tRegistros.setBackground(new java.awt.Color(0, 255, 255));
        tRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "N° Registro", "Nombre Cliente", "Nombre Producto", "Precio", "Cantidad", "Total", "Fechal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tRegistros);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 220, 1090, 330);

        btnReturn.setBackground(new java.awt.Color(51, 255, 204));
        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/Return (35).png"))); // NOI18N
        btnReturn.setContentAreaFilled(false);
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        getContentPane().add(btnReturn);
        btnReturn.setBounds(10, 10, 50, 40);

        btnListado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/lista-de-tareas.png"))); // NOI18N
        btnListado.setContentAreaFilled(false);
        btnListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnListado);
        btnListado.setBounds(440, 130, 80, 80);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/eliminar (1).png"))); // NOI18N
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(560, 140, 70, 60);

        bntSALIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/salir g (35).png"))); // NOI18N
        bntSALIR.setContentAreaFilled(false);
        bntSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSALIRActionPerformed(evt);
            }
        });
        getContentPane().add(bntSALIR);
        bntSALIR.setBounds(1050, 680, 60, 40);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 70, 0, 0);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/light-blue-abstract-blur-backdrop-vector.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1110, 740);

        btnEliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/eliminar (1).png"))); // NOI18N
        btnEliminar1.setContentAreaFilled(false);
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar1);
        btnEliminar1.setBounds(910, 30, 70, 60);

        setSize(new java.awt.Dimension(1126, 772));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        MenuPrincipal objl2= new MenuPrincipal();
        objl2.setVisible(true);
        dispose();
        objl2.setVisible(true);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoActionPerformed
        listar();
    }//GEN-LAST:event_btnListadoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            int buscoFactura = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingrese un numero de Factura a Eliminar"));
        Cliente fact = f.buscar(buscoFactura);

        if (fact != null) {
            f.eliminar(fact);
            JOptionPane.showMessageDialog(null, "Factura eliminada correctamente",
                "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
            limpiaMatriz();
            listar();
        } else {
            JOptionPane.showMessageDialog(null, "No existe el numero de factura ingresada",
                "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
        }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No existe el numero de factura ingresada",
                "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
        }
        f.grabar_txt();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        try {
            int buscoFactura = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingrese un numero de Factura a Eliminar"));
        Cliente fact = f.buscar(buscoFactura);

        if (fact != null) {
            f.eliminar(fact);
            JOptionPane.showMessageDialog(null, "Factura eliminada correctamente",
                "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
            limpiaMatriz();
            listar();
        } else {
            JOptionPane.showMessageDialog(null, "No existe el numero de factura ingresada",
                "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
        }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No existe el numero de factura ingresada",
                "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
        }
        f.grabar_txt();
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private void bntSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSALIRActionPerformed
       System.exit(0);
    }//GEN-LAST:event_bntSALIRActionPerformed

    
    
    
    void limpiaMatriz() {
        for (int i = 0; i < 10; i++) {
            tRegistros.setValueAt("", i, 0);
            tRegistros.setValueAt("", i, 1);
            tRegistros.setValueAt("", i, 2);
            tRegistros.setValueAt("", i, 3);
            tRegistros.setValueAt("",i,4);
            tRegistros.setValueAt("",i,5);
            tRegistros.setValueAt("",i,6);
        }
    }

    
    
    void listar() {
        if (f.getTamaño() > 0) {
            for (int i = 0; i < f.getTamaño(); i++) {
                Cliente fact = f.obtener(i);
                tRegistros.setValueAt(fact.getCodigo(), i, 0);
                tRegistros.setValueAt(fact.getNombreCliente(), i, 1);
                tRegistros.setValueAt(fact.getNombreProducto(), i, 2);
                tRegistros.setValueAt(fact.combos1(), i, 3);
                tRegistros.setValueAt(fact.getCantidad(),i,4);
                tRegistros.setValueAt(fact.cantidadTotal(), i,5);
                tRegistros.setValueAt(fact.getFecha(), i,6);
            }
        } else {
            limpiaMatriz();
        }
    }
    
    
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
            java.util.logging.Logger.getLogger(frmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntSALIR;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnListado;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tRegistros;
    // End of variables declaration//GEN-END:variables
}
