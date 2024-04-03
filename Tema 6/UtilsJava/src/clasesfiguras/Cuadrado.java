/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesfiguras;

public class Cuadrado extends Figura{
    
    public double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double area = lado*lado;
        super.setArea(area);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro= lado*4;
        super.setArea(perimetro);
        return perimetro;
    }
    
}