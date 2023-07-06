package Repository.ImplRepository;
import FileManager.ProductoFileManager;
import FProductos.Producto;
import Repository.IProductoRepository;
import java.util.ArrayList;

public class ProductoRepository implements IProductoRepository{

    private ArrayList<Producto> ArrayT;
    private ProductoFileManager fileManager;

    public ProductoRepository(ProductoFileManager fileManager) {
        ArrayT = new ArrayList<>();
        this.fileManager = fileManager;
    }

    public int getTamaño() {
        return ArrayT.size();
    }

    public void agregar(Producto U) {
        ArrayT.add(U);
    }

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