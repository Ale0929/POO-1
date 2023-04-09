/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/*
 * @author hgabr
 */
public class Asiento {
    private Cliente cliente;
    private boolean activo = false;
    private String ID;
    
    //CONSTRUCTORS
    public Asiento(String ID) {
        this.ID = ID;
    }
    
    //SETTERS
    public void setCliente(Cliente pasajero) {
        this.cliente = pasajero;
    }
    
    public void setIsActive() {
        if (!this.activo)
            this.activo = true;
        this.activo = false;
    }
    
    public void setIsActive(boolean value) {
        this.activo = (value);
    }
    
    public void setString(String ID) {
        this.ID = ID;
    }
    
    //GETTERS
    public Cliente getCliente() {
        return cliente;
    }
    
    public boolean isActive(){
        return activo;
    }
    
    public String getID() {
        return ID;
    }
    
    
    //METHODS
    public Cliente getPasajero() {
        if (this.cliente == null)
            return null;
        return cliente;
    }  
    
    
    
    public String getAsiento() {
        if (this.cliente == null)
            return "Vacio";
        else
            return this.cliente.toString();
        
    }
}
