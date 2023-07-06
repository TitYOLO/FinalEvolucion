package pClases;

public class Cliente {
    private String codigo;
    private String Nombre;

    public Cliente(String codigo, String Nombre) {
        this.codigo = codigo;
        this.Nombre = Nombre;
    }

    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
}
