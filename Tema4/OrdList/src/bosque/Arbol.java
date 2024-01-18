/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bosque;

import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author ALUMNOS_FP
 */
public class Arbol implements Comparable<Arbol>{

    double altura;
    TIPOS_ARBOL tipo;
    int edad;
    
    public int compareTo(Arbol arbol) {
        return this.getEdad() - arbol.getEdad();
    }
    


    public static enum TIPOS_ARBOL {
        ROBLE, PINO, ABEDUL, ACACIA, ENCINA
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public TIPOS_ARBOL getTipo() {
        return tipo;
    }

    public void setTipo(TIPOS_ARBOL tipo) {
        this.tipo = tipo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Arbol(double altura, TIPOS_ARBOL tipo, int edad) {
        this.altura = altura;
        this.tipo = tipo;
        this.edad = edad;
    }

    // Mostrar arbol
    public void showArbol() {
        System.out.println("Altura: " + this.altura + ", Edad: " + this.edad + ", Tipo: " + this.tipo);
    }
    
    
    
    

}
