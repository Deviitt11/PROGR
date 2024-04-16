/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singleton;

/**
 *
 * @author ALUMNOS_FP
 */
public class Singleton {

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BaseSingleton o1 = BaseSingleton.crearInstancia("SQL");
        System.out.println(o1.getNombre());
        
        BaseSingleton o2 = BaseSingleton.crearInstancia("Postgress");
        System.out.println(o2.getNombre());
        
    }
    
    
    
}
