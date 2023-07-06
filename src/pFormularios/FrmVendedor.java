
package pFormularios;
 

import FProductos.Producto;
import FileManager.ClienteFileManager;
import FileManager.DetPedidoFileManager;
import FileManager.PedidoFileManager;
import FileManager.ProductoFileManager;
import Repository.ImplRepository.ClienteRepository;
import Repository.ImplRepository.DetPedidoRepository;
import Repository.ImplRepository.PedidoRepository;
import Repository.ImplRepository.ProductoRepository;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import pClases.*;

public class FrmVendedor extends javax.swing.JFrame {

    DefaultTableModel Modelotabla;
    String[] cabecera={"IDProducto","Nombre","Stock","Precio"};
    String[][] data = {};
    PrecioFormatter C = new PrecioFormatter();
    PedidoRepository ArregloP = new PedidoRepository(new PedidoFileManager());
    DetPedidoRepository ArregloDP = new DetPedidoRepository(new DetPedidoFileManager());
    ProductoRepository ArregloM = new ProductoRepository(new ProductoFileManager());
    ClienteRepository ArregloC = new ClienteRepository((new ClienteFileManager()));
    
    public FrmVendedor() {
        initComponents();
        inicial();
    }
    
    void inicial() {
        ArregloP.cargarPedidos();
        ArregloDP.cargarDetPedidos();
        ArregloM.cargarProductos();
        Modelotabla = new DefaultTableModel(data,cabecera);
        tMenu.setModel(Modelotabla);
        DefinirAnchos();
        listarTabla();
        txtMontoTotal.setEditable(false);
    }
    
    String obtenerFechaR() {
        GregorianCalendar cal = new GregorianCalendar();      
        return ("" + cal.get(Calendar.DATE) +"/"+(cal.get(Calendar.MONTH)+1)+"/"+cal.get(Calendar.YEAR));
    }
    String obtenerCodigoVenta(){return txtCodigoVenta.getText();}
    String obtenerMetodo(){return cbMet_Pago.getSelectedItem().toString();}
    String obtenerDNI(){return txtDNI.getText();}
    String obtenerNombre(){return txtNombre.getText();}
    String obtenerIDMenu(){return txtIDMenu.getText();}
    String obtenerCodigo(){return txtCodigoVenta.getText();}
    int obtenerCant(){return Integer.parseInt(txtCant.getText());}
    
    void Checks(){
        limpiarTabla();
        if (chbBebidas.isSelected()) {
            lisTablaCheck("Bebida");
        }
        if (chbGC.isSelected()) {
            lisTablaCheck("Normal");
        }
        if (chbRepos.isSelected()) {
            lisTablaCheck("Combo");
        }
        if(chbBebidas.isSelected()==false &&
                chbGC.isSelected()==false && chbRepos.isSelected()==false)listarTabla();
    }
    
    void DefinirAnchos() {
        int Tmi[]={60,300,50,75};
        TableColumn columna;
        columna = tMenu.getColumnModel().getColumn(0);
        columna.setPreferredWidth(Tmi[0]);
        columna = tMenu.getColumnModel().getColumn(1);
        columna.setPreferredWidth(Tmi[1]);
        columna = tMenu.getColumnModel().getColumn(2);
        columna.setPreferredWidth(Tmi[2]);
        columna = tMenu.getColumnModel().getColumn(3);
        columna.setPreferredWidth(Tmi[3]);
        tMenu.getTableHeader().setReorderingAllowed(false);
        tMenu.getTableHeader().setResizingAllowed(false);
    }
    
    void lisTablaCheck(String Cate) {
        if (ArregloM.getTamaño()> 0) {
            for (int i = 0; i < ArregloM.getTamaño(); i++) {
                Producto t = ArregloM.obtener(i);
                if(t.getCategoria().equals(Cate)){
                    Object[] Fila = {t.getIDProducto(),t.getNombre(),t.getStock(),t.getPrecio()};
                    Modelotabla.addRow(Fila);
                }
            }
        }
    }
    
