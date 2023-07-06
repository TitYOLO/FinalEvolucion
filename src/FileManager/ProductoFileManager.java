package FileManager;
import Repository.IProductoRepository;
import java.io.*;
import java.util.StringTokenizer;
import FProductos.Producto;

public class ProductoFileManager {
    private static final String FILE_PATH = "MENU.txt";

    public void guardarProductos(IProductoRepository productoRepository) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_PATH))) {
            for (int i = 0; i < productoRepository.getTamaño(); i++) {
                Producto producto = productoRepository.obtener(i);
                writer.println(producto.getIDProducto() + "," + producto.getNombre() + "," +
                        producto.getCategoria() + "," + producto.getPrecio() + "," +
                        producto.getStock() + "," + producto.getEstado());
            }
            System.out.println("Productos guardados exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar los productos: " + e.getMessage());
        }
    }

    public void cargarProductos(IProductoRepository productoRepository) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String linea;

            while ((linea = reader.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, ",");
                String IDMenu = st.nextToken().trim();
                String Nombre = st.nextToken().trim();
                String Categoria = st.nextToken().trim();
                double Precio = Double.parseDouble(st.nextToken().trim());
                int Stock = Integer.parseInt(st.nextToken().trim());
                String Estado = st.nextToken().trim();
                Producto producto = new Producto(IDMenu, Nombre, Categoria, Precio, Stock, Estado) {
                    @Override
                    public double obtenerPrecio() {
                        throw new UnsupportedOperationException("Not supported yet.");
                    }
                };
                productoRepository.agregar(producto);
            }

            System.out.println("Productos cargados exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al cargar los productos: " + e.getMessage());
        }
    }
}
