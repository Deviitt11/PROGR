/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thematrix2;

import java.util.Scanner;
import matrix.Matrix;

/**
 *
 * @author ALUMNOS_FP
 */
public class TheMatrix2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        Matrix om = new Matrix();
        
        System.out.println("Introduce el número de filas: ");
        int filas = s.nextInt();
        
        System.out.println("Introduce el número de columnas: ");
        int columnas = s.nextInt();
        
        int[][] m1 = om.rellenaMatrix(3, 3);
        om.showMatrix(m1, 3, 3);
        
        int n = 5;
        int[] vector ={5};
        System.out.println("Número vale: " + n + ",vector vale: " + vector[0]); 
         
        om.pV(n);
        om.pR(vector);
        
        
    }
    
}
