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
