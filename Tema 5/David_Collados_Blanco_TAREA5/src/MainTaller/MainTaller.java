/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MainTaller;

import factura.Factura;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import persona.Cliente;
import persona.Mecanico;
import vehiculo.Coche;
import vehiculo.Moto;
import vehiculo.Vehiculo;

/**
 *
 * @author ALUMNOS_FP
 */
public class MainTaller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Date fecha = new Date(); // creamos un objeto fecha
        
        // Llamar al método ‘obtenerDiaActual’ y mostrar por pantalla lo que devuelva
        System.out.println(Factura.obtenerDiaActual());
        
        /*
        Crear un arrayList de tipo ‘Vehiculo’ y añadir varios objetos (mínimo uno de la clase Moto y Coche)
        con unos valores cualesquiera (no es necesario que se pidan con el Scanner).
        */
        ArrayList<Vehiculo> vehiculos = new ArrayList<>(); // creamos el arrayList de tipo Vehiculo
        
        Moto moto1 = new Moto(250, "1234PDP", 150, 2023); // creamos un objeto de tipo Moto
        Moto moto2 = new Moto(333, "4562DJE", 275, 2012);
        
        Coche coche1 = new Coche(4, "Diesel", "1107 DVT", 300, 2023); // creamos un objeto de tipo Coche
        Coche coche2 = new Coche(2, "Diesel", "1134 GUT", 288, 2015);
        
        vehiculos.add(moto1); // añadimos el objeto moto al array
        vehiculos.add(moto2);
        vehiculos.add(coche1); // añadimos el objeto coche al array
        vehiculos.add(coche2);
        
        // Crear un objeto de la clase Mecanico
        Mecanico mecanico = new Mecanico("8888888F", "Manolin");
  
        // Crear un objeto de la clase Cliente y llamar al método ‘mostrarVehiculo’
        Cliente cliente = new Cliente(vehiculos, "681347823", "Austin");
        cliente.mostrarVehiculo();
        
        // Crear un arrayList de objetos de la clase Factura
        ArrayList<Factura> facturas = new ArrayList<>();
        
        /*
        Llamar al método ‘arreglarVehiculo’ de la clase Mecánico pasándole como parámetro un String.
        En el caso el método devuelva verdadero imprimir por pantalla “vehículo arreglado”, 
        crear un objeto de la clase Factura, llamar al método ‘calcularPrecio’ y añadir la Factura creada al arrayList.
        En caso de que ‘arreglarVehiculo’ devuelva ‘false’ se debe imprimir “Piezas pedidas a Alemania
        */
        boolean resultado = mecanico.arreglarVehiculo("1234PDP", vehiculos); // llamamos al metodo arreglarVehiculo pasándole un String como parámetro y almacenamos el resultado en una variable
       
        if(resultado == true) { // si es verdadero, imprimimos mensaje por pantalla
            System.out.println("Vehiculo arreglado");
            
            Factura factura1 = new Factura(33333.3, fecha, cliente); // creamos el objeto de la clase 
            
            factura1.calcularPrecio(50.0); // llamada al método
        
            facturas.add(factura1); // añadimos la factura al arrayList de facturas
        }
        else{ // si devuelve falso, imprimimos otro mensaje
            System.out.println("Piezas pedidas a Alemania"); 
        }
        
        /*
        Llamar al método ‘arreglarVehiculo’ de la clase Mecánico pasándole como parámetro un vehículo. 
        En el caso el método devuelva verdadero imprimir por pantalla “vehículo arreglado”, crear un objeto de la clase Factura, llamar al método ‘calcularPrecio’ 
        y añadir la Factura creada al arrayList. 
        En caso de que ‘arreglarVehiculo’ devuelva ‘false’ se debe imprimir “Piezas pedidas a Alemania”
        */
        boolean resultado2 = mecanico.arreglarVehiculo2(coche1, vehiculos); // Llamamos al metodo pasándole un vehiculo como parametro y almacenamos el resultado en una variable
          
        if(resultado2 == true) { // si es verdadero, imprimimos mensaje por pantalla
            System.out.println("Vehiculo arreglado");
            
            Factura factura2 = new Factura(40000.2, fecha, cliente); // creamos el objeto de la clase factura
            
            factura2.calcularPrecio(114.5); // // llamada al método
        
            facturas.add(factura2); // añadimos la factura al arrayList de facturas
        }
        else{
            System.out.println("Piezas pedidas a Alemania"); 
        }
        
        /*
        Recorrer el array de la clase Factura y mostrar por pantalla el valor de los atributos de cada factura (del atributo cliente con mostrar el nombre es suficiente)
        */
        for(Factura f: facturas){
            f.mostrarFactura();
        }
        
    }
    
}
