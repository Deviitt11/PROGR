/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

import java.util.ArrayList;
import vehiculo.Vehiculo;

/**
 *
 * @author david
 */
public class Mecanico extends Persona {

    // Constructor con todos los atributos
    public Mecanico(String dni, String nombre) {
        super(dni, nombre);
    }
    
    /*
    Método ‘arreglarVehiculo’ que reciba por parámetro una cadena de texto (que corresponde con la matrícula del vehículo) y un ArrayList de la clase Vehículo, 
    y que devuelva un boolean. El método debe recorrer el array y si encuentra un vehículo con la matrícula recibida por parámetro debe eliminar el vehículo del array 
    y devolver ‘true’, en caso contrario debe devolver ‘false’.
    */
    public boolean arreglarVehiculo(String matricula, ArrayList<Vehiculo> vehiculos) {
        
        boolean resultado = false; // creamos una variable booleana para el resultado
        
        for(Vehiculo v: vehiculos) { // recorremos el array
            if(v.getMatricula().equals(matricula)) { // Si el vehículo seleccionado tiene la matrícula recibida por parámetro
                vehiculos.remove(v); // elimina el vehículo del array
                resultado = true; // y devuelve true
            }
        }
        return resultado; 
    }
   
    /*
    Método ‘arreglarVehiculo’ que reciba por parámetro un objeto de la clase vehículo y un ArrayList de la clase Vehículo, y que devuelva un boolean.
    El método debe recorrer el array y si encuentra un vehículo que sea igual al recibido por parámetro debe eliminar el vehículo del array y devolver ‘true’,
    en caso contrario debe devolver ‘false’.
    */
    public boolean arreglarVehiculo2(Vehiculo vehiculo, ArrayList<Vehiculo> vehiculos) {
        
        boolean resultado = false; // creamos una variable booleana para el resultado
        
        for(Vehiculo v: vehiculos) { // recorremos el array
            if(v.equals(vehiculo)) { // si el vehiculo del array es igual al vehículo pasado por parámetro
                vehiculos.remove(v); // se elimina el vehiculo del array
                resultado = true; // y devuelve true
            }
        }
        return resultado; // en caso contrario, devuelve falso
    }
    
}
