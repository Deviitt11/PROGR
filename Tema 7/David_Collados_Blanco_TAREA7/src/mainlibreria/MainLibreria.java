/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainlibreria;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ALUMNOS_FP
 */
public class MainLibreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // EJERCICIO 1
        System.out.println("INICIO EJ 1");
        
        String nombreFichero = "ficheroPrueba.txt";
        String contenido = "COMUNICADO OFICIAL: Kylian Mbappe. El Real Madrid anuncia el fichaje del astro frances. Firmara por 5 temporadas con un salario de 25 millones de euros. Llevara el dorsal 10.";
        
        escritor.Escritor.escribirFichero(nombreFichero, contenido);
        System.out.println("FIN EJ 1");
        
        // EJERCICIO 2
        System.out.println("INICIO EJ 2");
        
        ArrayList<Integer> enteros = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        
        // pido numeros
        System.out.println("Introduce numeros (negativo para terminar): ");
       
        // voy leyendo los numeros
        while (true) {            
            int num = s.nextInt();
            
            // si es negativo, rompo
            if(num < 0) {
                break;
            }
            
            // añado los positivos
            enteros.add(num);
        }
        
        escritor.Escritor.escribirNumeros("ej_2.txt", enteros);
        System.out.println("FIN EJ 2");
        
        // EJERCICIO 3
        System.out.println("INICIO EJ 3");
        String palBuscada = "Madrid";
        System.out.println("La palabra: " + palBuscada + " aparece en la linea: " + lector.Lector.buscarPalabra(nombreFichero, palBuscada));
        System.out.println("FIN EJ 3");
        
        // EJERCICIO 4
        System.out.println("INICIO EJ 4");
        System.out.println("La palabra: " + palBuscada + " aparece: " + lector.Lector.contarPalabra(nombreFichero, palBuscada) + " veces");
        System.out.println("FIN EJ 4");
        
        // EJERCICIO 5
        System.out.println("INICIO EJ 5");
        System.out.println("Hay: " + lector.Lector.contarVocales(nombreFichero) + " vocales");
        System.out.println("FIN EJ 5");
        
        // EJERCICIO 6
        System.out.println("INICIO EJ 6");
        lector.Lector.leerFicheroCifrado(nombreFichero);
        System.out.println("FIN EJ 6");
        
        // EJERCICIO 7
        System.out.println("INICIO EJ 7");
        lector.Lector.leerFicheroDelimitado(nombreFichero);
        System.out.println("FIN EJ 7");
        
        
    }
    
}
