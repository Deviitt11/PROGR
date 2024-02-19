/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mamifero;

/**
 *
 * @author ALUMNOS_FP
 */
public class Felino extends Mamifero{
    
    int velocidad;
    
    public Felino(double peso, double altura, String especie) {
        super(peso, altura, especie);
        this.velocidad = velocidad;
    }

    public Felino(double peso, double altura) {
        super(peso, altura);
        this.velocidad = velocidad;
    }
    
    public void araniar() {
        System.out.println("El gato araña");
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    
    
    
    
}
