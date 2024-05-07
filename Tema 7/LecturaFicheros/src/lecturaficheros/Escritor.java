/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecturaficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ALUMNOS_FP
 */
public class Escritor {
    
    public static void sobreescribirFichero(String ruta){
        
        try {
                    
            FileWriter writer = new FileWriter(ruta);
            
            String cadena = "Hola, es mi primer fichero";
            writer.write(cadena);
            writer.write("\nSEGUNDA LÍNEA");
            writer.close();
        } catch (FileNotFoundException ex) {
            System.err.println("FileNotFoundException: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("IOException capturado");
        }
    }
    
    public static void escribirFichero(String ruta){
        
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
    
}
