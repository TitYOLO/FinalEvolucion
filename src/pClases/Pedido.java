package pClases;

public class Pedido {
    private String COD_Pedido;
    private String Fecha;
    private String Estado;
    private String COD_Cliente;
    private String Met_Pag;

    public Pedido(String COD_Pedido, String Fecha, String Estado, String COD_Cliente, String Met_Pag) {
        this.COD_Pedido = COD_Pedido;
        this.Fecha = Fecha;
        this.Estado = Estado;
        this.COD_Cliente = COD_Cliente;
        this.Met_Pag = Met_Pag;
    }

    public String getCOD_Pedido() {
        return COD_Pedido;
    }

    public void setCOD_Pedido(String COD_Pedido) {
        this.COD_Pedido = COD_Pedido;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getCOD_Cliente() {
        return COD_Cliente;
    }

    public void setCOD_Cliente(String COD_Cliente) {
        this.COD_Cliente = COD_Cliente;
    }

    public String getMet_Pag() {
        return Met_Pag;
    }

    public void setMet_Pag(String Met_Pag) {
        this.Met_Pag = Met_Pag;
    }

    
}
