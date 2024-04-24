/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Libre extends Alumno {
    
    // Atributos
    String[] listaAsignaturas;
    float precioPorHora = 10;
    int numHorasDiarias;
    
    // Setters y getters
    public String[] getListaAsignaturas() {
        return listaAsignaturas;
    }

    public void setListaAsignaturas(String[] listaAsignaturas) {
        this.listaAsignaturas = listaAsignaturas;
    }

    public float getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(float precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public int getNumHorasDiarias() {
        return numHorasDiarias;
    }

    public void setNumHorasDiarias(int numHorasDiarias) {
        this.numHorasDiarias = numHorasDiarias;
    }
    
    // Constructor
    public Libre(String[] listaAsignaturas, int numHorasDiarias, int curso, String nivelAcademico, String nombre, int edad) {
        super(curso, nivelAcademico, nombre, edad);
        this.listaAsignaturas = listaAsignaturas;
        this.numHorasDiarias = numHorasDiarias;
    }
    
    public void pedirAsignaturas(){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el numero de asignaturas: ");
        int numAsig = s.nextInt();
        
        listaAsignaturas = new String[numAsig];
        
        for (int i = 0; i < numAsig; i++) {
            System.out.println("Ingresa nombre asignatura: ");
            listaAsignaturas[i] = s.nextLine();
        }
    }

    @Override
    double pagoMensual() {
        return this.precioPorHora*this.numHorasDiarias*30;
    }

    @Override
    String getAsignaturas() {
        return "Lista de asignaturas: " + listaAsignaturas;
    }
    
    
    
}
