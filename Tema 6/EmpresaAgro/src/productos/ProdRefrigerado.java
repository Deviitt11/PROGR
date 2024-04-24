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
public class ProdRefrigerado extends Producto {
    
    // Atributos
    String codSuperv;
    Date fechaEnv;
    double tempRecom;
    String paisOrigen;
    
    // Constructor
    public ProdRefrigerado(String codSuperv, Date fechaEnv, double tempRecom, String paisOrigen, Date fechaCaducidad, int numLote) {
        super(fechaCaducidad, numLote);
        this.codSuperv = codSuperv;
        this.fechaEnv = fechaEnv;
        this.tempRecom = tempRecom;
        this.paisOrigen = paisOrigen;
    }
    
    // Setters y getters
    public String getCodSuperv() {
        return codSuperv;
    }

    public void setCodSuperv(String codSuperv) {
        this.codSuperv = codSuperv;
    }

    public Date getFechaEnv() {
        return fechaEnv;
    }

    public void setFechaEnv(Date fechaEnv) {
        this.fechaEnv = fechaEnv;
    }

    public double getTempRecom() {
        return tempRecom;
    }

    public void setTempRecom(double tempRecom) {
        this.tempRecom = tempRecom;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    
    
}
