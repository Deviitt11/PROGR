/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;
import clases.*;

/**
 *
 * @author ALUMNOS_FP
 */
public interface interfazPuertaBloqueable extends interfazPuerta{
    
    // método bloquear
    public static void bloquear(){
        System.out.println("Puerta BLOQUEADA");
    }
    
    // método desbloquear
    public static void desbloquear(){
        System.out.println("Puerta DESBLOQUEADA");
    }
}
