/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package media2;

import java.util.Scanner;

/**
 *
 * @author ALUMNOS_FP
 */
public class Media2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int n;
        int suma = 0;
        int cont = 0;
        
        do {
            System.out.println("Introduce un número: ");
            n = s.nextInt();
            
            if(n!=0) {
                suma += n;
            }
             
            cont++;
        } while(n !=0);
        
        System.out.println("Media: " + suma/cont);
    }
    
}
