/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author ALUMNOS_FP
 */
public class Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HashMap<Integer, String> mapa = new HashMap<Integer, String>();
        addElement(mapa);
        showMapa(mapa);
        
        
    }
    
    public static void limpiarMapa(HashMap<Integer, String> mapa){
        mapa.clear();
    }
    
    public static HashMap<Integer, String> addElement (HashMap<Integer, String> mapa){
        int contador = 0;
        
        contador++;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce una palabra: ");
        String palabra = s.nextLine();
        
        mapa.put(contador, palabra);
        
        return mapa;
    }
    
    public static void showMapa(HashMap<Integer, String> mapa) {
        
        mapa.values();
        mapa.keySet();
        
        for(String valor: mapa.values()) {
            System.out.println(valor);
        }
        
        for(Integer key: mapa.keySet()){
            System.out.println("Clave" + key + ", valor: " + mapa.get(key));
        }
    }
}
