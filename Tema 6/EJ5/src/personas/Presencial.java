/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

/**
 *
 * @author david
 */
public class Presencial extends Alumno {
    
    // Atributos
    double matriculaCurso;
    double plusPorConvocatoria;
    int noConvocatoria;
    
    // Setters y Getters
    public double getMatriculaCurso() {
        return matriculaCurso;
    }

    public void setMatriculaCurso(double matriculaCurso) {
        this.matriculaCurso = matriculaCurso;
    }

    public double getPlusPorConvocatoria() {
        return plusPorConvocatoria;
    }

    public void setPlusPorConvocatoria(double plusPorConvocatoria) {
        this.plusPorConvocatoria = plusPorConvocatoria;
    }

    public int getNoConvocatoria() {
        return noConvocatoria;
    }

    public void setNoConvocatoria(int noConvocatoria) {
        this.noConvocatoria = noConvocatoria;
    }
    
    // Constructor
    public Presencial(double matriculaCurso, double plusPorConvocatoria, int noConvocatoria, int curso, String nivelAcademico, String nombre, int edad) {
        super(curso, nivelAcademico, nombre, edad);
        this.matriculaCurso = matriculaCurso;
        this.plusPorConvocatoria = plusPorConvocatoria;
        this.noConvocatoria = noConvocatoria;
    }
    
    public double pagoMensual(){
        return (this.matriculaCurso + this.plusPorConvocatoria * this.noConvocatoria)/12;
    }
   
    @Override
    String getAsignaturas() {
        return "Todas las asignaturas del curso + curso";
    }
    
    
    
}
