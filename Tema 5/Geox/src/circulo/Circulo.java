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
    private final String amarillo;

    public Circulo(int radio, String amarillo){
        
        this.radio = radio;
        this.amarillo = amarillo;
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
