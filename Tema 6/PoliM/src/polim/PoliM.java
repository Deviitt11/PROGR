/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polim;

import animales.Animal;
import animales.Gato;
import animales.Perro;

/**
 *
 * @author ALUMNOS_FP
 */
public class PoliM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal animal = new Gato();
        animal.hablar();
        
        animal = new Perro();
        animal.hablar();
        
        
    }
    
}
