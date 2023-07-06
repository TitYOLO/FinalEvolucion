package FProductos;

public class Normal extends Producto {

        public Normal(String idProducto, String nombre, String categoria, double precio, int stock, String estado) {
            super(idProducto, nombre, categoria, precio, stock, estado);
        }

        @Override
        public double obtenerPrecio() {
            return super.getPrecio() * 0.95;
        }
    }