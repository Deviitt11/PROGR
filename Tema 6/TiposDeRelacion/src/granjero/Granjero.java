/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package granjero;

import composicion.Vaca;

/**
 *
 * @author ALUMNOS_FP
 */
public class Granjero {
    
    String telefono;
    String dni;

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Granjero(String telefono, String dni) {
        this.telefono = telefono;
        this.dni = dni;
    }
     
    public void ordenarVaca(Vaca vaca, int litros) {
        int litrosVaca = vaca.getLitrosLeche();
        if(litrosVaca < litros) {
            System.out.println("No se puede ordenar a la vaca " + litros + " litros, solo daria " + litrosVaca + " litros");
        }
        else{
            int litrosRestantes = litrosVaca - litros;
            vaca.setLitrosLeche(litrosRestantes);
            System.out.println("Vaca ordenada, litros restantes: " + vaca.getLitrosLeche());
        }
    }
}
