/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

import java.util.Scanner;

/**
 *
 * @author ALUMNOS_FP
 */
public class Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        try {
            int op = 5 / 0;
        } catch (ArithmeticException e) {
            // tipo excp y nombre
            System.out.println("Excepción arit. lanzada");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }*/
        
        // Ej 2
        
        /*try {
             String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            e.printStackTrace();
            
        }*/
        
        /*
        int[] arrayN = {1,2,3};
        System.out.println("Introduce posición array, Su posición es: " + arrayN.length);
        Scanner s = new Scanner(System.in);
        int pos = s.nextInt();
            
        // Ej 3
        try {
            System.out.println(arrayN[pos]);
        } catch (IndexOutOfBoundsException io) {
            io.getStackTrace();
        }*/
        
        // 4º ejemplo
        /*int[] aN = {1,2,3};
       
        try {
            System.out.println(aN[10]);
            System.out.println(5/0);
        } catch (ArrayIndexOutOfBoundsException e1) {
            e1.getStackTrace();
        } catch (ArithmeticException e2) {
            e2.getStackTrace();
        }*/
        
        try {
            divi(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Exc lanzada");
        }
    }
     public static int divi(int dic, int div) throws ArithmeticException{
         try {
             int d2 = dic/div;
         } catch (Exception e) {
             e.printStackTrace();
         }
   
         int d2 = dic/div;
            
            return d2;
        }
}


