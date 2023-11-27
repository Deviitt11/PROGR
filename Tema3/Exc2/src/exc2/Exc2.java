/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exc2;

import java.util.Scanner;

/**
 *
 * @author ALUMNOS_FP
 */
public class Exc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Introduce un número: ");
            int n = s.nextInt();
        } catch (Exception e) {
            // System.err.println("Exc");
            e.printStackTrace();
        }
        
        try {
            checkAge(17);
        } catch (Exception e) {
            
        }
        
    }
    
    // método con int de param, lo que va a hacer es, si la edad
    // < 18, acceso denegado. Contrario, acceso permitido.
    public static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Acceso denegado, debes tener al menos 18");
            }
            else {
                System.out.println("Acceso concedido");
            }
        }
}
          
