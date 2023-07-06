
import FProductos.IProducto;
import java.text.DecimalFormat;

public abstract class Producto implements IProducto {

    private String IDProducto;
    private String Nombre;
    private String Categoria;
    private double Precio;
    private int Stock;
    private String Estado;

    public Producto(String idProducto, String nombre, String categoria, double precio, int stock, String estado) {
        this.IDProducto = idProducto;
        this.Nombre = nombre;
        this.Categoria = categoria;
        this.Precio = precio;
        this.Stock = stock;
        this.Estado = estado;
    }

    // Getters y setters
    public String getIDProducto() {
        return IDProducto;
    }

    public void setIDProducto(String IDProducto) {
        this.IDProducto = IDProducto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        this.Categoria = categoria;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        this.Precio = precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        this.Stock = stock;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        this.Estado = estado;
    }
}

class PrecioFormatter {

    public static String formatearPrecio(double precio) {
        DecimalFormat df = new DecimalFormat("###0.00");
        return "S/" + df.format(precio);
    }
}