    void listarTabla() {
        limpiarTabla();
        if (ArregloM.getTamaño()> 0) {
            for (int i = 0; i < ArregloM.getTamaño(); i++) {
                Producto t = ArregloM.obtener(i);
                Object[] Fila = {t.getIDProducto(),t.getNombre(),t.getStock(),C.formatearPrecio(t.getPrecio())};
                Modelotabla.addRow(Fila);
            }
        }
    }
    
    void limpiarTabla() {
        Modelotabla.setRowCount(0);
    }
    void LimpiarCajas() {
        txtNombre.setText("");
        txtDNI.setText("");
        txtIDMenu.setText("");
        txtCant.setText("");
        txtMontoTotal.setText("");
        txaResultado.setText("");
    }
    
    String validar() {
        if (txtDNI.getText().equals("") || txtNombre.getText().equals("")
                ||txtCodigoVenta.getText().equals("")) {
            return "Rellenar Todos los Campos"; 
        } else if(txaResultado.getText().equals("")){
            return "Ingresar Pedidos"; 
        }else return "";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        btnReturn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtCant = new javax.swing.JTextField();
        txtIDMenu = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tMenu = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoVenta = new javax.swing.JTextField();
        cbMet_Pago = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        rSLabelHora1 = new rojeru_san.RSLabelHora();
        txtMontoTotal = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaResultado = new javax.swing.JTextArea();
        btnFinalizar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnQuitar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        chbGC = new javax.swing.JCheckBox();
        chbBebidas = new javax.swing.JCheckBox();
        chbRepos = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        Jimagen = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        FONDO2 = new javax.swing.JLabel();
        FONDO = new javax.swing.JLabel();

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

        txtCant.setBorder(null);
        txtCant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantActionPerformed(evt);
            }
        });
        jPanel1.add(txtCant);
        txtCant.setBounds(220, 620, 120, 50);

        txtIDMenu.setBorder(null);
        txtIDMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDMenuActionPerformed(evt);
            }
        });
        jPanel1.add(txtIDMenu);
        txtIDMenu.setBounds(70, 620, 100, 50);

        tMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tMenu);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(70, 300, 610, 260);

        jLabel2.setText("Código de Venta");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 90, 110, 15);

        txtCodigoVenta.setBorder(null);
        txtCodigoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoVentaActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodigoVenta);
        txtCodigoVenta.setBounds(80, 110, 150, 50);

        cbMet_Pago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta de Credito / Debito" }));
        jPanel1.add(cbMet_Pago);
        cbMet_Pago.setBounds(290, 110, 200, 60);

        jLabel3.setText("Método de pago");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(290, 90, 110, 15);

        txtDNI.setBorder(null);
        txtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIActionPerformed(evt);
            }
        });
        jPanel1.add(txtDNI);
        txtDNI.setBounds(80, 210, 150, 50);

        jLabel5.setText("COD Cliente");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(80, 190, 110, 15);

        jLabel12.setText("Cantidad");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(220, 600, 80, 15);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("REGISTRO DE COMPRA");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(480, 10, 310, 70);

        jLabel11.setText("ID Menu");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(70, 600, 60, 15);
        jPanel1.add(rSLabelHora1);
        rSLabelHora1.setBounds(1210, 150, 120, 40);

        txtMontoTotal.setBorder(null);
        txtMontoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMontoTotalActionPerformed(evt);
            }
        });
        jPanel1.add(txtMontoTotal);
        txtMontoTotal.setBounds(850, 600, 120, 50);

        jLabel13.setText("Monto Total");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(850, 580, 80, 15);

        txaResultado.setColumns(20);
        txaResultado.setRows(5);
        jScrollPane1.setViewportView(txaResultado);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(830, 300, 350, 270);

        btnFinalizar.setText("Finalizar");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnFinalizar);
        btnFinalizar.setBounds(1000, 590, 170, 60);

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/1491254405-plusaddmoredetail_82972.png"))); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar);
        btnAgregar.setBounds(420, 610, 78, 70);

        btnQuitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/1491254402-minussubtractreducediscount_82971.png"))); // NOI18N
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });
        jPanel1.add(btnQuitar);
        btnQuitar.setBounds(520, 610, 78, 70);

        txtNombre.setBorder(null);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre);
        txtNombre.setBounds(290, 210, 280, 50);

        chbGC.setBackground(new java.awt.Color(0, 204, 204));
        chbGC.setText("Normal");
        chbGC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbGCActionPerformed(evt);
            }
        });
        jPanel1.add(chbGC);
        chbGC.setBounds(700, 360, 80, 23);

        chbBebidas.setBackground(new java.awt.Color(0, 204, 204));
        chbBebidas.setForeground(new java.awt.Color(255, 255, 255));
        chbBebidas.setText("Bebida");
        chbBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbBebidasActionPerformed(evt);
            }
        });
        jPanel1.add(chbBebidas);
        chbBebidas.setBounds(700, 390, 81, 23);

        chbRepos.setBackground(new java.awt.Color(0, 204, 204));
        chbRepos.setText("Combo");
        chbRepos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbReposActionPerformed(evt);
            }
        });
        jPanel1.add(chbRepos);
        chbRepos.setBounds(700, 420, 81, 23);

        jLabel6.setText("Nombre");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(290, 190, 110, 15);
        jPanel1.add(Jimagen);
        Jimagen.setBounds(840, 50, 320, 250);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/JuanitosLogo150.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(1200, 0, 150, 150);

        FONDO2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/light-blue-abstract-blur-backdrop-vector.jpg"))); // NOI18N
        FONDO2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        FONDO2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(FONDO2);
        FONDO2.setBounds(0, 0, 1350, 790);

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/light-blue-abstract-blur-backdrop-vector.jpg"))); // NOI18N
        FONDO.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        FONDO.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(FONDO);
        FONDO.setBounds(0, 0, 1350, 790);

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

    private void txtIDMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDMenuActionPerformed

    private void txtCantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantActionPerformed

    private void txtMontoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMontoTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMontoTotalActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        // TODO add your handling code here:
        try {
            if (validar().equals("")) {
                Pedido auxP = ArregloP.buscarID(obtenerCodigo());
                Cliente aux1 = ArregloC.buscarID(obtenerDNI());
                if (auxP == null) {
                    if (aux1 == null) {
                        Cliente NC = new Cliente(obtenerDNI(), obtenerNombre());
                        ArregloC.agregar(NC);
                        ArregloC.guardarCliente();
                    }
                    for (int i = 0; i < ArregloDP.getTamaño(); i++) {
                        DetPedido DET = ArregloDP.obtener(i);
                        if (DET.getCOD_Detalle().equals(obtenerCodigoVenta())) {
                            Producto M = ArregloM.buscarID(DET.getCOD_Menu());
                            if (M.getStock() - DET.getCantidad() == 0) {
                                M.setStock(0);
                                M.setEstado("No Disponible");
                            } else {
                                M.setStock(M.getStock() - DET.getCantidad());
                            }

                        }
                    }
                    ArregloM.guardarProductos();
                    ArregloDP.guardarDetPedidos();
                    Pedido P = new Pedido(obtenerCodigoVenta(), obtenerFechaR(), "En proceso", obtenerDNI(), obtenerMetodo());
                    ArregloP.agregar(P);
                    ArregloP.guardarPedidos();
                    LimpiarCajas();
                    listarTabla();
                } else {
                    JOptionPane.showMessageDialog(null, "PEDIDO YA EXISTENTE");
                }

            } else {
                JOptionPane.showMessageDialog(null, "ERROR: " + validar());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e);
        }
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void txtCodigoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoVentaActionPerformed

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            if(obtenerCant()<=0){
                JOptionPane.showMessageDialog(null, "Cantidad invalida");
            }else{
                Producto M = ArregloM.buscarID(obtenerIDMenu());
                if (M != null) {
                    if(obtenerCant() > M.getStock()){
                        JOptionPane.showMessageDialog(null, "Stock insuficiente");
                    }else{
                        DetPedido aux1 = ArregloDP.BuscarCODIDM(obtenerCodigoVenta(), obtenerIDMenu());
                        if(aux1!=null){
                            aux1.setCOD_Detalle(obtenerCodigoVenta());
                            aux1.setCOD_Menu(obtenerIDMenu());
                            if(aux1.getCantidad()+obtenerCant()>M.getStock()){
                                JOptionPane.showMessageDialog(null, "Stock insuficiente");
                            }else{
                                aux1.setCantidad(aux1.getCantidad()+obtenerCant());
                            }
                        }else{
                            DetPedido DPed = new DetPedido(obtenerCodigoVenta(), obtenerIDMenu(), obtenerCant());
                            ArregloDP.agregar(DPed);
                        }
                        txaResultado.setText("");
                        double Total = 0;
                        if (ArregloDP.getTamaño()> 0) {
                            txaResultado.append("\n  \t        -|PEDIDO|-");
                            txaResultado.append("\n  IDMenu\tCantidad\tPrecio\tSubTotal");
                            for (int i = 0; i < ArregloDP.getTamaño(); i++) {
                                DetPedido DET = ArregloDP.obtener(i);
                                if(DET.getCOD_Detalle().equals(obtenerCodigoVenta())){
                                    Producto M2 = ArregloM.buscarID(DET.getCOD_Menu());
                                    Total+=(double)DET.getCantidad()*M2.getPrecio();
                                    txaResultado.append("\n  " + DET.getCOD_Menu()+"\t" + DET.getCantidad() + "\t"+ C.formatearPrecio(M2.getPrecio())+ "\t"+ C.formatearPrecio(DET.getCantidad()*M2.getPrecio()));
                                }
                            }
                            txtMontoTotal.setText(C.formatearPrecio(Total));
                        }
                    }
                }else {
                    JOptionPane.showMessageDialog(null, "IDMenu invalido");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        try {
            if(obtenerCant()<=0){
                JOptionPane.showMessageDialog(null, "Cantidad invalida");
            } else {
                Producto M = ArregloM.buscarID(obtenerIDMenu());
                if (M != null) {
                    DetPedido aux1 = ArregloDP.BuscarCODIDM(obtenerCodigoVenta(), obtenerIDMenu());
                    if (aux1 != null) {
                        if (aux1.getCantidad() - obtenerCant() <= 0) {
                            ArregloDP.eliminar(aux1);
                        } else {
                            aux1.setCantidad(aux1.getCantidad() - obtenerCant());
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "IDMenu ("+M.getIDProducto()+") no se encuentra en el pedido");
                    }
                    txaResultado.setText("");
                    double Total = 0;
                    if (ArregloDP.getTamaño() > 0) {
                        DecimalFormat df = new DecimalFormat("###0.00");
                        txaResultado.append("\n  \t        -|PEDIDO|-");
                        txaResultado.append("\n  IDMenu\tCantidad\tPrecio\tSubTotal");
                        for (int i = 0; i < ArregloDP.getTamaño(); i++) {
                            DetPedido DET = ArregloDP.obtener(i);
                            if(DET.getCOD_Detalle().equals(obtenerCodigoVenta())){
                                Producto M2 = ArregloM.buscarID(DET.getCOD_Menu());
                                Total += (double) DET.getCantidad() * M2.getPrecio();
                                txaResultado.append("\n  " + DET.getCOD_Menu() + "\t" + DET.getCantidad() + "\t" + C.formatearPrecio(M2.getPrecio()) + "\tS/" + df.format(DET.getCantidad() * M2.getPrecio()));
                            }
                        }
                        txtMontoTotal.setText("S/" + df.format(Total));
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "IDMenu invalido");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR: " + e);
        }
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void chbGCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbGCActionPerformed
        Checks();
    }//GEN-LAST:event_chbGCActionPerformed

    private void chbBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbBebidasActionPerformed
        Checks();
    }//GEN-LAST:event_chbBebidasActionPerformed

    private void chbReposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbReposActionPerformed
        Checks();
    }//GEN-LAST:event_chbReposActionPerformed
   
 
    
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
    private javax.swing.JLabel FONDO;
    private javax.swing.JLabel FONDO2;
    private javax.swing.JLabel Jimagen;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JButton btnReturn;
    private javax.swing.JComboBox<String> cbMet_Pago;
    private javax.swing.JCheckBox chbBebidas;
    private javax.swing.JCheckBox chbGC;
    private javax.swing.JCheckBox chbRepos;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private rojeru_san.RSLabelHora rSLabelHora1;
    private javax.swing.JTable tMenu;
    private javax.swing.JTextArea txaResultado;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtCodigoVenta;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtIDMenu;
    private javax.swing.JTextField txtMontoTotal;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
