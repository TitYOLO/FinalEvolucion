package Repository;

import pClases.Cliente;

public interface IClienteRepository {
    int getTamaño();
    void agregar(Cliente U);
    Cliente obtener(int pos);
    Cliente buscarID(String IDCliente);
    void eliminar(Cliente x);
    void guardarCliente();
    void cargarCliente();
}
