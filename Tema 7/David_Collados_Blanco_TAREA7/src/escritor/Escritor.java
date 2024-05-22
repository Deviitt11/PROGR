/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Escritor {
    
    /*
    Método público estático ‘escribirFichero’ que reciba por parámetro el nombre del fichero 
    y un String con su contenido. Debe escribir toda la cadena en el fichero añadiendo un salto 
    de línea cada vez que encuentre el carácter del punto en la cadena 
    (si el fichero existe se debe sobrescribir su contenido).
    */
    public static void escribirFichero(String nombreFichero, String contenido) {
        
        // utilizo try catch como siempre en estos métodos
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreFichero))) {
            
            // reemplazo el . por un salto de línea en el contenido que le damos
            String modificado = contenido.replace(".", "\n");
            
            // escribo el contenido modificado en el fichero
            escritor.write(modificado);
        } catch (IOException ex) {
            Logger.getLogger(Escritor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*
    Método público estático ‘escribirNumeros’ que reciba por parámetro el nombre del fichero 
    y un ArrayList de enteros con su contenido (no debe sobrescribirse lo que este escrito en el fichero).
    Debe escribir en el fichero cada número de la colección separado por una coma (ej: 4,2,7,9,1).
    */
    public static void escribirNumeros(String nombreFichero, ArrayList<Integer> enteros) {
        
        // vuelvo a utilizar try catch
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreFichero, true))) {
            
            // hago una cadena con los numeros separados por comas
            StringBuilder cadEnt = new StringBuilder();
            
            // bucle for each para recorrer el arraylist de enteros
            for (Integer entero : enteros) {
                // voy metiendo cada numero en la cadena
                cadEnt.append(entero);
                
                // y tambien meto la coma excepto en el ultimo num
                if(entero < enteros.size() - 1) {
                    cadEnt.append(",");
                } 
            }
            
            // escribo la cadena en el fichero como string
            escritor.write(cadEnt.toString());
            
        } catch (IOException ex) {
            Logger.getLogger(Escritor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
