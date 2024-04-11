/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

import interf.puedeVolar;

/**
 *
 * @author ALUMNOS_FP
 */
public class Ave implements puedeVolar{

    String tipoDePico;
    
    @Override
    public void volar() {
        System.out.println("El ave vuela");
    }
    
    
    
}
