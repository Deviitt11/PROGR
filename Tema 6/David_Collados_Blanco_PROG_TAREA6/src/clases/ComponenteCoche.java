/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author ALUMNOS_FP
 */
public abstract class ComponenteCoche {
 
    // atributos
    String descripcion;
    double peso;
    double coste;
    
    // método que muestre dichos atributos
    @Override
    public String toString() {
        return "ComponenteCoche {" + "descripcion: " + descripcion + ", peso:" + peso + ", coste:" + coste + '}';
    }
    
    // método abstracto que recibe un String y devuelve un entero
    public static int stringAEntero(String cadena){
        
    }
    
}
