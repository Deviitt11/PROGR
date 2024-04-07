
package animales;

import interfaz.InterfazAnimal;
import java.util.logging.Level;
import java.util.logging.Logger;

//Implementacion de una interfaz
public class Tortuga implements InterfazAnimal{
    
    final int TIME_SLEEP = 2000;
    int peso;
    int edad;
    double velocidad;
    
    
    //Diferentes metodos para diferentes funciones, algunos devuelven datos
    @Override
    public void dormir(){
        System.out.println("La tortuga se va a dormir");
        
        try {
            Thread.sleep(TIME_SLEEP);
        } catch (InterruptedException ex) {
            Logger.getLogger(Tortuga.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("La tortuga se ha despertado");
    }

    public Tortuga(int peso, int edad, double velocidad) {
        this.peso = peso;
        this.edad = edad;
        this.velocidad = velocidad;
    }
    
    @Override
    public double comer(double kilos) {
        peso += kilos/10;
        
        return peso;
    }

    @Override
    public double devolverVelocidad() {
        return velocidad;
    }
    
    public void cumplirEdad(){
        edad++;
    }
    
}
