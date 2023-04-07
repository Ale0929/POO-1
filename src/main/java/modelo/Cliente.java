/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author hgabr
 */
public class Cliente {
    private String nombre;
    private int cedula;
    private String correo;
    private int celular;
    private Tarjeta tarjeta;
    private ArrayList<Entrada> entradas;

    public Cliente(String nombre, int cedula, String correo, int celular, Tarjeta tarjeta) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.celular = celular;
        this.tarjeta = tarjeta;
        this.entradas = new ArrayList<Entrada>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getID() {
        return cedula;
    }

    public void setID(int ID) {
        this.cedula = ID;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", cédula=" + cedula + ", correo=" + correo + ", celular=" + celular + ", tarjeta=" + tarjeta + '}';
    }

    
}
