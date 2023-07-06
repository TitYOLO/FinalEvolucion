package Repository.ImplRepository;
import FileManager.ClienteFileManager;
import pClases.Cliente;
import Repository.IClienteRepository;
import java.util.ArrayList;

public class ClienteRepository implements IClienteRepository{

    private ArrayList<Cliente> ArrayT;
    private ClienteFileManager fileManager;

    public ClienteRepository(ClienteFileManager fileManager) {
        ArrayT = new ArrayList<>();
        this.fileManager = fileManager;
    }

    public int getTamaño() {
        return ArrayT.size();
    }

    public void agregar(Cliente U) {
        ArrayT.add(U);
    }

    public Cliente obtener(int pos) {
        return ArrayT.get(pos);
    }
    public void eliminar(Cliente x){
        ArrayT.remove(x);
    }

    @Override
    public Cliente buscarID(String IDCliente) {
        for(int i=0;i<ArrayT.size();i++){
            if(IDCliente.equals(ArrayT.get(i).getCodigo())){
                return ArrayT.get(i);
            }
        }
        return null;
    }
    
    public void guardarCliente() {
        fileManager.guardarClientes(this);
    }
    
    public void cargarCliente(){
        fileManager.cargarClientes(this);
    }
}