/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

/**
 *
 * @author david
 */
public class Profesor extends Persona {
    
    // Atributos
    String asignatura;
    
    // Setters y getters
    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
    
    // Constructor
    public Profesor(String asignatura, String nombre, int edad) {
        super(nombre, edad);
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return "Persona {" + "nombre: " + this.nombre + ", edad: " + this.edad + ", asignatura: " + this.asignatura + '}';
    }
    
    
    
    
    
}
