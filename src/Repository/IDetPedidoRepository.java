package Repository;

import pClases.DetPedido;

public interface IDetPedidoRepository {
    int getTamaño();
    void agregar(DetPedido U);
    DetPedido obtener(int pos);
    DetPedido buscarID(String IDDetPedido);
    DetPedido BuscarCODIDM(String C_V, String ID_M);
    void eliminar(DetPedido x);
    void guardarDetPedidos();
    void cargarDetPedidos();
}
