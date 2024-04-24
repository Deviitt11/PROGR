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
public class ProdCongelado extends Producto {
    
    // Atributos
    Date fechaEnv;
    String paisOrig;
    double tempRecom;
    
    // Constructor
    public ProdCongelado(Date fechaEnv, String paisOrig, double tempRecom, Date fechaCaducidad, int numLote) {
        super(fechaCaducidad, numLote);
        this.fechaEnv = fechaEnv;
        this.paisOrig = paisOrig;
        this.tempRecom = tempRecom;
    }
    
    //Setters y getters
    public Date getFechaEnv() {
        return fechaEnv;
    }

    public void setFechaEnv(Date fechaEnv) {
        this.fechaEnv = fechaEnv;
    }

    public String getPaisOrig() {
        return paisOrig;
    }

    public void setPaisOrig(String paisOrig) {
        this.paisOrig = paisOrig;
    }

    public double getTempRecom() {
        return tempRecom;
    }

    public void setTempRecom(double tempRecom) {
        this.tempRecom = tempRecom;
    }
    
    
    
    
}
