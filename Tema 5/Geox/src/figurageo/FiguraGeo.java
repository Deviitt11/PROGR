/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurageo;

/**
 *
 * @author ALUMNOS_FP
 */
public class FiguraGeo {
    
    double area;
    String color;
    
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public FiguraGeo(double area, String color) {
        this.area = area;
        this.color = color;
    }
    
    public double calculaArea(){
        System.out.println("Calcular área no");
        
        return -1;
    }
    
    public void mostrarFigura(){
        System.out.println("El área vale: " + area + ", la figura es de color: " + color);
    }
    
    @Override
    public String toString(){
        return "El área vale: " + area + ", la figura es de color: " + color;
    }
    
}
