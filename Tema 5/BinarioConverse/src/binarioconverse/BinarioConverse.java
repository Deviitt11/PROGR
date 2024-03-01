/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binarioconverse;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ALUMNOS_FP
 */
public class BinarioConverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int nDec = -1;

        while (nDec < 0) {
            try {
                System.out.println("Introduce un numero: ");
                nDec = s.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un numero: ");
                s.nextLine();
            }
        }
    }
    
    public static String convertirDecimalABinario(int numDec){
        
        String numBin = "";
        int cociente = numDec / 2;
        
        while(numDec/2 !=0) {
            
            int resto = numDec%2;
           
            numBin+=resto;
            
            numDec = numDec/2;
        }
        
        numBin = "1" + numBin;
        return numBin;
    }

}
