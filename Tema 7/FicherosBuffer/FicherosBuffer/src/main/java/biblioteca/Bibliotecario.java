package biblioteca;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bibliotecario {

    final static String PATH = "C:\\Users\\ALUMNOS_FP\\OneDrive - TuniverS Formación\\Documentos\\Sergio Martinez\\Programacion\\3 Evaluacion\\Ficheros\\";

    
    
    //Método para escribir fichero en la ruta asignada en la variable final
    public static void escribir(String fileName, boolean append) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(PATH + fileName, append))) {
            escritor.write("Esta es la primera linea\n");
            escritor.write("Esta es la segunda linea");
            escritor.newLine();
            escritor.write("Fin fichero");
            escritor.close();
        } catch (IOException ex) {
            Logger.getLogger(Bibliotecario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Método para leer fichero en la ruta asignada en la variable final
    public static void leer(String fileName) {
        try (BufferedReader lector = new BufferedReader(new FileReader(PATH + fileName))) {
            String line;
            while ((line = lector.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Bibliotecario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Bibliotecario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static int contarPalabras(String fileName) {
        int numPalabras = 0;
        try (BufferedReader lector = new BufferedReader(new FileReader(PATH + fileName))) {
            
            String line;
            while ((line = lector.readLine()) != null) {
                String [] palabras = line.split(" ");
                numPalabras = palabras.length;
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Bibliotecario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Bibliotecario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return numPalabras;
    }
    
    public static int contarCaracteres(String fileName) {
        int numLetras = 0;
        int numCaracteres2 = 0;
        
        try (BufferedReader lector = new BufferedReader(new FileReader(PATH + fileName))) {
            
            String line;
            while ((line = lector.readLine()) != null) {
                
                numLetras += line.replaceAll(" ", "").length();
            }
            
            int caracter;
            
            while ((caracter = lector.read()) != -1)  {  
                if((char) caracter == ' ') {
                    numCaracteres2++;
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Bibliotecario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Bibliotecario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return numLetras;
    }
    
    public static int contarLetras(String fileName) {
        int numLetras = 0;
        int numLetras2 = 0;
        
        try (BufferedReader lector = new BufferedReader(new FileReader(PATH + fileName))) {
            
            String line;
            while ((line = lector.readLine()) != null) {
                
                numLetras += line.replaceAll(" ", "").length();
            }
            
            int caracter;
            
            while ((caracter = lector.read()) != -1)  {  
                if((char) caracter == ' ') {
                    numLetras2++;
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Bibliotecario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Bibliotecario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return numLetras2;
    }
}
