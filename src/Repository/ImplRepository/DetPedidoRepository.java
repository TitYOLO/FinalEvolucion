package Repository.ImplRepository;
import FileManager.DetPedidoFileManager;
import pClases.DetPedido;
import Repository.IDetPedidoRepository;
import java.util.ArrayList;

public class DetPedidoRepository implements IDetPedidoRepository{

    private ArrayList<DetPedido> ArrayT;
    private DetPedidoFileManager fileManager;

    public DetPedidoRepository(DetPedidoFileManager fileManager) {
        ArrayT = new ArrayList<>();
        this.fileManager = fileManager;
    }

    public int getTamaño() {
        return ArrayT.size();
    }

    public void agregar(DetPedido U) {
        ArrayT.add(U);
    }

    public DetPedido obtener(int pos) {
        return ArrayT.get(pos);
    }
    public void eliminar(DetPedido x){
        ArrayT.remove(x);
    }

    @Override
    public DetPedido buscarID(String IDDetPedido) {
        for(int i=0;i<ArrayT.size();i++){
            if(IDDetPedido.equals(ArrayT.get(i).getCOD_Detalle())){
                return ArrayT.get(i);
            }
        }
        return null;
    }
    
    @Override
    public DetPedido BuscarCODIDM(String C_V, String ID_M){
        for(int i=0;i<ArrayT.size();i++){
            if( C_V.equals(ArrayT.get(i).getCOD_Detalle()) && ID_M.equals(ArrayT.get(i).getCOD_Menu())){
                return ArrayT.get(i);
            }
        }
        return null;
    }
    
    public void guardarDetPedidos() {
        fileManager.guardarDetPedidos(this);
    }
    
    public void cargarDetPedidos(){
        fileManager.cargarDetPedidos(this);
    }
}