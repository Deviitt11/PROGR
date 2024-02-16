/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fauna;

import java.util.Scanner;
import mamifero.Felino;
import mamifero.Mamifero;
import mamifero.Primate;

/**
 *
 * @author ALUMNOS_FP
 */
public class Fauna {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Primer constructor
        Mamifero vaca = new Mamifero(300, 1.5, "vaca");

        // Segundo constructor
        Mamifero oso = new Mamifero(500, 2.4);

        // Llamamos al método
        vaca.hablar("Muuu");
        oso.hablar("Grrr", "oso");

        vaca.actualizarPeso(400);
        System.out.println("Peso actual: " + vaca.getPeso());
        
        oso.actualizarPeso("550");
        System.out.println("Peso actual: " + oso.getPeso());
        
        // Llamar a método estático
        double kilos = Mamifero.convertAKilos(560.3);
        System.out.println("Kilos: " + kilos);
        
        // Print con formato
        String cad = "Hola";
        String print = String.format("La cadena vale: %s", cad);
        System.out.println(print);
        
        double dec = 1.0/3.0;
        String var = "a";
        
        System.out.printf("La variable %s es: %.2f", var, dec);
        
        String nombre = "Pepe";
        int edad = 3;
        double dinero = 16.5;
        
        System.out.printf("El nombre es %s, la edad %d y el dinero %f", nombre, edad, dinero);
        
        // Felino
        Felino gatoMontés = new Felino(10, 1, "Palitroque");
        
        // Primate
        Primate orangután = new Primate(80, 1.60, "Joan Pradells");
        
        gatoMontés.araniar();
        gatoMontés.hablar("Pssss");
        
        orangután.lanzarExcrementos();
        orangután.hablar("Auuu");
        
        
                
        
    }

}
