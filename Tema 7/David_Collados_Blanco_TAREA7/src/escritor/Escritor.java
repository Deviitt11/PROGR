/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritor;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Escritor {
    
    public static void escribirFichero(String fileName, String contenido) {
        try {
            
            File file = new File(ruta);
            FileWriter shake = new FileWriter(file, true);
            
            // escribimos
            shake.write(' ');
            shake.write("\n");
            shake.write("mensaje: \n");
            shake.write("COMUNICADO OFICIAL: Kylian Mbappé\n\n");
            shake.write("El club se complace de anunciar el fichaje del astro francés\n\n");
            
            shake.close();
            
            
        } catch (FileNotFoundException ex) {
            System.err.println("FileNotFoundException: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("IOException capturado");
        }
    }
    
    public static void escribirNumeros(String fileName, ArrayList<Integer>) {
        
    }
    
    
}
