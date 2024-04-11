/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

import interf.puedeCaminar;
import interf.puedeVolar;

/**
 *
 * @author david
 */
public class Felino extends Mamifero implements puedeCaminar, puedeVolar {

    @Override
    public void volar() {
        System.out.println("Volando...");
    }
    
}
