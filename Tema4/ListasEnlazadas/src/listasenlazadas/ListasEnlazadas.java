/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasenlazadas;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author ALUMNOS_FP
 */
public class ListasEnlazadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList<String> lista = new LinkedList<>();
        Scanner s = new Scanner(System.in);
        
        for (int i = 0; i < 100; i++) {
            // convert string to int
            String n = "7";
            int num = Integer.parseInt(n);
            
            // convertir int to String
            String o = Integer.toString(i);
            String val = String.valueOf(i);
            
            lista.add("i");  
        }
        
        // Recorrer el array y ponerlo todo en una línea
        for(String numero: lista){
            System.out.println(numero + " ");
        }
        
        HashSet<String> listaSet = new HashSet<>();
        String palabra = "";
        
        while (palabra.equals("fin")) {    
            palabra = s.nextLine();
            listaSet.add(palabra);
        }
        
        // Mostramos la lista
        for(String elemento: listaSet){
            System.out.println(elemento);
        }
    }
    
}
