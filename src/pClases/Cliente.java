/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pClases;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manue
 */
public class Cliente {
    private int codigo;
    private String nombreCliente;
    private String nombreProducto;
    private int cantidad;
    private int combos;
    private String fecha;

    public Cliente(int codigo, String nombreCliente, String nombreProducto, int cantidad, int combos, String fecha) {
        this.codigo = codigo;
        this.nombreCliente = nombreCliente;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.combos = combos;
        this.fecha = fecha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCombos() {
        return combos;
    }

    public void setCombos(int combos) {
        this.combos = combos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }






    public int combos1(){
        if(combos == 0 ){
             return 35;
        }
        else if(combos == 1){
             return 12;
        }
        else if(combos == 2){
            return 53;
        }
        else if(combos == 3){
             return 32;
        }
        else if(combos == 4){
           return 16;
        }
        else if(combos == 5){
            return 20;
        }
        else if(combos == 6){
           return 57;
        }
        else {
            return 37;
        }
    }
    
    public String nombreCombos(){
        if(combos == 0 ){
             return "Combo-1";
        }
        else if(combos == 1){
             return "Combo-2";
        }
        else if(combos == 2){
            return "Pollo-Entero";
        }
        else if(combos == 3){
             return "1/2-Pollo";
        }
        else if(combos == 4){
           return "1/4-Pollo";
        }
        else if(combos == 5){
            return "PROMO-1/4-POLLO-+-GASEOSA";
        }
        else if(combos == 6){
           return "PROMO-POLLO-ENTERO-+-1.5-GASEOSA";
        }
        else {
            return "PROMO-1/2-POLLO-PEPSI ";
        }
    }
    
    
    public double cantidadTotal(){
        return cantidad*combos1();
    }

    
    
    
}
