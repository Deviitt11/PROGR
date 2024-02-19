/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sentenciasdesalto;

import java.util.Scanner;

/**
 *
 * @author ALUMNOS_FP
 */
public class SentenciasDeSalto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // break
        
        for(int i = 0; i < 10; i++) {
            System.out.println("Iteración: " + i);
            
            if(i == 5) {
                break;
            }
        }
        System.out.println("FIN DEL BUCLE");
        
        // continue, saltar/pasar a la isguiente iteracion
        for(int i = 0; i < 10; i++) {
            System.out.println("Iteración: " + i + " antes del break");
            
            if(i == 2) {
                continue;
            }
            System.out.println("Iteración: " + i + " antes del break");
        }
        System.out.println("FIN BUCLE");
         
    }
    
    public static String PosNeg(int n) {
        if(n>0) {
            return "Posi";
        }
        else if(n<0){
            return "Neg";
        }
        else {
            return "0";
        }
    }
    
}
