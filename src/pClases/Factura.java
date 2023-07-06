package pClases;

import Repository.IProductoRepository;
import FProductos.Producto;

public class Factura {
    private IProductoRepository productoRepository;

    public Factura(IProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    public double obtenerTotal(Iterable<Producto> productos) {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.obtenerPrecio();
        }
        return total;
    }
}
