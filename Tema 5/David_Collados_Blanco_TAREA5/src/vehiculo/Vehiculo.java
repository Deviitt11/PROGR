/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author ALUMNOS_FP
 */
public class Vehiculo {
    
    // Atributos
    protected String matricula;
    protected int velocidadMax;
    protected int anoFabricacion;
    
    // Constructor con todos los atributos
    public Vehiculo(String matricula, int velocidadMax, int anoFabricacion) {
        this.matricula = matricula;
        this.velocidadMax = velocidadMax;
        this.anoFabricacion = anoFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(int anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }
    
    // Método público mostrarDatos que muestre por pantalla el valor de todos sus atributos
    public void mostrarDatos(){
        
        System.out.println("Matricula: " + this.getMatricula() + ", su velocidad maxima es: " + this.getVelocidadMax() + "y su año de fabricación es: " + this.getAnoFabricacion());
    }
    
    
    
    
}
