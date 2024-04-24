/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

/**
 *
 * @author david
 */
public class Persona {
    
    // Atributos
    String nombre;
    int edad;
    
    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    // Setters y getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    // toString
    @Override
    public String toString() {
        return "Persona {" + "nombre: " + nombre + ", edad: " + edad + '}';
    }
    
    public void cambiarEdad(int e) {
        this.setEdad(e);
    } 
}
