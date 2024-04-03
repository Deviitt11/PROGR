/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pisoturbina;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import vivienda.GestorViviendas;
import vivienda.Piso;
import vivienda.Vivienda;

/**
 *
 * @author ALUMNOS_FP
 */
public class PisoTurbina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // ARRAYLIST
        ArrayList<Vivienda> viviendaEnLaCalle = new ArrayList<>();
        
        // MAPA
        HashMap<Integer, Vivienda> mapaViviendas;
        
        //Objetos piso con bucle
        //Piso p = new Piso(5, 'A', 150000, "Calle corrida", 120);
        
        GestorViviendas gestor = new GestorViviendas();
        
        gestor.generarViviendas(viviendaEnLaCalle, 10);
        
        
    }
    
    public static void addVivienda(ArrayList<Vivienda> viviendas) {
        Piso p1 = new Piso(5, 'A', 5000, "Calle Corrida", 200);
        Piso p2 = new Piso(5, 'A', 5000, "Calle Corrida", 200);
        Piso p3 = new Piso(5, 'A', 5000, "Calle Corrida", 200);
        
        ArrayList<Vivienda> viviendas1 = new ArrayList<>();
        ArrayList<Integer> intList = new ArrayList<>();
        
        // añadir varios objetos a una lista
        Collections.addAll(viviendas1, p1, p2, p3);
        
        // iniciar lista con varios objetos 
        ArrayList<Vivienda> viviendas2 = new ArrayList<>(Arrays.asList(p1, p2, p3));
        
        ArrayList<Vivienda> viviendas3 = new ArrayList<>(viviendas1);
        
                
    }
    
}
