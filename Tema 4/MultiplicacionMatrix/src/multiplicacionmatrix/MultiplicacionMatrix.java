/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplicacionmatrix;

/**
 *
 * @author ALUMNOS_FP
 */
public class MultiplicacionMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

    public static int[][] matMult(int[][] m1, int[][] m2, int rows, int columns) {
        int[][] mult = new int[rows][columns];
        // 1 2 3
        // 4 5 6
        // 7 8 9
        
        // 1 1 1
        // 1 1 1
        // 1 1 1
        
        // 0 0 0
        // 0 0 0
        // 0 0 0
        
        for (int i = 0; i < rows; i++) { // recorrer filas m1
            for (int j = 0; j < columns; j++) { // recorrer columnas m2
                for (int z = 0; z < rows; z++) { // recorrer fila m2 y columna m1
                    // i = 0: 1 2 3
                    // j = 0: 1 1 1
                    mult[i][j] += m1[i][z] * m2[z][j];
                }
            }
        }
        
        return mult;
    }

}
