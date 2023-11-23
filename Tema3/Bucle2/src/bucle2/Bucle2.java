/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle2;

import java.util.Scanner;

/**
 *
 * @author ALUMNOS_FP
 */
public class Bucle2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Bucle for, 10 veces, i=-4, pedir al usuario que introduzca n
        // negativo termina
        // que nos diga si el n es multiplo de 3
        
        Scanner s = new Scanner(System.in);
        
        for(int i = -4; i < 6; i++) {
            System.out.println("Introduce un: ");
            int n = s.nextInt();
            
            if(n < 0) {
                break;
            }
            
            if(n % 3 == 0) {
                System.out.println("Múlt. de 3");
            }
            System.out.println("Número: " + n);
        }
    }
    
}
