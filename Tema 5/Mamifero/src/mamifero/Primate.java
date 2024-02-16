/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mamifero;

/**
 *
 * @author ALUMNOS_FP
 */
public class Primate extends Mamifero{
    
    public Primate(double peso, double altura, String especie) {
        super(peso, altura, especie);
    }
    
    
    
    public void lanzarExcrementos(){
        System.out.println("Mierda lanzada");
    }
    
    
}
