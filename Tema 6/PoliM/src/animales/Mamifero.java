/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

import interf.puedeCaminar;

/**
 *
 * @author ALUMNOS_FP
 */
public class Mamifero implements puedeCaminar{

    String especie;
    String color;
    
    @Override
    public void caminar() {
        System.out.println("El mamifero camina");
    }
    
    
}
