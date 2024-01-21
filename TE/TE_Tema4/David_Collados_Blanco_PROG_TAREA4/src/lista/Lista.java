/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Lista {
    
    // OPCIÓN 4: RELLENAR LISTA
    // Esta opción pedirá al usuario que introduzca palabras y que introduzca una cadena vacía para finalizar. 
    // Primero se deberá vaciar la lista. Luego, cada palabra introducida se irá añadiendo a la lista (la cadena vacía no debe añadirse).
    public static void rellenaLista(ArrayList<String> listaPal){ // Recibe como parámetro una lista
        
        Scanner s = new Scanner(System.in); // Creamos un objeto Scanner para leer lo que introduce el usuario
        String finCad = "Hola"; // variable para la cadena por defecto "Hola"
        
        listaPal.clear(); // Primero se vacía la lista antes de empezar a pedir palabras
        
        while(! finCad.equals("")){ // Mientras no se introduzca una cadena vacía, se siguen pidiendo palabras
                     
            System.out.println("Introduce una palabra (o introduce una cadena vacia para finalizar): "); // Mensaje para el usuario
            finCad = s.nextLine(); // Se lee la palabra
            
            listaPal.add(finCad); // Cada palabra se va añadiendo a la lista
        }
        
    }
    
    // OPCIÓN 5: ORDENAR LISTA
    // Está opción debe ordenar la lista por orden alfabético.
    public static void ordenaLista(ArrayList<String> listaPal){ // Recibe como parámetro una lista
        Collections.sort(listaPal); // El método sort ordena la lista por orden alfabético
    }
     
    // OPCIÓN 6: MOSTRAR PALABRA MÁS LARGA
    // Está opción debe buscar y mostrar por pantalla la palabra que tenga más caracteres (en caso de empate proceder de la manera que se quiera).
    public static void palabraMasLarga(ArrayList<String> listaPal) { // Recibe como parámetro una lista
        
        String larga = null; // Creamos una variable para almacenar la palabra más larga
        
        for(String palabra: listaPal){ // Bucle for each para recorrer la lista
            larga = listaPal.getFirst(); // Se toma la primera palabra como la larga
            if(palabra.length() >= larga.length()){ // Si una palabra es mayor que la larga, se comparan sus longitudes y se machaca la variable, actualizándola con la más larga
                larga = palabra;
            }
        }
        System.out.println("La palabra mas larga es: " + larga + "\n"); // Imprimimos la palabra más larga
    }
    
    // OPCIÓN 7: MOSTRAR LISTA
    // Esta opción debe mostrar los valores de la lista.
    public static void muestraLista(ArrayList<String> listaPal){ // Recibe como parámetro una lista
        for(String palabra: listaPal){ // Bucle for each para recorrer la lista
            System.out.println(palabra + ""); // Imprimimos cada elemento
        }
        System.out.println(""); // Salto de línea
    }
    
}
