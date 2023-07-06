package FileManager;
import Repository.IDetPedidoRepository;
import java.io.*;
import java.util.StringTokenizer;
import pClases.DetPedido;

public class DetPedidoFileManager {
    private static final String FILE_PATH = "DETPEDIDO.txt";

    public void guardarDetPedidos(IDetPedidoRepository detpedidoRepository) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_PATH))) {
            for (int i = 0; i < detpedidoRepository.getTamaño(); i++) {
                DetPedido detpedido = detpedidoRepository.obtener(i);
                writer.println(detpedido.getCOD_Detalle()+ "," + detpedido.getCOD_Menu()+ "," +
                        detpedido.getCantidad());
            }
            System.out.println("DetPedidos guardados exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar los detpedidos: " + e.getMessage());
        }
    }

    public void cargarDetPedidos(IDetPedidoRepository detpedidoRepository) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String linea;

            while ((linea = reader.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, ",");
                String COD_Detalle = st.nextToken().trim();
                String COD_Menu = st.nextToken().trim();
                int Cantidad = Integer.parseInt(st.nextToken().trim());
                DetPedido detpedido = new DetPedido(COD_Detalle, COD_Menu, Cantidad);
                detpedidoRepository.agregar(detpedido);
            }

            System.out.println("DetPedidos cargados exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al cargar los detpedidos: " + e.getMessage());
        }
    }
}
