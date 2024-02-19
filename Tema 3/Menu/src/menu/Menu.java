/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menu;

import java.util.Scanner;

/**
 *
 * @author ALUMNOS_FP
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
            
        int opc = 0;
        
        do{
            System.out.println("Introduce opción: ");
        
            System.out.println("1: Elevar al cuadrado");
            System.out.println("2: Elevar al cubo");
            System.out.println("3: Raíz cuadrada");
            System.out.println("4: Salir");
            
            Scanner s = new Scanner(System.in);
            opc = s.nextInt();
            
            switch(opc){
                case 1:
                    System.out.println("Introduce un entero: ");
                    int n = s.nextInt();
                    System.out.println("Al cuadrado: " + alCuadrado(n));
                    break;
                case 2:
                    System.out.println("Introduce un entero: ");
                    n = s.nextInt();
                    System.out.println("Al cuadrado: " + alCubo(n));
                    break;
                case 3:
                    System.out.println("Introduce un entero: ");
                    n = s.nextInt();
                    System.out.println("Al cuadrado: " + rC(n)); 
                    break;
                default:
                    System.out.println("No válida");
            }
        } while(opc !=4);
       
    }
    
    public static int alCuadrado(int n){
        return (int) Math.pow(n,2);
    }
    
    public static int alCubo(int n){
        double cuadrado = Math.pow(n,3);
        return (int) cuadrado;
    }
    
    public static double rC(int n){
        double raiz = Math.sqrt(n);
        return raiz;
    }
    
}