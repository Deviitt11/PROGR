/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejrepaso;

import java.time.DayOfWeek;
import java.util.Scanner;

/**
 *
 * @author ALUMNOS_FP
 */
public class EjRepaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        EJERCICIOS
        -Escribir un programa que pida al usuario que introduzca por teclado números enteros. La lectura de números por teclado finaliza cuando se introduce un cero. El programa mostrará cuántos números positivos se han introducido.
        -Comprobar si un número es capicúa
        -Leer por teclado un número entero N no negativo y mostrar el factorial de todos los números desde 0 hasta N.
        -Decimal a binario
        -Programa que muestra los números primos desde 2 hasta N. El valor de N se introduce por teclado.
        -Programa que imprima los N primeros números de la serie de Fibonacci
        -Algoritmo para comprobar si un número es perfecto.
        */
        
        sumaCont();
        
      
    }
    
    /*
    Escribir un programa que pida al usuario que introduzca por teclado números enteros. 
    La lectura de números por teclado finaliza cuando se introduce un cero. 
    El programa mostrará cuántos números positivos se han introducido.
    */
    public static void sumaCont(){
        // Variable contador para ir contando los números que se introducen
        int cont = 0;
        // 
        Scanner s = new Scanner(System.in);
        int n;
        
        // Bucle do que pide números mientras NO sea 0
        do {            
            // Pedimos y leemos números
            System.out.println("Introduce un numero: ");
            n = s.nextInt();
            // actualizamos el contador
            cont++;
        } while (n != 0);
            System.out.println("Se han introducido: " + cont + " números positivos");
    }    
    
    /*
    
    */
}
