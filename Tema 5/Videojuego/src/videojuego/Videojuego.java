/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package videojuego;

import guerrero.Guerrero;

import brujo.Brujo;
import java.util.ArrayList;

import personaje.Personaje;


/**
 *
 * @author ALUMNOS_FP
 */
public class Videojuego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Guerrero ragnar = new Guerrero(50, "4534G", 100, 80, "Ragnar");
        
        Brujo Quini = new Brujo(120, "3454HD", 90, 20, "Quini");
        
        Personaje aldeano = new Personaje("FEVE", 20, 5, "Julín");
        
        // Creamos arrayList
        ArrayList<Personaje> personajes = new ArrayList<>();
        
        // Añadimos objetos a arraylist
        personajes.add(aldeano);
        personajes.add(Quini);
        personajes.add(aldeano);
        
        // Mostrar objetos arrayl
        for(Personaje p: personajes){
            p.mostrarPers();
        }
        
        ragnar.atacar(ragnar);
        
        Quini.lanzarHechizo(0, Quini);
        
        
    }
    
}
