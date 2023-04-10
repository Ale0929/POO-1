/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

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
    private double totalSinIVA;
    private final int iva = 13;
    
    private static int identificador = 1;

    public Factura(Calendar fecha, Cliente cliente, double totalCompra, double totalSinIVA) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.totalCompra = totalCompra;
        this.totalSinIVA = totalSinIVA;
        setNum();
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }
    
    private void setNum() {
        this.numero = identificador;
         identificador++;
    }
    
    public String getDetalleTotalCompra() {
        String resultado = "";
        resultado += "Total sin IVA: " + String.valueOf(totalSinIVA) + "\n";
        resultado += "IVA: " + String.valueOf(iva) + "\n";
        resultado += "Total con IVA: " + String.valueOf(totalCompra);
        return resultado;
    }
    
}
