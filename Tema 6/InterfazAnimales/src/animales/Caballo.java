
package animales;

//Implementacion de 2 interfaces

import interfaz.InterfazAnimal;
import interfaz.InterfazMamifero;
import java.util.Random;

public class Caballo implements InterfazAnimal, InterfazMamifero{
    double velocidad;
    double peso;

    @Override
    public void dormir() {
        //Generar un tiempo random entre 1 y 4 segundos
        Random random = new Random();
        int tiempoDormir = random.nextInt(1,4);
        
       System.out.println("El  caballo se va a dormir " + tiempoDormir + "milisegundos");
        
       try {
            Thread.sleep(tiempoDormir);
       } catch (InterruptedException ex) {
           ex.printStackTrace();
       }
        System.out.println("El caballo se ha despertado");
    }

    public Caballo(double velocidad, double peso) {
        this.velocidad = velocidad;
        this.peso = peso;
    }
    
    @Override
    public double comer(double kilos) {
        peso += kilos;
        
        return peso;
    }

    @Override
    public double devolverVelocidad() {
        return velocidad;
    }

    @Override
    public int mesesGestacion() {
        return 10;
    }
    
    
}
