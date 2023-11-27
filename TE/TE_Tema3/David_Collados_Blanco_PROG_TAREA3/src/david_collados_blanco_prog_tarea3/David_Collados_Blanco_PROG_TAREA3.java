/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package david_collados_blanco_prog_tarea3;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class David_Collados_Blanco_PROG_TAREA3 {

    public static void main(String[] args) {

        /*
        Se debe crear un programa que muestre al usuario un menú (creado con un switch) con las siguientes opciones:
        1.Calcular el factorial de un número.
        2.Suma números (hasta que se introduzca un 0).
        3.Producto 10 primeros impares.
        4.Salir.
         */
        
        Scanner s =  new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        System.out.println("1. Calcular el factorial de un numero");
        System.out.println("2. Suma numeros (hasta que se introduzca un 0)");
        System.out.println("3. Producto 10 primeros impares");
        System.out.println("4. Salir");
        int menu = s.nextInt();
        
        switch (menu) {
            case 1:
                factorial();
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            default:
                throw new AssertionError();
        }
        
        
    }
    
    /*
    MÉTODO OPCIÓN 1
    Se deberá calcular el factorial de un número. Se deberá pedir al usuario que introduzca un número. 
    Si el número es negativo o cero se volverá a pedir al usuario que introduzca un número (de forma cíclica hasta que el número sea mayor que 0). 
    Luego se deberá mostrar por pantalla su factorial.
    */
    public static int factorial() {
        Scanner s =  new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int nFac = s.nextInt();
        
        if(nFac <= 0) {
            System.out.println("Numero negativo o cero, introduce un numero positivo: ");
            nFac = s.nextInt();
        }
        
        int fact = 0;
        
        for(int i = 1; i < nFac; i++) {
            fact += (i * (i+=1));
        }
        return fact;
    }
}