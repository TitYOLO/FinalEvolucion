package pClases;

public class DetPedido {
    private String COD_Detalle;
    private String COD_Menu;
    private int Cantidad;

    public DetPedido(String COD_Detalle, String COD_Menu, int Cantidad) {
        this.COD_Detalle = COD_Detalle;
        this.COD_Menu = COD_Menu;
        this.Cantidad = Cantidad;
    }

    public String getCOD_Detalle() {
        return COD_Detalle;
    }

    public void setCOD_Detalle(String COD_Detalle) {
        this.COD_Detalle = COD_Detalle;
    }

    public String getCOD_Menu() {
        return COD_Menu;
    }

    public void setCOD_Menu(String COD_Menu) {
        this.COD_Menu = COD_Menu;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
}
