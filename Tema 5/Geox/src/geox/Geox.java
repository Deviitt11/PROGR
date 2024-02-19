/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geox;

import figurageo.FiguraGeo;

/**
 *
 * @author ALUMNOS_FP
 */
public class Geox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FiguraGeo geo = new FiguraGeo(0, "verde");
        
        // Mostrar figura
        geo.mostrarFigura();
        
        System.out.println("El área vale: " + geo.getArea() + ", el color es: " + geo.getColor());
        
        
        
    }
    
}
