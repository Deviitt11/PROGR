/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mapa;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Mapa {
    
    // OPCIÓN 8: AÑADIR ELEMENTO A MAPA
    // Esta opción pedirá al usuario que introduzca una palabra. 
    // La palabra introducida debe añadirse al HashMap. 
    // Nota: el HashMap tendrá como clave un número entero y cada elemento añadido tendrá el número que indicará el orden en el que se ha añadido (contador comenzando desde 1).
    public static void incluyeElemento(HashMap<Integer, String> mapa, int contador){ // Recibe como parámetros el hashMap y un contador para la clave
       
        Scanner s = new Scanner(System.in); // Creamos el objeto Scanner para leer la palabra
        System.out.println("Introduce una palabra: "); // Mensaje para que el usuario introduzca la palabra
        String palabra = s.nextLine(); // Leemos la palabra
        
        contador++; // aumentamos el contador, sirve como ID para cada palabra, ya que cada una tiene un valor único (según el orden en que se introduce)
        mapa.put(contador, palabra); // Añadimos la palabra a nuestro HashMap, junto a su respectivo contador    
    }
    
    // OPCIÓN 9: VACIAR MAPA
    // Esta opción vaciará el mapa eliminando todos los elementos que contenga.
    public static void vaciaMapa(HashMap<Integer, String> mapa){ // Recibe el hashMap como parámetro
        
        if(mapa.isEmpty()){ // Si nuestro mapa está vacío, mensaje para el usuario
            System.out.println("Primero se debe rellenar con valores la estructura de almacenamiento\n");      
        }
        else {
            mapa.clear(); // Limpiamos el mapa con el método clear
            System.out.println("El mapa ha sido vacíado correctamente"); // Mensaje para el usuario   
        }
    }
    
    // OPCIÓN 10: MOSTRAR MAPA
    // Esta opción debe recorrer e imprimir la clave y valor de todos los elementos del mapa.
    public static void muestraMapa(HashMap<Integer, String> mapa){ // Recibe como parámetro el hashMap
        
        if(mapa.isEmpty()){ // Si nuestro mapa está vacío, mensaje para el usuario
            System.out.println("Primero se debe rellenar con valores la estructura de almacenamiento\n");      
        }
        else{
            for (Integer key : mapa.keySet()) { // Bucle for each para recorrer por clave las palabras del mapa
                        System.out.println("Clave: " + key + ", Valor: " + mapa); // Imprimimos cada clave junto a su palabra
            }
        }
    }
}
