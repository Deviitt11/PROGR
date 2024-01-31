/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matricesoperaciones;

import java.util.Random;

/**
 *
 * @author david
 */
public class MatricesOperaciones {

    
    /*
    EJERCICIO 5
    Crea dos arrays multidimensionales de 2x3 y rellénalos como quieras (números aleatorios o por teclado)
    
    Haz un método que sume las matrices, es decir la posición 0,0 de la matriz 1 con la posición 0,0 de la matriz 2
    y así sucesivamente, este método no debe devolver nada.
    
    Realiza un método para imprimir, al que llamar 3 veces, para ir mostrando por pantalla el contenido de cada matriz, así como la matriz suma resultante.
    */
    
    private static final int FILAS = 2;
    private static final int COLUMNAS = 3;
    private static int[][] matriz1 = new int[FILAS][COLUMNAS];
    private static int[][] matriz2 = new int[FILAS][COLUMNAS];
    private static int[][] matrizSuma = new int[FILAS][COLUMNAS];

    public static void main(String[] args) {
        rellenarMatrices();
        sumarMatrices();
        System.out.println("Matriz 1:");
        imprimirMatriz(matriz1);
        System.out.println("Matriz 2:");
        imprimirMatriz(matriz2);
        System.out.println("Matriz Suma:");
        imprimirMatriz(matrizSuma);
    }
    
    private static void rellenarMatrices() {
        rellenarMatriz(matriz1);
        rellenarMatriz(matriz2);
    }

    private static void rellenarMatriz(int[][] matriz) {
        Random random = new Random();
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                matriz[i][j] = random.nextInt(10); // Genera números aleatorios entre 0 y 9
            }
        }
    }

    private static void sumarMatrices() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
    }

    private static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }    
}
