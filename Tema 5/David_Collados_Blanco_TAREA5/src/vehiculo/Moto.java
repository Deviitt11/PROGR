/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author ALUMNOS_FP
 */
public class Moto extends Vehiculo {
    
    // Atributos
    private int cilindrada;
    
    // Constructor con todos los atributos
    public Moto(int cilindrada, String matricula, int velocidadMax, int anoFabricacion) {
        super(matricula, velocidadMax, anoFabricacion);
        this.cilindrada = cilindrada;
    }

    // Métodos get y set
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    // Método público mostrarDatos que muestre por pantalla el valor de todos sus atributos (incluidos los del padre)
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Cilindrada: " + this.getCilindrada());
    }
    
    
    
    
}
