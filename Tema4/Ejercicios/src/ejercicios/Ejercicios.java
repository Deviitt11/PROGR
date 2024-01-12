/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author ALUMNOS_FP
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Solicitar una linea de texto por teclado y contar el número de palabras q tiene
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce una linea de texto");
        String texto = s.next();
        String[] palabras = texto.split(" ");
        System.out.println("Número de palabras: " + palabras.length);   
        
        // Contar el número de vocales de una cadena de caracteres solicitada previamente desde teclado.
        
        
       
    }
    
    public static String invertirCadena(String cadena) {
            
            cadena = cadena.toLowerCase();
            String cI = "";
            
            // Invertimos la cadena
            char character;
            for (int i = cadena.length() - 1; i >= 0; i--) {
                character = cadena.charAt(i);
                cadIn += character;
            }
            
            return cadIn;
        }
    
}
