/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package thematrix;

/**
 *
 * @author ALUMNOS_FP
 */
public class TheMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Declarar la matriz
        int[][] matriz = new int[3][3];
        
        // Rellenar la matriz 3x3 con los valores del 1 al 9
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;
        
        // Declarar e inicializar la matriz
        int [][] m2 = {{1,2,3},{4,5,6},{7,8,9}};
        
        for(int i = 0; i < 3; i++){
            
            for(int j = 0; j < 3; j++) { // 3
                // j = 0
                //[0][0]
                System.out.print(m2[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Parte 2");
        for(int j = 0; j < 3; j++){
            
            for(int i = 0; i < 3; i++) { // 3
                // j = 0
                //[0][0]
                System.out.print(m2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
