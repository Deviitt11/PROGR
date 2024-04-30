/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecturaficheros;

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
    
    public static void escribirFichero(String ruta){
        
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
    
}
