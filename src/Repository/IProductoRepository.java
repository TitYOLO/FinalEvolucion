package Repository;

import FProductos.Producto;

public interface IProductoRepository {
    int getTamaño();
    void agregar(Producto U);
    Producto obtener(int pos);
    Producto buscarID(String IDProducto);
    void eliminar(Producto x);
    void guardarProductos();
    void cargarProductos();
}
