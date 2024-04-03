/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesfiguras;

public abstract class Figura {
    
    protected double area;
    protected double perimetro;
    
    public void mostrarArea(){
        System.out.println("El area es "+ area);
    }
    
    public void mostrarPerimetro(){
        System.out.println("El perimetro es "+ perimetro);
    }
    
    public abstract double calcularArea();
    
    public abstract double calcularPerimetro();

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
    
    
}
