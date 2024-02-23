/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hexagono;

import circulo.Circulo;
import cuadrado.Cuadrado;
import figurageo.FiguraGeo;

/**
 *
 * @author ALUMNOS_FP
 */
public class Hexágono extends FiguraGeo{
    
    double lado, apotema;
    
    public Hexágono(double lado, double apotema, String color) {
        
        super(color);
        this.lado = lado;
        this.apotema = apotema;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }
    
    // Crear hijos
    Cuadrado cuadrado = new Cuadrado(2.5, 2.5, "rojo");
    Circulo circulo = new Circulo(2, "amarillo");
    Hexágono hex = new Hexágono(3.0, 5.0, "morado");
    
    //System.out.println ("Area cuadrado: " + cuadrado.cal);
            
    
    
}
