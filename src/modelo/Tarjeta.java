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
public class Tarjeta {
    private int digitosTarjeta;
    private Calendar fechaVencimiento;
    private int codigoVerficacion;

    public Tarjeta(int digitosTarjeta, Calendar fechaVencimiento, int codigoVerficacion) {
        this.digitosTarjeta = digitosTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.codigoVerficacion = codigoVerficacion;
    }
    
    public int getDigitosTarjeta() {
        return digitosTarjeta;
    }

    public void setDigitosTarjeta(int digitosTarjeta) {
        this.digitosTarjeta = digitosTarjeta;
    }

    public Calendar getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Calendar fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getCodigoVerficacion() {
        return codigoVerficacion;
    }

    public void setCodigoVerficacion(int codigoVerficacion) {
        this.codigoVerficacion = codigoVerficacion;
    }
    
    public String getLastFour() {
        String converted = String.valueOf(digitosTarjeta);
        String resultado = "";
        for (int i = 12; i <= converted.length(); i++) {
            resultado+=converted.charAt(i);
        }
        return resultado;
    }
}
