package Repository.ImplRepository;
import FileManager.PedidoFileManager;
import pClases.Pedido;
import Repository.IPedidoRepository;
import java.util.ArrayList;

public class PedidoRepository implements IPedidoRepository{

    private ArrayList<Pedido> ArrayT;
    private PedidoFileManager fileManager;

    public PedidoRepository(PedidoFileManager fileManager) {
        ArrayT = new ArrayList<>();
        this.fileManager = fileManager;
    }

    public int getTamaño() {
        return ArrayT.size();
    }

    public void agregar(Pedido U) {
        ArrayT.add(U);
    }

    public Pedido obtener(int pos) {
        return ArrayT.get(pos);
    }
    public void eliminar(Pedido x){
        ArrayT.remove(x);
    }

    @Override
    public Pedido buscarID(String IDPedido) {
        for(int i=0;i<ArrayT.size();i++){
            if(IDPedido.equals(ArrayT.get(i).getCOD_Pedido())){
                return ArrayT.get(i);
            }
        }
        return null;
    }
    
    public void guardarPedidos() {
        fileManager.guardarPedidos(this);
    }
    
    public void cargarPedidos(){
        fileManager.cargarPedidos(this);
    }
}