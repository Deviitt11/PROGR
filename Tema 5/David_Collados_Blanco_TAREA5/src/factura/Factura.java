/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factura;


import java.time.LocalDateTime;
import java.util.Date;
import persona.Cliente;

/**
 *
 * @author david
 */
public class Factura {
    
    // Atributos
    private static double precio;
    private static Date fecha;
    private Cliente cliente;
    
    // Constructor con todos los atributos
    public Factura(double precio, Date fecha, Cliente cliente) {
        this.precio = precio;
        this.fecha = fecha;
        this.cliente = cliente;
    }
    
    // métodos get y set
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        Factura.precio = precio;
    }
    

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    /*
    Método estático ‘obtenerDiaActual’ que debe devolver un String de la fecha actual con el siguiente formato: día/mes/año
    */
    public static String obtenerDiaActual(){
        return fecha.getDay() + "/" + fecha.getMonth() + "/" + fecha.getYear();
    }
    
    /*
    Método privado ‘calcularIva’ que reciba por parámetro un número decimal y devuelva el 21 por ciento de ese valor.
    */
    private static double calcularIva(double numeroDec){
        return numeroDec*0.21;
    }
    
    /*
    Método público ‘calcularPrecio’ que reciba por parámetro un número decimal y no devuelva nada. 
    Este método debe llamar al método calcularIva para calcular el precio que debe sumarse al precio recibido por parámetro.
    Se debe actualizar el atributo precio con el valor total.
    */
    public static void calcularPrecio(double decimal) {
        
        double precioIva = calcularIva(decimal); // llamamos al metodo calcularIva para calcular el precio que debe sumarse al precio recibido por parámetro
      
        double precioTotal = precioIva + precio; // en otra variable, sumamos todos los precios
        
        precio = precioTotal; // actualizamos el precio
        
        System.out.println("Precio acutalizado"); // mensaje para que el usuario sepa q se actualizó el precio
    }
    
    // método que muestra los datos de la factura
    public void mostrarFactura(){
        System.out.println("Precio: " + this.getPrecio() + ", fecha: " + this.getFecha() + ", del cliente: " + cliente.getNombre());
    }
    
    
    
}
