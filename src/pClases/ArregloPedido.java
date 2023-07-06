package pClases;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class ArregloPedido {

    private ArrayList<Pedido> ArrayT;
    private int indice;

    //constructor
    public ArregloPedido() {
        ArrayT = new ArrayList<Pedido>();
    }

    //metodo para el tamaño
    public int getTamaño() {
        return ArrayT.size();
    }

    //metodo para agregar facturas nueva
    public void agregar(Pedido U) {
        ArrayT.add(U);
    }

    //metodo que devuelve el objeto factura
    public Pedido obtener(int pos) {
        return ArrayT.get(pos);
    }

    //buscar Codigo
    public Pedido BuscarCOD(String COD_Pedido) {
        for(int i=0;i<ArrayT.size();i++){
            if(COD_Pedido.equals(ArrayT.get(i).getCOD_Pedido())){
                return ArrayT.get(i);
            }
        }
        return null;
    }
    
    
    public void eliminar(Pedido x){
        ArrayT.remove(x);
    }
    
    public void GuardarTXT() {
        try {
            PrintWriter X = new PrintWriter(new FileWriter("PEDIDO.txt"));
            for(int i=0;i<getTamaño();i++){
                X.println(obtener(i).getCOD_Pedido()+ "," +obtener(i).getFecha()
                + "," + obtener(i).getEstado()+ "," + obtener(i).getCOD_Cliente()+ "," + obtener(i).getMet_Pag());
            }
            X.close();
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Grabacion Exitosa","Aviso",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void CargarTXT(){ 
        try {
            File archivo = new File("PEDIDO.txt");
            if (archivo.exists()) {
                BufferedReader br = new BufferedReader(new FileReader("PEDIDO.txt"));
                String linea;
                while ((linea = br.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(linea, ",");
                    String CODPedido = st.nextToken().trim();
                    String Fecha = st.nextToken().trim();
                    String Estado = st.nextToken().trim();
                    String COD_Cliente = st.nextToken().trim();
                    String Met_Pag = st.nextToken().trim();
                    Pedido x = new Pedido(CODPedido, Fecha, Estado, COD_Cliente, Met_Pag);
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