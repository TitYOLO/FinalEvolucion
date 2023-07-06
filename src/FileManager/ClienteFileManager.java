package FileManager;
import Repository.IClienteRepository;
import java.io.*;
import java.util.StringTokenizer;
import pClases.Cliente;

public class ClienteFileManager {
    private static final String FILE_PATH = "PEDIDO.txt";

    public void guardarClientes(IClienteRepository clienteRepository) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_PATH))) {
            for (int i = 0; i < clienteRepository.getTamaño(); i++) {
                Cliente cliente = clienteRepository.obtener(i);
                writer.println(cliente.getCodigo()+ "," + cliente.getNombre());
            }
            System.out.println("Clientes guardados exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar los clientes: " + e.getMessage());
        }
    }

    public void cargarClientes(IClienteRepository clienteRepository) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String linea;

            while ((linea = reader.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, ",");
                String CODCliente = st.nextToken().trim();
                String Nombre = st.nextToken().trim();
                Cliente cliente = new Cliente(CODCliente, Nombre);
                clienteRepository.agregar(cliente);
            }

            System.out.println("Clientes cargados exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al cargar los clientes: " + e.getMessage());
        }
    }
}
