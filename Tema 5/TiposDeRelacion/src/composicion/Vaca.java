/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicion;

import animales.AnimalGranja;

/**
 *
 * @author ALUMNOS_FP
 */
public class Vaca extends AnimalGranja{
    
    int litrosLeche;
    Cencerro cencerro = new Cencerro("11111");

    public int getLitrosLeche() {
        return litrosLeche;
    }

    public void setLitrosLeche(int litrosLeche) {
        this.litrosLeche = litrosLeche;
    }

    public Cencerro getCencerro() {
        return cencerro;
    }

    public void setCencerro(Cencerro cencerro) {
        this.cencerro = cencerro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    

    public Vaca(int litrosLeche, String nombre, double peso) {
        super(nombre, peso);
        this.litrosLeche = litrosLeche;
    }
    
    public Vaca(int litrosLeche, Cencerro cencerro, String nombre, double peso) {
        super(nombre, peso);
        this.litrosLeche = litrosLeche;
        this.cencerro = cencerro;
    }
    
    
    
    
    
}
