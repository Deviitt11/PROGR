/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;

/**
 *
 * @author ALUMNOS_FP
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    }
    
    public static int factorialIterativo(int num) {
        
        int factorial = 1;
        
        for (int i = 0; i < 10; i++) {
            factorial *= num;
        }
        
        return factorial;
    }
    
    public static int factRecur(int num) {
        
    }
}
