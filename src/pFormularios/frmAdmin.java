
package pFormularios;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import pClases.ArregloCliente;
import pClases.Cliente;
import pClases.ArregloCliente;
import pClases.ArregloProducto;
import pClases.Producto;

public class frmAdmin extends javax.swing.JFrame {

    DefaultTableModel modelotabla;
    String[] cabecera={"Codigo","Nombre","Categoria","Precio","Stock","Estado"};
    String[][] data={};
    ArregloProducto arregloP = new ArregloProducto();
    
    public frmAdmin() {
        initComponents();
        inicial();
    }
    void inicial() {
        arregloP.CargarTXT();
        modelotabla = new DefaultTableModel(data,cabecera);
        tRegistros.setModel(modelotabla);
        definirAnchos();
        listarTabla();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tRegistros = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnReturn = new javax.swing.JButton();
        btnListado = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        bntSALIR = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
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
        jScrollPane2.setBounds(10, 380, 1090, 260);

        jLabel7.setText("Categoria");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(480, 140, 120, 15);

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Combo", "Bedida" }));
        getContentPane().add(cbCategoria);
        cbCategoria.setBounds(480, 160, 200, 50);

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/guardar-el-archivo (1).png"))); // NOI18N
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(860, 160, 70, 60);

        jLabel2.setText("CODIGO:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 130, 60, 20);

        txtCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12))); // NOI18N
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(160, 150, 220, 60);

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
        btnListado.setBounds(950, 230, 70, 60);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/eliminar (1).png"))); // NOI18N
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(860, 230, 70, 60);

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
        btnModificar.setBounds(950, 160, 70, 60);

        jLabel6.setText("NOMBRE: ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(160, 240, 70, 20);

        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre);
        txtNombre.setBounds(160, 260, 220, 60);

        txtPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrecio);
        txtPrecio.setBounds(480, 260, 220, 60);

        jLabel9.setText("PRECIO: ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(480, 230, 70, 40);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 70, 0, 0);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/light-blue-abstract-blur-backdrop-vector.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1110, 740);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/light-blue-abstract-blur-backdrop-vector.jpg"))); // NOI18N
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 1350, 790);

        setSize(new java.awt.Dimension(1126, 772));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    void listarTabla() {
        limpiarTabla();
        if (arregloP.getTamaño()> 0) {
            for (int i = 0; i < arregloP.getTamaño(); i++) {
                Producto t = arregloP.obtener(i);
                Object[] Fila = {t.getIDProducto(),t.getNombre(),t.getCategoria(),t.getPrecio(),
                        t.getStock(),t.getEstado()};
                modelotabla.addRow(Fila);
            }
        }
    }
    void limpiarTabla() {
        modelotabla.setRowCount(0);
    }
    void limpiarCajas() {
        txtCodigo.setText("");
        txtPrecio.setText("");
        txtNombre.setText("");
    }
    void definirAnchos() {
        int Tmi[]={110,140,150,220,220,200};
        TableColumn columna;
        columna = tRegistros.getColumnModel().getColumn(0);
        columna.setPreferredWidth(Tmi[0]);
        columna = tRegistros.getColumnModel().getColumn(1);
        columna.setPreferredWidth(Tmi[1]);
        columna = tRegistros.getColumnModel().getColumn(2);
        columna.setPreferredWidth(Tmi[2]);
        columna = tRegistros.getColumnModel().getColumn(3);
        columna.setPreferredWidth(Tmi[3]);
        columna = tRegistros.getColumnModel().getColumn(4);
        columna.setPreferredWidth(Tmi[4]);
        columna = tRegistros.getColumnModel().getColumn(5);
        columna.setPreferredWidth(Tmi[5]);
        tRegistros.getTableHeader().setReorderingAllowed(false);
        tRegistros.getTableHeader().setResizingAllowed(false);
    }
    
    String getCodigo() { return txtCodigo.getText();}
    String getCategoria(){return cbCategoria.getSelectedItem().toString();}
    String getNombre() { return txtNombre.getText();}
    double getPrecio(){return Double.parseDouble(txtPrecio.getText());}
    
    String validar() {
        if (txtCodigo.getText().equals("") || txtNombre.getText().equals("") || txtPrecio.getText().equals("")) {
            return "Rellenar Todos los Campos";
        } else if(getPrecio()<=0){
            return "Ingresar un Precio Valido";
        } 
        else return "";
    }
    
    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        MenuPrincipal objl2= new MenuPrincipal();
        objl2.setVisible(true);
        dispose();
        objl2.setVisible(true);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void btnListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoActionPerformed
        listarTabla();
    }//GEN-LAST:event_btnListadoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String eliminarM = JOptionPane.showInputDialog(this, "Codigo del Producto a eliminar");
        if(eliminarM!=null){
            Producto aux = arregloP.BuscarID(eliminarM);
            if (aux != null) {
                arregloP.eliminar(aux);
                arregloP.GuardarTXT();
                listarTabla();
            } else {
                JOptionPane.showMessageDialog(this, "CODIGO NO EXISTENTE", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void bntSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSALIRActionPerformed
       System.exit(0);
    }//GEN-LAST:event_bntSALIRActionPerformed


    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Producto auxT = arregloP.BuscarID(getCodigo());
        if (validar().equals("")) {
            if (auxT != null) {
                auxT.setIDProducto(getCodigo());
                auxT.setNombre(getNombre());
                auxT.setCategoria(getCategoria());
                auxT.setPrecio(getPrecio());
                auxT.setStock(5);
                auxT.setEstado("Disponible");
                arregloP.GuardarTXT();
                listarTabla();
                limpiarCajas();
            }else{
                JOptionPane.showMessageDialog(null, "CODIGO NO EXISTENTE ");
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR: " + validar());
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            if (validar().equals("")) {
                Producto aux1 = arregloP.BuscarID(getCodigo());
                if (aux1 == null) {
                    Producto unT = new Producto(getCodigo(),getNombre(), getCategoria(), getPrecio(), 5, "Disponible") {
                        @Override
                        public double ObtenerPrecio() {
                            throw new UnsupportedOperationException("Not supported yet.");
                        }
                    };
                    arregloP.agregar(unT);
                    arregloP.GuardarTXT();
                    listarTabla();
                    limpiarCajas();
                } else {
                    JOptionPane.showMessageDialog(null, "CODIGO YA EXISTENTE");
                }
            } else {
                JOptionPane.showMessageDialog(null, "ERROR: " + validar());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed

    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    
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
    private javax.swing.JButton btnListado;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnReturn;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tRegistros;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
