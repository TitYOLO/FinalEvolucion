package pClases;

import java.text.DecimalFormat;

public class PrecioFormatter {

    public static String formatearPrecio(double precio) {
        DecimalFormat df = new DecimalFormat("###0.00");
        return "S/" + df.format(precio);
    }
}
