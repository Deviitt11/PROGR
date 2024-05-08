/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lecturaficheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ALUMNOS_FP
 */
public class Lector {
    
    String pathFile;

    public String getPathFile() {
        return pathFile;
    }

    public void setPathFile(String pathFile) {
        this.pathFile = pathFile;
    }

    public Lector(String pathFile) {
        this.pathFile = pathFile;
    }
    
    
    
    public void leerFichero(){
        
        try {
            FileReader reader = new FileReader(pathFile);
           
            int caracter = 0;
            
            while ((caracter = reader.read()) != -1) {                
                System.out.println((char) reader.read());
            }     
            
            reader.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void leerFicheroDelimitado(String delimitador) {
        
        try (FileReader reader = new FileReader(pathFile)){
            
            String textFich = "";
            
            int car;
            
            while((car = reader.read()) != -1){
                String letra = String.valueOf((char)car);
                
                if(letra.equals(delimitador)) {
                    System.out.println();
                }
                else{
                    System.out.println(letra);
                }
                
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
}
