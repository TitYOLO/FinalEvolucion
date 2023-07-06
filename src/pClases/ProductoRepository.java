package pClases;
import FProductos.Producto;
import Repository.IProductoRepository;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class ProductoRepository implements IProductoRepository{

    private ArrayList<Producto> ArrayT;
    private ProductoFileManager fileManager;
    private int indice;

    //constructor
    public ProductoRepository(ProductoFileManager fileManager) {
        ArrayT = new ArrayList<>();
        this.fileManager = fileManager;
        fileManager.cargarProductos(this);
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
    public void eliminar(Producto x){
        ArrayT.remove(x);
    }

    @Override
    public Producto buscarID(String IDProducto) {
        for(int i=0;i<ArrayT.size();i++){
            if(IDProducto.equals(ArrayT.get(i).getIDProducto())){
                return ArrayT.get(i);
            }
        }
        return null;
    }
    
    public void guardarProductos() {
        fileManager.guardarProductos(this);
    }
    
    public void cargarProductos(){
        fileManager.cargarProductos(this);
    }
}