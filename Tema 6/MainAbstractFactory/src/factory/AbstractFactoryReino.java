/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package factory;

import interfaces.InterfazCastillo;
import interfaces.InterfazEjercito;
import interfaces.interfazArmas;

/**
 *
 * @author ALUMNOS_FP
 */
public interface AbstractFactoryReino {
    
    public abstract InterfazEjercito crearEjercito();
    public abstract interfazArmas crearArmas();
    public abstract InterfazCastillo crearCastillo();
    
    
    
}
