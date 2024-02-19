/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package medias;

import java.util.Scanner;

/**
 *
 * @author ALUMNOS_FP
 */
public class Medias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Media de 5 números introducidos por teclado
        Scanner s = new Scanner(System.in);
 
        double suma = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce un número: ");
            double n = s.nextDouble();
            suma += n;
        }
        
        System.out.println("Media: " + suma/5.0);
    }
    
}
