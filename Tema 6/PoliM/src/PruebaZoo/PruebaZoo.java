/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PruebaZoo;

import animales.*;

/**
 *
 * @author ALUMNOS_FP
 */
public class PruebaZoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Avestruz ostrich = new Avestruz();
        Gato gatucu = new Gato();
        Loro guacamayo = new Loro();
        Murcielago zubat = new Murcielago();
        Perro xanxez = new Perro();
        
        if(gatucu instanceof Gato) {
            System.out.println("SI");
        }
        
    }
    
}
