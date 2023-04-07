/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Calendar;


/**
 *
 * @author hgabr
 */
public class Factura {
    private int numero;
    private Calendar fecha;
    private Cliente cliente;
    private double totalCompra;
    
    private static int identificador = 1;

    public Factura(Calendar fecha, Cliente cliente, double totalCompra) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.totalCompra = totalCompra;
        setNum();
    }
    
    private void setNum() {
        this.numero = identificador;
         identificador++;
    }
    
}
