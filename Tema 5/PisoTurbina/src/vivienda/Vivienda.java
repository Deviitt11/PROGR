/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vivienda;

import java.util.Date;

/**
 *
 * @author ALUMNOS_FP
 */
public class Vivienda {
    
    double precio;
    Date antiguedad = new Date();
    String direccion;
    int superficie;

    public Vivienda(double precio, Date antiguedad, String direccion, int superficie) {
        this.precio = precio;
        this.antiguedad = antiguedad;
        this.direccion = direccion;
        this.superficie = superficie;
    }

    public Vivienda(double precio, String direccion, int superficie) {
        this.precio = precio;
        this.direccion = direccion;
        this.superficie = superficie;
    }
    
    // Constructor de copia
    public Vivienda(Vivienda v){
        this.precio = v.getPrecio();
        this.antiguedad = v.getAntiguedad();
        this.direccion = v.getDireccion();
        this.superficie = v.getSuperficie();
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(Date antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    @Override
    public String toString() {
        return "Vivienda\n" + 
                "precio=" + precio + 
                ", \nantiguedad=" + antiguedad + 
                ", \ndireccion=" + direccion + 
                ", \nsuperficie=" + superficie;
    }
    
    public void mostrarVivienda(){
        System.out.println("Vivienda\n" + 
                "precio=" + precio + 
                ", \nantiguedad=" + antiguedad + 
                ", \ndireccion=" + direccion + 
                ", \nsuperficie=" + superficie);
    }
    
    
    
    
    
    
}
