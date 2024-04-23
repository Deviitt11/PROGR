/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3;

import cantantes.Canario;
import cantantes.Gallo;
import cantantes.Persona;
import interfaces.PuedeCantar;
import java.util.Scanner;

/**
 *
 * @author ALUMNOS_FP
 */
public class EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opc;
        
        do {
            System.out.println("Introduce opcion para cantante: ");
            System.out.println("1. Persona ");
            System.out.println("2. Gallo");
            System.out.println("3. Quevedo");
            System.out.println("4. Salir");
        
            Scanner s = new Scanner(System.in);
            opc = s.nextInt();
            
            PuedeCantar cantante = null;
            
            switch (opc) {
                case 1:
                    cantante = new Persona();
                    break;
                case 2:
                    cantante = new Gallo();
                    break;
                case 3:
                    cantante = new Canario();
                    break;
                case 4:
                    cantante = null;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            
            if(cantante != null) {
                PruebaCantar.probarCanto(cantante);
            }
            
        } while (opc != 4);
        
    }
    
}
