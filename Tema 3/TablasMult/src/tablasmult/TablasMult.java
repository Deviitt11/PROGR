/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablasmult;

import java.util.Scanner;

/**
 *
 * @author ALUMNOS_FP
 */
public class TablasMult {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //for(int i = 0; i < 100; i++) {
            
          //  System.out.println("Número de iteración: " + i);
        //}
        
        // Bucle de 1 al 100
        //for(int i = 100; i >=1; i--) {
          //  System.out.println(i);
        //}
        
        //for(int i = 0; i < 10; i++) {
          //  int a = 2*i;
            //System.out.println(i);
        //}
        
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        for(int i = 1; i < 10; i++) {
            int mult = n*i;
            System.out.println("Numero: " + " x " + i + " = " + mult);
        }
        
    }
    
}
