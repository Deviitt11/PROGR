/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author ALUMNOS_FP
 */
public class Persona {
    
    // Atributos
    private String dni;
    private String nombre;
    
    // Constructor con todos los atributos
    public Persona(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    // Métodos get y set
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     
    // Método público toString que devuelva un String con el valor de todos los atributos
    @Override
    public String toString() {
        return "DNI: " + this.getDni() + ", nombre: " + this.getNombre();
    }
}
