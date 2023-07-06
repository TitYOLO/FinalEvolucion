package pClases;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class ArregloProducto {

    private ArrayList<Producto> ArrayT;
    private int indice;

    //constructor
    public ArregloProducto() {
        ArrayT = new ArrayList<Producto>();
    }

    //metodo para el tamaño
    public int getTamaño() {
        return ArrayT.size();
    }

    //metodo para agregar facturas nueva
    public void agregar(Producto U) {
        ArrayT.add(U);
    }

    //metodo que devuelve el objeto factura
    public Producto obtener(int pos) {
        return ArrayT.get(pos);
    }

    //buscar Codigo
    public Producto BuscarID(String IDProducto) {
        for(int i=0;i<ArrayT.size();i++){
            if(IDProducto.equals(ArrayT.get(i).getIDProducto())){
                return ArrayT.get(i);
            }
        }
        return null;
    }
    
    
    public void eliminar(Producto x){
        ArrayT.remove(x);
    }
    
    public void GuardarTXT() {
        try {
            PrintWriter X = new PrintWriter(new FileWriter("MENU.txt"));
            for(int i=0;i<getTamaño();i++){
                X.println(obtener(i).getIDProducto()+ "," +obtener(i).getNombre() + "," + obtener(i).getCategoria()
                + "," + obtener(i).getPrecio()+ "," + obtener(i).getStock()+ "," + obtener(i).getEstado());
            }
            X.close();
            JOptionPane.showMessageDialog(null, "OPERACION EXITOSA");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Grabacion Exitosa","Aviso",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void CargarTXT(){ 
        try {
            File archivo = new File("MENU.txt");
            if (archivo.exists()) {
                BufferedReader br = new BufferedReader(new FileReader("MENU.txt"));

                String linea;

                while ((linea = br.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(linea, ",");
                    String IDMenu = st.nextToken().trim();
                    String Nombre = st.nextToken().trim();
                    String Categoria = st.nextToken().trim();
                    double Precio = Double.parseDouble(st.nextToken().trim());
                    int Stock = Integer.parseInt(st.nextToken().trim());
                    String Estado = st.nextToken().trim();
                    Producto x = new Producto(IDMenu, Nombre, Categoria, Precio, Stock, Estado);
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