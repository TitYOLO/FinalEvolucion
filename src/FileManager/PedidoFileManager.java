package FileManager;
import Repository.IPedidoRepository;
import java.io.*;
import java.util.StringTokenizer;
import pClases.Pedido;

public class PedidoFileManager {
    private static final String FILE_PATH = "PEDIDO.txt";

    public void guardarPedidos(IPedidoRepository pedidoRepository) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_PATH))) {
            for (int i = 0; i < pedidoRepository.getTamaño(); i++) {
                Pedido pedido = pedidoRepository.obtener(i);
                writer.println(pedido.getCOD_Pedido()+ "," + pedido.getFecha()+ "," +
                        pedido.getEstado()+ "," + pedido.getCOD_Cliente()+ "," +
                        pedido.getMet_Pag());
            }
            System.out.println("Pedidos guardados exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar los pedidos: " + e.getMessage());
        }
    }

    public void cargarPedidos(IPedidoRepository pedidoRepository) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String linea;

            while ((linea = reader.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, ",");
                String CODPedido = st.nextToken().trim();
                String Fecha = st.nextToken().trim();
                String Estado = st.nextToken().trim();
                String COD_Cliente = st.nextToken().trim();
                String Met_Pag = st.nextToken().trim();
                Pedido pedido = new Pedido(CODPedido, Fecha, Estado, COD_Cliente, Met_Pag);
                pedidoRepository.agregar(pedido);
            }

            System.out.println("Pedidos cargados exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al cargar los pedidos: " + e.getMessage());
        }
    }
}
