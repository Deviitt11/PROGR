/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainabstractfactory;

import factory.AbstractFactoryReino;
import interfaces.*;

/**
 *
 * @author ALUMNOS_FP
 */
public class Kingdom {
    
    AbstractFactoryReino factory;
    
    public Kingdom(AbstractFactoryReino factory) {
        this.factory = factory;
    }
    
    public void iniciarReino(){
        InterfazEjercito ejercito = factory.crearEjercito();
        interfazArmas arma = factory.crearArmas();
        InterfazCastillo castillo = factory.crearCastillo();
        
        ejercito.lanzar();
        arma.lanzar();
        castillo.defender();
    }
   
}
