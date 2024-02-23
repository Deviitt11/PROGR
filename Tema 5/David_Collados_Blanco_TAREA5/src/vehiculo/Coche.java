/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author ALUMNOS_FP
 */
public class Coche {
    
    // Atributos
    private int numPuertas;
    private String motor;
    
    // Constructor con todos los atributos
    public Coche(int numPuertas, String motor) {
        this.numPuertas = numPuertas;
        this.motor = motor;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
    
    // Método público mostrarDatos que muestre por pantalla el valor de todos sus atributos
    public void mostrarDatos(){
        
        System.out.println("Numero de puertas: " + this.getNumPuertas() + "y su motor es: " + this.getMotor());
        
    }
}
