/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utilsjava;

import clasesfiguras.Cuadrado;
import clasesfiguras.Rectangulo;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ALUMNOS_FP
 */
public class UtilsJava {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el numerador: ");
        int num = s.nextInt();
        System.out.println("Introduce el denominador: ");
        int den = s.nextInt();
        // num ran
        Random random = new Random();
        
        // num alea desde 0
        final int MAX_VALUE = 100;
        int entRandom = random.nextInt(MAX_VALUE);
        
        // desde max a min
        final int MIN_VALUE = 10;
        int entRan2 = random.nextInt(MIN_VALUE, MAX_VALUE);
        
        // hacer q el prog duerma
        final int MILIS = 3;
        try {
            Thread.sleep(MILIS * 1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(UtilsJava.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.err.println("Siesta");
        
        Cuadrado c = new Cuadrado(3.6);
        Rectangulo r = new Rectangulo(2,4);
        
        String claseCuad = c.getClass().getName();
        //figura.Cuadrado
        
        String[] cadena = claseCuad.split("\\.");
        
        String nombre = cadena[1];
        
        
        
        
    }
    
    // aritExp
    // lanzar una excp
    public static int dividir(int num, int den){
        int div = num/den;
        return div;
    }
    
}
