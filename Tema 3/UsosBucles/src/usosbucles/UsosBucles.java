/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usosbucles;

/**
 *
 * @author ALUMNOS_FP
 */
public class UsosBucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Suma de números pares entre 100 y 200
        // bucle for
        int sum = 0;
        for(int i = 100; i <= 200; i+=2) {
            sum += i;
        }
        
        System.out.println("Suma: " + sum);
        
        // bucle while
        int aux = 100;
        int sumat = 0;
        while(aux <= 200){
            if(aux % 2 == 0) {
                sumat += aux;
            }
            aux++;
        } 
        System.out.println("Suma: " + sumat);
        
    }
    
    
    
}
