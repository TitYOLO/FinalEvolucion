package pClases;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class ArregloDet_Pedido {

    private ArrayList<Det_Pedido> ArrayT;
    private int indice;

    //constructor
    public ArregloDet_Pedido() {
        ArrayT = new ArrayList<Det_Pedido>();
    }

    //metodo para el tamaño
    public int getTamaño() {
        return ArrayT.size();
    }

    //metodo para agregar facturas nueva
    public void agregar(Det_Pedido U) {
        ArrayT.add(U);
    }

    //metodo que devuelve el objeto factura
    public Det_Pedido obtener(int pos) {
        return ArrayT.get(pos);
    }

    //buscar Codigo
    public Det_Pedido BuscarID(String COD_Detalle) {
        for(int i=0;i<ArrayT.size();i++){
            if( COD_Detalle.equals(ArrayT.get(i).getCOD_Detalle())){
                return ArrayT.get(i);
            }
        }
        return null;
    }
    
    public Det_Pedido BuscarCODIDM(String C_V, String ID_M){
        for(int i=0;i<ArrayT.size();i++){
            if( C_V.equals(ArrayT.get(i).getCOD_Detalle()) && ID_M.equals(ArrayT.get(i).getCOD_Menu())){
                return ArrayT.get(i);
            }
        }
        return null;
    }
    
    public void eliminar(Det_Pedido x){
        ArrayT.remove(x);
    }
    
    public void GuardarTXT() {
        try {
            PrintWriter X = new PrintWriter(new FileWriter("DET_PEDIDO.txt"));
            for(int i=0;i<getTamaño();i++){
                X.println(obtener(i).getCOD_Detalle()+ "," +obtener(i).getCOD_Menu()+ "," + obtener(i).getCantidad());
            }
            X.close();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Grabacion Exitosa","Aviso",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void CargarTXT(){ 
        try {
            File archivo = new File("DET_PEDIDO.txt");
            if (archivo.exists()) {
                BufferedReader br = new BufferedReader(new FileReader("DET_PEDIDO.txt"));
                String linea;
                while ((linea = br.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(linea, ",");
                    String COD_Detalle = st.nextToken().trim();
                    String COD_Menu = st.nextToken().trim();
                    int Cantidad = Integer.parseInt(st.nextToken().trim());
                    Det_Pedido x = new Det_Pedido(COD_Detalle,COD_Menu,Cantidad);
                    agregar(x);
                }
                br.close();
            } else {
                JOptionPane.showMessageDialog(null, "El archivo de texto no existe");
            }
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "Se produjo un Error " + x);
        }
    }
}