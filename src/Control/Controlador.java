/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import modelo.Auditorio;

/**
 *
 * @author hgabr
 */
public class Controlador {
    //FALTA CREAR COPY PASTEAR TODOS LOS METODOS CREADOS EN LAS OTRAS CLASES
    //PARA QUE TODO SEA LLAMADO DESDE EL CONTROLADOR
    private static Auditorio auditorio = new Auditorio();
    private AdmClientes clientes;

    public Controlador(AdmClientes clientes) {
        this.clientes = clientes;
    }

    public Controlador () {
        clientes = new AdmClientes();
    }

    public static Auditorio getAuditorio() {
        return auditorio;
    }

    public static void setAuditorio(Auditorio auditorio) {
        Controlador.auditorio = auditorio;
    }
    
    public AdmClientes getClientes() {
        return clientes;
    }

    public void setClientes(AdmClientes clientes) {
        this.clientes = clientes;
    }
    
    
}
