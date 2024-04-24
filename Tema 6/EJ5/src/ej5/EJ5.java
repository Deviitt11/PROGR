/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5;

import personas.Alumno;
import personas.Libre;
import personas.Presencial;
import personas.Profesor;

/**
 *
 * @author david
 */
public class EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Profesor[] vectProf = new Profesor[5];
        mostrarProf(vectProf);
        
        Alumno[] vectAlum = new Alumno[5];
        mostrarAlum(vectAlum);
             
    }
    
    public static void mostrarProf(Profesor[] vectProf) {
        for (Profesor profesor : vectProf) {
            System.out.println("Profesor: " + profesor.getNombre());
        }
    }
    
    public static void mostrarAlum(Alumno[] vectAlum) {
        for (Alumno alumno : vectAlum) {
            System.out.println("Alumno: " + alumno.getNombre() + " estudia: " + alumno.getNivelAcademico());
            if(alumno instanceof Libre) {
                System.out.println("Alumno: " + alumno.getNombre() + " estudia: " + ((Libre) alumno).getListaAsignaturas());
            }
            else if (alumno instanceof Presencial){
                System.out.println("Alumno: " + alumno.getNombre() + " paga: " + ((Presencial) alumno).pagoMensual());
            }
        }
    }
}
