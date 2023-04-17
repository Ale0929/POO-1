/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author hgabr
 */
public class Funcion {
    private Calendar fecha;
    private int hora;
    private int minuto;
    private Asiento matrizAsiento[][];
    
    public Funcion(Calendar fecha, int hora, int minuto, int cantFilas, int cantColumnas){
        this.fecha = fecha;
        this.hora = hora;
        this.minuto = minuto;
        matrizAsiento = new Asiento[cantFilas][cantColumnas];
        
        String string = ""; char ch = 'a';    
        for (int row=0; row < matrizAsiento.length; row++){  
            for (int col=0; col < matrizAsiento[0].length; col++){
                string = ch + string;
                string += Integer.toString(col + 1);
                matrizAsiento[row][col] = new Asiento(string);
                matrizAsiento[row][col].setIsActive(true);
                string = "";
            }
            ch++;
        }
    }
    
    public void setFecha(int dia, int mes, int año) {
        fecha = new GregorianCalendar(año, mes-1, dia);
    }
    
    public void setHora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }
    
    public static String formatearFecha(Calendar unaFecha){
        String resultado;
        Date fecha = unaFecha.getTime();  //convertimos el Calendar Object a Date Object
        SimpleDateFormat dFormat = new SimpleDateFormat("dd/M/yyyy"); //define el formato utilizando SimpleDateFormat
        resultado = dFormat.format(fecha);
        return resultado;
    }
    
    public String getFecha () {
        return formatearFecha(fecha);
    }
    
    public String getHora() {
        String time = "";
        if (this.hora<10)
            time+="0";
        time+=this.hora+":";
        if (this.minuto<10)
            time+="0";
        time+=this.minuto;
        return time;
    }

    public Asiento[][] getMatrizAsiento() {
        return matrizAsiento;
    }
    
    public void setMatrizAsiento(Asiento[][] matrizAsiento) {
        this.matrizAsiento = matrizAsiento;
    }
    
    
    public boolean yaVendio() {
        for (int i = 0; i < matrizAsiento.length; i++) {
            for (int j = 0; j < matrizAsiento[0].length; j++) {
                if (matrizAsiento[i][j].isActive())
                    return true;
            }
        }
        return false;
    }
    
    public int cantidadDisponibles(){
        int cantidad = 0;
        for (int i = 0; i < matrizAsiento.length; i++) {
            for (int j = 0; j < matrizAsiento[0].length; j++) {
                if (!matrizAsiento[i][j].isActive())
                    cantidad+=1;
            }
        }
        return cantidad;
    }
}
