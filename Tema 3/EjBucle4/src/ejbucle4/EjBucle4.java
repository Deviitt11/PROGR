/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejbucle4;

import java.util.Scanner;

/**
 *
 * @author ALUMNOS_FP
 */
public class EjBucle4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        cuenta7();
        
        
        
    }
    
    // Escribir todos los nos del 1 al 100
    public static void cuenta7() {
        for(int i = 100; i > 0; i-=7) {
            System.out.println("Numero: " + i);
        }
    }
    
    public static void cuenta7pt2() {
        int n = 100;
        while(n >= 0) {
            System.out.println("NÚMERO: " + n);
            n -= 7;
        }
    }
    
    // booleano, param int, dice si es primo o no
    public static boolean Primo(int n2) {
        for(int i = 1; i < n2; i++) {
            if(n2 % i == 0) {
                return false;
            }
        }    
        return true;
    }
    
    // metodo q pida n y mientras n > 0, syso primo o no
    // hasta que n < 0
    public static void isP2 () {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        int n5 = s.nextInt();
        
        while(n5 > 0) {
            boolean primo = Primo(n5);
            if(primo) {
                System.out.println("No es primo");
            }
            else if(!primo){
                System.out.println("No es primo");
            }
            System.out.println("Introduce un número: ");
            n5 = s.nextInt();
        }
        
    }
    
}
