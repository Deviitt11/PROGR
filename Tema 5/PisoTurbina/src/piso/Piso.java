/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package piso;

import java.util.Date;
import vivienda.Vivienda;

/**
 *
 * @author ALUMNOS_FP
 */
public class Piso extends Vivienda{
    
    int numPlanta;
    char puerta;
    boolean ascensor;

    public Piso(int numPlanta, char puerta, boolean ascensor, double precio, Date antiguedad, String direccion, int superficie) {
        super(precio, antiguedad, direccion, superficie);
        this.numPlanta = numPlanta;
        this.puerta = puerta;
        this.ascensor = ascensor;
    }

    public Piso(int numPlanta, char puerta, double precio, String direccion, int superficie) {
        super(precio, direccion, superficie);
        this.numPlanta = numPlanta;
        this.puerta = puerta;
    }

    public int getNumPlanta() {
        return numPlanta;
    }

    public void setNumPlanta(int numPlanta) {
        this.numPlanta = numPlanta;
    }

    public char getPuerta() {
        return puerta;
    }

    public void setPuerta(char puerta) {
        this.puerta = puerta;
    }

    public boolean isAscensor() {
        return ascensor;
    }

    public void setAscensor(boolean ascensor) {
        this.ascensor = ascensor;
    }

    @Override
    public String toString() {
        return super.toString() + "Piso: " + 
                "\nnumPlanta: " + numPlanta +
                "\npuerta=" + puerta +
                "\nascensor=" + ascensor;
    }
    
    
    
}
