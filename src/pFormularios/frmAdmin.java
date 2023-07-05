
package pFormularios;

import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import pClases.ArregloCliente;
import pClases.Cliente;
import pClases.ArregloCliente;

public class frmAdmin extends javax.swing.JFrame {

    ArregloCliente f  = new ArregloCliente();
      Cliente p;
   Cliente rp;
    public frmAdmin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tRegistros = new javax.swing.JTable();
        btnGrabarModificado = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoo = new javax.swing.JTextField();
        btnReturn = new javax.swing.JButton();
        btnListado = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        bntSALIR = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmbPRODUCTOS = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtFechaVenta = new javax.swing.JTextField();
        jCheckBox3 = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtCantidad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnEliminar1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setText("ADMINISTRADOR");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(450, 40, 220, 80);

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
        jScrollPane2.setBounds(10, 270, 1090, 330);

        btnGrabarModificado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/guardar-el-archivo (1).png"))); // NOI18N
        btnGrabarModificado.setContentAreaFilled(false);
        btnGrabarModificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarModificadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnGrabarModificado);
        btnGrabarModificado.setBounds(630, 190, 70, 60);

        jLabel2.setText("CODIGO BOLETA :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 60, 110, 20);

        txtCodigoo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12))); // NOI18N
        txtCodigoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigooActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigoo);
        txtCodigoo.setBounds(180, 40, 220, 60);

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
        btnListado.setBounds(420, 180, 80, 80);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/eliminar (1).png"))); // NOI18N
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(500, 190, 70, 60);

        bntSALIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/salir g (35).png"))); // NOI18N
        bntSALIR.setContentAreaFilled(false);
        bntSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSALIRActionPerformed(evt);
            }
        });
        getContentPane().add(bntSALIR);
        bntSALIR.setBounds(1050, 680, 60, 40);

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/usuario32.png"))); // NOI18N
        btnModificar.setContentAreaFilled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar);
        btnModificar.setBounds(570, 190, 70, 60);

        jLabel6.setText("NOMBRE CLIENTE : ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 130, 120, 20);

        txtNombreCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombreCliente);
        txtNombreCliente.setBounds(180, 110, 220, 60);

        jLabel7.setText("PRODUCTOS :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(710, 70, 80, 16);

        cmbPRODUCTOS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COMBO 1", "COMBO 2", "POLLO ENTERO", "1/2 POLLO", "1/4 POLLO", "PROMO 1/4 POLLO + GASEOSA", "PROMO POLLO ENTERO + 1.5 GASEOSA", "PROMO 1/2 POLLO PEPSI " }));
        cmbPRODUCTOS.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPRODUCTOSItemStateChanged(evt);
            }
        });
        cmbPRODUCTOS.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cmbPRODUCTOSMouseMoved(evt);
            }
        });
        cmbPRODUCTOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbPRODUCTOSMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmbPRODUCTOSMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cmbPRODUCTOSMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmbPRODUCTOSMousePressed(evt);
            }
        });
        cmbPRODUCTOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPRODUCTOSActionPerformed(evt);
            }
        });
        getContentPane().add(cmbPRODUCTOS);
        cmbPRODUCTOS.setBounds(810, 40, 270, 70);

        jLabel8.setText("FECHA:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(730, 130, 60, 30);
        getContentPane().add(txtFechaVenta);
        txtFechaVenta.setBounds(810, 120, 220, 60);

        jCheckBox3.setText("TARJETA:");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox3);
        jCheckBox3.setBounds(720, 210, 100, 20);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BCP", "INTERBANK", "SCOTIABANK", "BANBIF", "BBVA ", "ETC" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(810, 190, 240, 60);

        txtCantidad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        getContentPane().add(txtCantidad);
        txtCantidad.setBounds(170, 190, 220, 60);

        jLabel9.setText("CANTIDAD : ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(90, 200, 70, 40);
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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/light-blue-abstract-blur-backdrop-vector.jpg"))); // NOI18N
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1350, 790);

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

        void limpiaCajas() {
        txtCodigoo.setText("");
        txtNombreCliente.setText("");
        txtCantidad.setText("");
        txtFechaVenta.setText("");
    }
        
     void habilitaCajas(boolean option) {
        txtCodigoo.setEditable(option);
        txtNombreCliente.setEditable(option);   
        txtCantidad.setEditable(option);
        txtFechaVenta.setEditable(option);
    }
    
    
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            limpiaCajas();
            limpiaMatriz();

            btnModificar.setVisible(false);
            btnGrabarModificado.setVisible(true);

            int buscaRegistro = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingrese N° de Registro"));
        Cliente fact = f.buscar(buscaRegistro);

        if (fact != null) {
            tRegistros.setValueAt(fact.getCodigo(), 0, 0);
            tRegistros.setValueAt(fact.getNombreCliente(), 0, 1);
            tRegistros.setValueAt(fact.getNombreProducto(), 0, 2);
            tRegistros.setValueAt(fact.getCantidad(),0,4);

            txtCodigoo.setText("" + fact.getCodigo());
            txtNombreCliente.setText(fact.getNombreCliente());
            txtCantidad.setText(""+fact.getCantidad());

            habilitaCajas(true);
            txtCodigoo.setEditable(true);
            txtNombreCliente.setEditable(true);
            txtCantidad.setEditable(true);

        } else {
            JOptionPane.showMessageDialog(null, "Factura NO encontrada",
                "Confirmacion", JOptionPane.ERROR_MESSAGE);
        }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Factura NO encontrada",
                "Confirmacion", JOptionPane.ERROR_MESSAGE);
            btnModificar.setVisible(true);
            btnGrabarModificado.setVisible(false);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGrabarModificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarModificadoActionPerformed
          try {
            Cliente fact = f.buscar(getCodigo());
            fact.setNombreCliente(getNombreCliente());
            fact.setNombreProducto(getNombreProducto());
            fact.setCombos(getPrecio());
            fact.setCantidad(getCantidad());
            fact.setFecha(getFecha());
            JOptionPane.showMessageDialog(null, "Factura modificada correctamente",
                "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
            listar();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al intentar grabar",
                "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
        }
        btnGrabarModificado.setVisible(false);
        btnModificar.setVisible(true);
    }//GEN-LAST:event_btnGrabarModificadoActionPerformed

    private void txtCodigooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigooActionPerformed

    }//GEN-LAST:event_txtCodigooActionPerformed

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void cmbPRODUCTOSItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPRODUCTOSItemStateChanged
       
    }//GEN-LAST:event_cmbPRODUCTOSItemStateChanged

    private void cmbPRODUCTOSMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbPRODUCTOSMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPRODUCTOSMouseMoved

    private void cmbPRODUCTOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbPRODUCTOSMouseClicked

    }//GEN-LAST:event_cmbPRODUCTOSMouseClicked

    private void cmbPRODUCTOSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbPRODUCTOSMouseEntered

    }//GEN-LAST:event_cmbPRODUCTOSMouseEntered

    private void cmbPRODUCTOSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbPRODUCTOSMouseExited

    }//GEN-LAST:event_cmbPRODUCTOSMouseExited

    private void cmbPRODUCTOSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbPRODUCTOSMousePressed

    }//GEN-LAST:event_cmbPRODUCTOSMousePressed

    private void cmbPRODUCTOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPRODUCTOSActionPerformed

    }//GEN-LAST:event_cmbPRODUCTOSActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    
    
    
    
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
    
    

    public int getCodigo() {
        return Integer.parseInt(txtCodigoo.getText());
    }


    public String getNombreCliente() {
        return txtNombreCliente.getText();
    }
    
   public String getNombreProducto(){
       return cmbPRODUCTOS.getSelectedItem().toString();
   }    
    
    public int getPrecio() {
        return cmbPRODUCTOS.getSelectedIndex();
    }
 
    public int getCantidad(){
        return Integer.parseInt(txtCantidad.getText());
    }
    
    public String getFecha(){
      return txtFechaVenta.getText();
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
    private javax.swing.JButton btnGrabarModificado;
    private javax.swing.JButton btnListado;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnReturn;
    private javax.swing.JComboBox<String> cmbPRODUCTOS;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tRegistros;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigoo;
    private javax.swing.JTextField txtFechaVenta;
    private javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables
}
