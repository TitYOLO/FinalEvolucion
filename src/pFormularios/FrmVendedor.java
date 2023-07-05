
package pFormularios;
 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import pClases.ArregloCliente;
import pClases.Cliente;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import java.net.URL;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;


public class FrmVendedor extends javax.swing.JFrame {
    ArregloCliente f = new ArregloCliente();
    int num = 0;

     Cliente p;
   Cliente rp;
   
 
 public FrmVendedor() {
        initComponents();
        DefinirAnchos();
        asignaFecha();
        habilitaCajas(false);
        this.setLocationRelativeTo(this);
        btnGrabarIngreso.setVisible(false);
        btnGrabarModificado.setVisible(false);
        listar();
    }

    
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        btnReturn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        cmbPRODUCTOS = new javax.swing.JComboBox<>();
        txtNombreCliente = new javax.swing.JTextField();
        lblMantenimiento = new javax.swing.JPanel();
        btnModificar = new javax.swing.JButton();
        btnGrabarIngreso = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnGrabarModificado = new javax.swing.JButton();
        btnListado = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        txtCodigoo = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        Jimagen = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tRegistros = new javax.swing.JTable();
        rSLabelHora1 = new rojeru_san.RSLabelHora();
        txtFechaVenta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRO COMPRA");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(null);

        btnReturn.setBackground(new java.awt.Color(51, 255, 204));
        btnReturn.setText("RETORNAR AL MENU PRINCIPAL");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        getContentPane().add(btnReturn);
        btnReturn.setBounds(910, 750, 220, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAutoscrolls(true);
        jPanel1.setLayout(null);

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
        jPanel1.add(cmbPRODUCTOS);
        cmbPRODUCTOS.setBounds(490, 80, 270, 70);

        txtNombreCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombreCliente);
        txtNombreCliente.setBounds(140, 180, 220, 60);

        lblMantenimiento.setBackground(new java.awt.Color(0, 204, 255));
        lblMantenimiento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mantenimiento:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        lblMantenimiento.setForeground(new java.awt.Color(255, 255, 255));
        lblMantenimiento.setOpaque(false);
        lblMantenimiento.setLayout(null);

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/usuario32.png"))); // NOI18N
        btnModificar.setContentAreaFilled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        lblMantenimiento.add(btnModificar);
        btnModificar.setBounds(740, 30, 70, 60);

        btnGrabarIngreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/guardar-el-archivo (1).png"))); // NOI18N
        btnGrabarIngreso.setContentAreaFilled(false);
        btnGrabarIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarIngresoActionPerformed(evt);
            }
        });
        lblMantenimiento.add(btnGrabarIngreso);
        btnGrabarIngreso.setBounds(160, 30, 70, 60);

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/agrega32.png"))); // NOI18N
        btnRegistrar.setContentAreaFilled(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        lblMantenimiento.add(btnRegistrar);
        btnRegistrar.setBounds(300, 30, 70, 60);

        btnGrabarModificado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/guardar-el-archivo (1).png"))); // NOI18N
        btnGrabarModificado.setContentAreaFilled(false);
        btnGrabarModificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarModificadoActionPerformed(evt);
            }
        });
        lblMantenimiento.add(btnGrabarModificado);
        btnGrabarModificado.setBounds(450, 30, 70, 60);

        btnListado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/lista-de-tareas.png"))); // NOI18N
        btnListado.setContentAreaFilled(false);
        btnListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoActionPerformed(evt);
            }
        });
        lblMantenimiento.add(btnListado);
        btnListado.setBounds(840, 30, 70, 60);

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/BUSCAR 32.png"))); // NOI18N
        btnConsultar.setContentAreaFilled(false);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        lblMantenimiento.add(btnConsultar);
        btnConsultar.setBounds(610, 30, 70, 60);

        jPanel1.add(lblMantenimiento);
        lblMantenimiento.setBounds(140, 340, 1100, 110);

        txtCodigoo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12))); // NOI18N
        txtCodigoo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigooActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodigoo);
        txtCodigoo.setBounds(140, 90, 220, 60);

        txtCantidad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14))); // NOI18N
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantidad);
        txtCantidad.setBounds(140, 260, 220, 60);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BCP", "INTERBANK", "SCOTIABANK", "BANBIF", "BBVA ", "ETC" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(520, 270, 240, 60);
        jPanel1.add(Jimagen);
        Jimagen.setBounds(840, 60, 320, 250);

        jLabel6.setText("NOMBRE CLIENTE : ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 190, 120, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("REGISTRO DE COMPRA");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(480, 10, 310, 70);

        jLabel5.setText("PRODUCTOS :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(410, 110, 80, 16);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/JuanitosLogo150.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(1200, 0, 150, 150);

        jCheckBox3.setText("TARJETA");
        jPanel1.add(jCheckBox3);
        jCheckBox3.setBounds(408, 290, 100, 20);

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
                "N° Registro", "Nombre Cliente", "Nombre Producto", "Precio", "Cantidad", "Total", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tRegistros);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(150, 470, 1090, 270);
        jPanel1.add(rSLabelHora1);
        rSLabelHora1.setBounds(1210, 150, 120, 40);
        jPanel1.add(txtFechaVenta);
        txtFechaVenta.setBounds(520, 170, 220, 60);

        jLabel2.setText("CODIGO BOLETA :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 110, 90, 20);

        jLabel8.setText("FECHA:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(430, 180, 60, 30);

        jLabel4.setText("CANTIDAD : ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 270, 70, 40);

        jLabel9.setText("PRODUCTOS :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(410, 110, 80, 16);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/light-blue-abstract-blur-backdrop-vector.jpg"))); // NOI18N
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 1350, 790);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/light-blue-abstract-blur-backdrop-vector.jpg"))); // NOI18N
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 0, 1350, 790);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1350, 790);

        setSize(new java.awt.Dimension(1363, 827));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    
    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
       MenuPrincipal objl2= new MenuPrincipal();
        objl2.setVisible(true);
            dispose(); 
        objl2.setVisible(true); 
    }//GEN-LAST:event_btnReturnActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void txtCodigooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigooActionPerformed

    }//GEN-LAST:event_txtCodigooActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try {
            limpiaCajas();
            limpiaMatriz();
            int buscoFactura = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingrese un numero de factura: "));
        Cliente fact = f.buscar(buscoFactura);
        if (fact != null) {
            tRegistros.setValueAt(fact.getCodigo(), 0, 0);
            tRegistros.setValueAt(fact.getNombreCliente(), 0, 1);
            tRegistros.setValueAt(fact.getNombreProducto(), 0, 2);
            tRegistros.setValueAt(fact.getCantidad(),0,4);
            tRegistros.setValueAt(fact.cantidadTotal(),0,5);
            tRegistros.setValueAt(fact.getFecha(),0,6);

        } else {
            JOptionPane.showMessageDialog(null, "Factura NO encontrada",
                "Confirmacion", JOptionPane.ERROR_MESSAGE);
        }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error de entrada de datos",
                "Confirmacion", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoActionPerformed
        listar();
    }//GEN-LAST:event_btnListadoActionPerformed

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

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        txtCodigoo.setText("" + generaNumero());
        txtNombreCliente.requestFocus();

        habilitaCajas(true);
        txtNombreCliente.setEditable(true);

        txtNombreCliente.setText("");
        txtCantidad.setText("");
        //        cmbPRODUCTOS.setSelectedIndex(0);
        btnRegistrar.setVisible(false);
        btnGrabarIngreso.setVisible(true);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnGrabarIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarIngresoActionPerformed

        try {
            habilitaCajas(false);
            btnRegistrar.setVisible(true);
            btnGrabarIngreso.setVisible(false);
            Cliente fact = new Cliente(getCodigo(), getNombreCliente(),getNombreProducto(),getCantidad(),getPrecio(),getFecha());
            f.agregar(fact);
            f.grabar_txt();
            listar();
            JOptionPane.showMessageDialog(null, "Factura ingresada correctamente",
                "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error de ingreso de datos",
                "Error", JOptionPane.ERROR_MESSAGE);
            num--;
        }
    }//GEN-LAST:event_btnGrabarIngresoActionPerformed

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

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void cmbPRODUCTOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPRODUCTOSActionPerformed
         
        
    }//GEN-LAST:event_cmbPRODUCTOSActionPerformed

    private void cmbPRODUCTOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbPRODUCTOSMouseClicked

      
        
    }//GEN-LAST:event_cmbPRODUCTOSMouseClicked

    private void cmbPRODUCTOSMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbPRODUCTOSMousePressed
        
    }//GEN-LAST:event_cmbPRODUCTOSMousePressed

    private void cmbPRODUCTOSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbPRODUCTOSMouseExited
        
        
    }//GEN-LAST:event_cmbPRODUCTOSMouseExited

    private void cmbPRODUCTOSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbPRODUCTOSMouseEntered
       
    }//GEN-LAST:event_cmbPRODUCTOSMouseEntered

    private void cmbPRODUCTOSMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbPRODUCTOSMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPRODUCTOSMouseMoved

    private void cmbPRODUCTOSItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPRODUCTOSItemStateChanged
        int posi = cmbPRODUCTOS.getSelectedIndex();
        switch(posi){
            case 0 :
                 Jimagen.setIcon(new ImageIcon(FrmVendedor.class.getResource("/pImagenes/java_combo1.jpg")));
                break;
                case 1 :
                    Jimagen.setIcon(new ImageIcon(FrmVendedor.class.getResource("/pImagenes/java_combo2.jpg")));
                break;
                case 2 :
                     Jimagen.setIcon(new ImageIcon(FrmVendedor.class.getResource("/pImagenes/java_polloentero.jpg")));
                break;
                case 3 :
                    Jimagen.setIcon(new ImageIcon(FrmVendedor.class.getResource("/pImagenes/java_mediopollo.jpg")));
                break;
                case 4 :
                    Jimagen.setIcon(new ImageIcon(FrmVendedor.class.getResource("/pImagenes/java_cuarto.jpg")));
                break;
                case 5 :
                     Jimagen.setIcon(new ImageIcon(FrmVendedor.class.getResource("/pImagenes/java_cuartogas.png")));
                break;
                case 6 :
                     Jimagen.setIcon(new ImageIcon(FrmVendedor.class.getResource("/pImagenes/java_pollito.jpg")));
                break;
                case 7 :
                     Jimagen.setIcon(new ImageIcon(FrmVendedor.class.getResource("/pImagenes/java_mediopepsi.jpg")));
                    break;
                
        }
        
        
    }//GEN-LAST:event_cmbPRODUCTOSItemStateChanged

    
    void DefinirAnchos() {
        TableColumn columna;
        columna = tRegistros.getColumnModel().getColumn(0);
        columna.setPreferredWidth(90);
        columna = tRegistros.getColumnModel().getColumn(1);
        columna.setPreferredWidth(150);
        columna = tRegistros.getColumnModel().getColumn(2);
        columna.setPreferredWidth(150);
        columna = tRegistros.getColumnModel().getColumn(3);
        columna.setPreferredWidth(70);
        columna = tRegistros.getColumnModel().getColumn(4);
        columna.setPreferredWidth(80);
        tRegistros.getTableHeader().setReorderingAllowed(false);
        tRegistros.getTableHeader().setResizingAllowed(false);
    }

    void habilitaCajas(boolean option) {
        txtCodigoo.setEditable(option);
        txtNombreCliente.setEditable(option);   
        txtCantidad.setEditable(option);
        txtFechaVenta.setEditable(option);
    }

    void limpiaCajas() {
        txtCodigoo.setText("");
        txtNombreCliente.setText("");
        txtCantidad.setText("");
        txtFechaVenta.setText("");
    }

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

    public int generaNumero() {
        num++;
        return num;
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

        void asignaFecha(){
        GregorianCalendar cal = new GregorianCalendar();
        txtFechaVenta.setText("" + cal.getTime());
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
            java.util.logging.Logger.getLogger(FrmVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jimagen;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnGrabarIngreso;
    private javax.swing.JButton btnGrabarModificado;
    private javax.swing.JButton btnListado;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnReturn;
    private javax.swing.JComboBox<String> cmbPRODUCTOS;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel lblMantenimiento;
    private rojeru_san.RSLabelHora rSLabelHora1;
    private javax.swing.JTable tRegistros;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigoo;
    private javax.swing.JTextField txtFechaVenta;
    private javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables
}
