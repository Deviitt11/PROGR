/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buclewhile;

import java.util.Scanner;

/**
 *
 * @author ALUMNOS_FP
 */
public class BucleWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n = 10;
        
        // Bucle While
        while(n > 0){
            System.out.println("El número vale: " + n);
            n--;
        }
        
        // Bucle Do While
        int n2 = 10;
        do {
            n2--;
            System.out.println("El número vale: " + n2);
        }while(n2>0);
        
        // Si es par o no hasta que se introduzca por teclado un negativo
        
        Scanner s = new Scanner (System.in);
        
        System.out.println("Introduce un número: ");
        int n3 = s.nextInt();
        
        while(n3 > 0) {
            if(n3 % 2 == 0) {
                System.out.println("Par");
            }
            else {
                System.out.println("Impar");
            }
            System.out.println("Introduce un número: ");
            n3 = s.nextInt();
        }
        
        // Do While
        
        System.out.println("Introduce otro:  ");
        int nTec = s.nextInt();
        
        do{
            if(n3 % 2 == 0) {
                System.out.println("Par");
            }
            else {
                System.out.println("Impar");
            }
            System.out.println("Introduce un número: ");
            n3 = s.nextInt();
        }while(nTec > 0);
    }
    
}
