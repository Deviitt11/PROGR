/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuadrado;

import figurageo.FiguraGeo;

/**
 *
 * @author ALUMNOS_FP
 */
public class Cuadrado extends FiguraGeo{
    
    double lado;

    public Cuadrado(double lado, double area, String color) {
        super(area, color);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        double area = lado*2;
        
        super.setArea(area);
        
        return super.calculaArea(); 
    }
    
    
    
    
    
    
}
