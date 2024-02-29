/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

import java.util.ArrayList;
import vehiculo.Vehiculo;

/**
 *
 * @author ALUMNOS_FP
 */
public class Cliente extends Persona{
    
    // Atributos
    private ArrayList<Vehiculo> vehiculos; // ArrayList de objetos de la clase Vehiculo
    private String telefono;
    
    // Constructor con todos los atributos
    public Cliente(ArrayList<Vehiculo> vehiculos, String telefono, String dni, String nombre) {
        super(dni, nombre);
        this.vehiculos = vehiculos;
        this.telefono = telefono;
    }

    // Constructor con todos los atributos menos teléfono (y que lo inicialice a “”)
    public Cliente(ArrayList<Vehiculo> vehiculos, String dni, String nombre) {
        super(dni, nombre);
        this.vehiculos = vehiculos;
        this.telefono = "";
    }
    
    // Métodos get y set
    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    // Método ‘mostrarVehiculo’ que recorra la colección de vehículos e imprima por pantalla el valor de todos sus atributos
    public void mostrarVehiculo(){
        for(Vehiculo v: vehiculos) {
           v.mostrarDatos();
        }
    }
}
