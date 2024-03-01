/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author ALUMNOS_FP
 */
public class Coche extends Vehiculo {
    
    // Atributos
    private int numPuertas;
    private String motor;
    
    // Constructor con todos los atributos
    public Coche(int numPuertas, String motor, String matricula, int velocidadMax, int anoFabricacion) {
        super(matricula, velocidadMax, anoFabricacion);
        this.numPuertas = numPuertas;
        this.motor = motor;
    }
     
    // Métodos get y set
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
    
    // Método público mostrarDatos que muestre por pantalla el valor de todos sus atributos (incluidos los del padre)
    @Override
    public void mostrarDatos() {
        System.out.println("Matricula: " + super.getMatricula() + ", su velocidad maxima es: " + super.getVelocidadMax() + " y su year de fabricacion es: " + super.getAnoFabricacion());
        super.mostrarDatos();
        
        System.out.println("Numero de puertas: " + this.getNumPuertas() + " y su motor es: " + this.getMotor());
    }
    
}
