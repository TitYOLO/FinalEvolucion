package Repository;

import pClases.Pedido;

public interface IPedidoRepository {
    int getTamaño();
    void agregar(Pedido U);
    Pedido obtener(int pos);
    Pedido buscarID(String IDPedido);
    void eliminar(Pedido x);
    void guardarPedidos();
    void cargarPedidos();
}
