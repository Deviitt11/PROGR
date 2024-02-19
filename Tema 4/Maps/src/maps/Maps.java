/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maps;

import java.util.HashMap;

/**
 *
 * @author ALUMNOS_FP
 */
public class Maps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Añadimos valores 
        HashMap<Integer, String> alumnos = new HashMap<>();
        
        alumnos.put(1, "Pepe");
        alumnos.put(2, "Juan");
        alumnos.put(3, "Lope");
        alumnos.put(4, "Ramón");
        alumnos.put(5, "Julín");
        
        // Obtener valor a partir de la clave
        alumnos.get(3);
        
        // Reemplazo un valor
        alumnos.put(2, "Paco");
        
        // Eliminar un valor
        alumnos.remove(1);
        
        // Recorrer el mapa por valores
        for(String valor: alumnos.values()) {
            System.out.println("Valores: " + valor);
        }
        
        // Recorrer el mapa por claves
        for(Integer key: alumnos.keySet()){
            System.out.println("Claves: " + key + ", valor: " + alumnos.get(key));
        }
        
        alumnos.clear();
        alumnos.size();
        alumnos.isEmpty();
        
        //////////////////////////////////////////////////////////////////////
        
        HashMap<String, String> personasVivas = new HashMap<>();
        
        personasVivas.put("12345678B", "NachinGunKelly");
        
        
        
    }
    
}
