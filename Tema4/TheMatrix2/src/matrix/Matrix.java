/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrix;

import java.util.Random;

/**
 *
 * @author ALUMNOS_FP
 */
public class Matrix {

    int MAX_NUMBER = 99;

    public int[][] rellenaMatrix(int rows, int columns) {

        int[][] m = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                Random random = new Random();
                int rNumb = random.nextInt() + 1;
                m[i][j] = rNumb;
            }
        }
        return m;
    }

    public void showMatrix(int[][] m, int rows, int columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(m[i][j] + "");
            }
            System.out.println("");
        }
    }
        
    public void pV(int n){
        n = 10;
    }
    
    public void pR(int[] vect){
        vect[0] = 10;
    }
    
    // método q suma 2 matrices
    public int[][] adM(int[][] m1, int [][] m2, int rows, int columns){
        System.out.println("Misco");
        return m1;
    }
}
