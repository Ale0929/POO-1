/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.util.ArrayList;
import Modelo.Cliente;

/**
 *
 * @author hgabr
 */
public class AdmClientes {
    private ArrayList<Cliente> clientes;

    public AdmClientes() {
        this.clientes = new ArrayList<Cliente>();
    }
    
    public void añadirCliente(Cliente nuevo) {
        clientes.add(nuevo);
    }
}
