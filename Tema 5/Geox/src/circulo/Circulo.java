/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circulo;

import figurageo.FiguraGeo;
import java.lang.reflect.AccessFlag;

/**
 *
 * @author ALUMNOS_FP
 */
public class Circulo extends FiguraGeo{
    
    double radio;

    public Circulo(int radio, String amarillo){
        super(color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculaArea() {
        double area = Math.PI * Math.pow(radio, 2);
       
        super.setArea(area);
        
        return area;
    }
    
    
    
    
    
    
    
    
}
