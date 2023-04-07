/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;


public class Auditorio {
    private int filas;
    private int columnas;
    private ArrayList<Evento> listaEventos;

    public Auditorio() {
        this.listaEventos = new ArrayList<Evento>();
    }

    public Evento getEvento(Evento e) {
        for (Evento evento : listaEventos) {
            if(evento.equals(e))
                return evento;
        }
        return null;
    }
    
    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }
    
    public ArrayList<Evento> getListaEventos() {
        return listaEventos;
    }

    public void setListaEventos(ArrayList<Evento> listaEventos) {
        this.listaEventos = listaEventos;
    }
}
