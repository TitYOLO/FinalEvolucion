package FProductos;

public class Combo extends Producto {

    public Combo(String idProducto, String nombre, String categoria, double precio, int stock, String estado) {
        super(idProducto, nombre, categoria, precio, stock, estado);
    }

    @Override
    public double obtenerPrecio() {
        return super.getPrecio() - descuento();
    }

    private double descuento() {
        return super.getPrecio() * 0.2;
    }
}
