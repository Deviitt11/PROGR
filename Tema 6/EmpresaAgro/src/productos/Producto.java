/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos;

import java.util.Date;

/**
 *
 * @author david
 */
public abstract class Producto {
    
    // Atributos
    Date fechaCaducidad;
    int numLote;
    
    // Constructor
    public Producto(Date fechaCaducidad, int numLote) {
        this.fechaCaducidad = fechaCaducidad;
        this.numLote = numLote;
    }
    
    // Setters y getters
    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getNumLote() {
        return numLote;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }  
}
