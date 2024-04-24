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
public class ProdFresco extends Producto {
    
    // Atributos
    Date fechaEnv;
    String paisOrigen;

    // Constructor
    public ProdFresco(Date fechaEnv, String paisOrigen, Date fechaCaducidad, int numLote) {
        super(fechaCaducidad, numLote);
        this.fechaEnv = fechaEnv;
        this.paisOrigen = paisOrigen;
    }
    
    // Setters y getters
    public Date getFechaEnv() {
        return fechaEnv;
    }

    public void setFechaEnv(Date fechaEnv) {
        this.fechaEnv = fechaEnv;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
}
