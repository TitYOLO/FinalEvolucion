package FProductos;

public class ProductoAsignacion {

    public static Producto crearProducto(String codigo, String nombre, String categoria, double precio) {
        if (categoria.equals("Combo")) {
            return new Combo(codigo, nombre, categoria, precio, 5, "Disponible");
        } else if (categoria.equals("Bebida")) {
            return new Bebida(codigo, nombre, categoria, precio, 5, "Disponible");
        } else {
            return new Normal(codigo, nombre, categoria, precio, 5, "Disponible");
        }
    }
}
