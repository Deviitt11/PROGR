/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package singleton;

/**
 *
 * @author ALUMNOS_FP
 */
public class BaseSingleton {
    
    public static BaseSingleton instancia = null;
    String nombre;
    
    private BaseSingleton(String nombre){
       this.nombre = nombre;
    };

    public String getNombre() {
        return nombre;
    }
   
    
    
    public static BaseSingleton crearInstancia(String nombre){
        if(instancia == null) {
            instancia = new BaseSingleton(nombre);
        }
        return instancia;
    }
}
