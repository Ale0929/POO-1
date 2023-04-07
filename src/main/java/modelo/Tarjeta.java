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
public class Tarjeta {
    private int digitosTarjeta;
    private Calendar fechaVencimiento;
    private int codigoVerficacion;

    public Tarjeta(int digitosTarjeta, Calendar fechaVencimiento, int codigoVerficacion) {
        this.digitosTarjeta = digitosTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.codigoVerficacion = codigoVerficacion;
    }
    
    
}
