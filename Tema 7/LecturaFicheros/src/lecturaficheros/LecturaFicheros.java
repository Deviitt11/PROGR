/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lecturaficheros;


/**
 *
 * @author ALUMNOS_FP
 */
public class LecturaFicheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        final String RUTA = "C:\\Users\\ALUMNOS_FP\\Documents\\NetBeansProjects\\Tema 7\\LecturaFicheros\\Fichero.txt";
        
        //Escritor.escribirFichero(RUTA);
        
        Escritor.escribirFichero("FicheroEscribir.txt");
        Escritor.sobreescribirFichero("FicheroSobre.txt");
        
        Lector lector = new Lector("FicheroEscribir.txt");
        lector.leerFichero();
        
        Escritor.escribirLetraS("Hola muy buenas", "ficheroLetra.txt");
        
        Lector lector1 = new Lector("C:\\Users\\ALUMNOS_FP\\Documents\\NetBeansProjects\\Tema 7\\LecturaFicheros\\ficheroLetra.txt");
        lector1.leerFichero();
        lector1.leerFicheroDelimitado("a");
          
    }
    
        
        
        
}
