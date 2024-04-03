/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author ALUMNOS_FP
 */
public class Mastin extends Perro{
    
    String raza;
    boolean castrado;

    public Mastin(int edad, String nombre, double peso) {
        super(edad, nombre, peso);
        this.raza = raza;
        castrado = false;
    }
    
public void defenderOvejas(){
    System.out.println("Se ha defendido la granja  del lobo");
}   
    
}
