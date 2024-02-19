/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estsel;

import java.util.Scanner;

/**
 *
 * @author ALUMNOS_FP
 */
public class EstSel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        // Imprimir es par o es impar
        // condicional
        String paridad = (n%2 == 0)?"Es par":"Es impar";
        System.out.println(paridad);
        
        // bucle
        if(n % 2 == 0) {
            System.out.println("Es par");
        }
        else {
            System.out.println("Es impar");
        }
        
        // Switch
        
        switch(n){
            case 1:
                System.out.println("Lunes");
                break;
             case 2:
                System.out.println("Martes");
                break;
             case 3:
                System.out.println("Miércoles");
                break;
             case 4:
                System.out.println("Jueves");
                break;
             case 5:
                System.out.println("Viernes");
                break;
             default:
                 System.out.println("Día no válido");
        }           
    }
}
