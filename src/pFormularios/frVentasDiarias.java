/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pFormularios;


import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import pClases.Cliente;
import pClases.ArregloCliente;

/**import pClases.ArregloCliente;
 *
 * @author walte
 */
public class frVentasDiarias extends javax.swing.JFrame {

    ArregloCliente F  = new ArregloCliente();
    
    public frVentasDiarias() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tRegistros = new javax.swing.JTable();
        btnReturn = new javax.swing.JButton();
        btnListado = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

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
                false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tRegistros);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 230, 1090, 300);

        btnReturn.setBackground(new java.awt.Color(51, 255, 204));
        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/Return (35).png"))); // NOI18N
        btnReturn.setContentAreaFilled(false);
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        getContentPane().add(btnReturn);
        btnReturn.setBounds(1030, 670, 60, 40);

        btnListado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/lista-de-tareas.png"))); // NOI18N
        btnListado.setContentAreaFilled(false);
        btnListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnListado);
        btnListado.setBounds(500, 90, 80, 80);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("LISTAR");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(510, 130, 70, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setText("VENTAS DIARIAS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(430, 20, 220, 80);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/light-blue-abstract-blur-backdrop-vector.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1110, 730);

        setSize(new java.awt.Dimension(1125, 771));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoActionPerformed
        listar();
    }//GEN-LAST:event_btnListadoActionPerformed



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
        /*if (F.getTamaño() > 0) {
            for (int i = 0; i < F.getTamaño(); i++) {
                Cliente fact = F.obtener(i);
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
        }*/
    }
    
    
    
    
    
    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        MenuPrincipal objl2= new MenuPrincipal();
        objl2.setVisible(true);
        dispose();
        objl2.setVisible(true);
    }//GEN-LAST:event_btnReturnActionPerformed

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
            java.util.logging.Logger.getLogger(frVentasDiarias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frVentasDiarias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frVentasDiarias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frVentasDiarias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frVentasDiarias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListado;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tRegistros;
    // End of variables declaration//GEN-END:variables
}
