
package pClases;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;



public class ArregloCliente {
    private ArrayList <Cliente> fact;
    private int indice;
    
     Cliente p;
   Cliente rp;
   
 public void cargar_txt(){  
        try{
     File ruta = new File("Vendedor1.txt");
     if(!ruta.exists()){
        ruta.createNewFile();
     }
     if(ruta.exists()){
          BufferedReader bu = new BufferedReader(new FileReader("Vendedor1.txt"));           
            String linea = "";
            while((linea = bu.readLine())!=null){
                StringTokenizer st = new StringTokenizer(linea,",");
                String Nom = st.nextToken().trim();
                String NomPro = st.nextToken().trim();
                int cant = Integer.parseInt(st.nextToken().trim());
                int Precio = Integer.parseInt(st.nextToken().trim());
                int cod = Integer.parseInt(st.nextToken().trim());
                String fecha = st.nextToken().trim();
                Cliente x = new Cliente(cod,Nom,NomPro,Precio,cant,fecha);
                agregar(x);
            } 
            bu.close();
     }
        }catch(Exception ex){
             JOptionPane.showMessageDialog(null,"Error al cargar archivo: "+ex.getMessage());
            System.out.println(ex.getMessage());
        }
    }
    
    
        public void grabar_txt(){
        try{
           PrintWriter pw = new PrintWriter(new FileWriter("Vendedor1.txt"));
           for(int i = 0 ; i < getTamaño();i++){
               pw.println(obtener(i).getNombreCliente()+","+
               obtener(i).getNombreProducto()+","+       
               obtener(i).getCantidad()+","+
               obtener(i).getCombos()+","+
               obtener(i).getCodigo()+","+
               obtener(i).getFecha());
           }
           pw.close();
        }catch(Exception ex ){
            JOptionPane.showMessageDialog(null,"Error no se guardaron los datos  de : "+ex.getMessage());
            System.out.println(ex.getMessage());      
        }
    }
    
    public ArregloCliente(){
        fact = new ArrayList<Cliente>();
        cargar_txt();
    }
    
    public int getTamaño(){
        return fact.size();
    }
    
    public void agregar(Cliente F){
        fact.add(F);
    }
    
    public Cliente obtener(int pos){
        return fact.get(pos);
    }
    
    public Cliente buscar(int num){
        for(Cliente f: fact)
            if(f.getCodigo() == num)
                return f;
        return null;
    }
    
    public void eliminar(Cliente x){
        fact.remove(x);
    }

 
    

    
    
    
}
