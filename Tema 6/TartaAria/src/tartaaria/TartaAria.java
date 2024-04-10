/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tartaaria;

import java.util.Scanner;

/**
 *
 * @author ALUMNOS_FP
 */
public class TartaAria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // diez numeros, media positivos, media negativos y media cero
        Scanner s = new Scanner(System.in);
        
        int[] numeros = new int[10];
            
        // Lectura números
        for (int i = 0; i < 9; i++) {
            System.out.println("Introduce un numero: ");
            numeros[i] = s.nextInt();
        }
        
        mediaNumeros(numeros);
    }
    
    public static void mediaNumeros(int[] numeros){
        int sumPos = 0, contPos = 0;
        int sumNeg = 0, contNeg = 0;
        int contCero = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            
            // Positivos
            if(numeros[i] > 0) {
                contPos++;
                sumPos += numeros[i];
            } // Negativos
            else if(numeros[i] < 0){
                contNeg++;
                sumNeg += numeros[i];
            } // Ceros
            else{
                contCero++;
            }
        }
        System.out.println("Contador positivos: " + contPos + " ,media positivos: " + sumPos/contPos);
        System.out.println("Contador negativos: " + contNeg + " ,media negativos: " + sumNeg/contNeg);
        System.out.println("Contador ceros: " + contCero);
    }
    
}
