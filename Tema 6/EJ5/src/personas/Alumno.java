/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

/**
 *
 * @author david
 */
public abstract class Alumno extends Persona {
    
    // Atributos
    int curso;
    String nivelAcademico;
    
    // Constructor
    public Alumno(int curso, String nivelAcademico, String nombre, int edad) {
        super(nombre, edad);
        this.curso = curso;
        this.nivelAcademico = nivelAcademico;
    }
    
    // Setters y getters
    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public String getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }
    
    // método
    public void cambiarCurso(int c) {
        this.setCurso(c);
    }
    
    // toString
    @Override
    public String toString() {
        return "Alumno {" + "nombre: " + this.nombre + ", edad: " + this.edad + ", curso: " + this.curso + " , nivelAcadémico: " + this.nivelAcademico + '}';
    }
    
    abstract double pagoMensual();
    abstract String getAsignaturas();
    
}
