/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author hgabr
 */

import java.util.ArrayList;

public class Evento {
    private String nombre;
    private ArrayList<Funcion> listaFunciones;
    private double precio;

    public Evento(String nombre, ArrayList<Funcion> listaFunciones, double precio) {
        this.nombre = nombre;
        this.listaFunciones = listaFunciones;
        this.precio = precio;
    }
    
    public Funcion getFuncion(Funcion f) {
        for (Funcion funcion : listaFunciones) {
            if(funcion.equals(f))
                return funcion;
        }
        return null;
    }
    
    public boolean yaVendio() {
        for (Funcion funcion : listaFunciones) {
            if(funcion.yaVendio()){
                return true;
            }
        }
        return false;
    }
    
    public int cantidadDisponibles() {
        int cantidad = 0;
        for (Funcion funcion : listaFunciones) {
            cantidad+=funcion.cantidadDisponibles();
        }
        return cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Funcion> getListaFunciones() {
        return listaFunciones;
    }

    public void setListaFunciones(ArrayList<Funcion> listaFunciones) {
        this.listaFunciones = listaFunciones;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public double getPrecioSinIVA() {
        return (precio*100)/113;
    }
}
