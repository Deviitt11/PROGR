/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringmethods;

/**
 *
 * @author ALUMNOS_FP
 */
public class StringMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String c1 = "Hola";
        String c2 = "Adiós";
        
        // Obtener longitud de la cadena
        System.out.println("Longitud cadena" + c1.length());
        
        // Comparar dos cadenas
        System.out.println("Comparación cadena 1: " + c1.equals(c2));
        System.out.println("Comparación eq ignore: " + c1.equalsIgnoreCase(c2));
        
        // cambios
        c1.toUpperCase();
        c1.toLowerCase();
        
        // replace
        String cR = c1.replace("ho", "sx");
        System.out.println(cR);
        
        // Concatenar una cadena
        String cC = c1.concat("que tal");
        
        // imprimir carac a carac
        for(int i = 0; i < c1.length(); i++) {
            System.out.println(c1.charAt(i));
        }
        
        // Comprobar si el String está vacío
        c1.isEmpty();
        
        // Quitar los espacios en blanco de una cadena
        String nospaces = c1.trim();
        System.out.println(nospaces);
        
        c1 = "1,2,3,4,5";
        // dividir una cadena
        String[] cD = c1.split(",");
        
        
    }
    
}
