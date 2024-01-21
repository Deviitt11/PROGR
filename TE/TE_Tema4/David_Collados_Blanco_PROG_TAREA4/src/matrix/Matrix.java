/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrix;

import java.util.Random;

/**
 *
 * @author david
 */
public class Matrix {

    int MAX_NUMBER = 99;

    // OPCIÓN 1: GENERAR MATRICES ALEATORIAS
    // Esta opción rellenará dos matrices con números aleatorios entre 10 y 99.
    public static int[][] generaMatrix1(int rows, int columns) { // Recibe como argumentos las filas y columnas, en nuestro caso serán 4
        
        int[][] m1 = new int[rows][columns]; // creamos la matriz, vacía de momento
        
        for (int i = 0; i < rows; i++) { // bucle for para recorrer las filas
            for (int j = 0; j < columns; j++) { // bucle for para recorrer las columnas
                Random r = new Random(); // creamos un objeto de la clase Random
                int randNumb = r.nextInt(10, 99) + 1; // Genera un número aleatorio entre 10 y 99 (98 + 1)
                m1[i][j] = randNumb; // se asigna un número aleatorio a cada elemento de la matriz
            }
        }
        return m1; 
    }
    
    public static int[][] generaMatrix2(int rows, int columns) { // Mismo método para la segunda matriz
        
        int[][] m2 = new int[rows][columns];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                Random r = new Random();
                // Genera un número aleatorio entre 10 y 99 (98 + 1)
                int randNumb = r.nextInt(10, 99) + 1;
                m2[i][j] = randNumb;
            }
        }
        return m2;
    }
    
    // OPCIÓN 2: COMPROBAR MATRICES SON IGUALES
    // Esta opción comprobará si las dos matrices generadas son iguales y mostrará por pantalla un mensaje indicando si son o no iguales.
    
    
    // OPCIÓN 3: MOSTRAR MATRICES
    // Esta opción mostrará por pantalla el valor de las dos matrices (en formato tabular: una fila en cada línea).
    public static void muestraMatrix(int[][] m, int rows, int columns) { // Recibe como parámetros una matriz, y los números de filas y columnas
        for (int i = 0; i < rows; i++) { // bucle for para recorrer las filas
            for (int j = 0; j < columns; j++) { // bucle for para recorrer las columnas
                System.out.println(m[i][j] + ""); // imprimimos elemento a elemento
            } 
            System.out.println(""); // salto de línea
        }
    }
    
    
    

}
