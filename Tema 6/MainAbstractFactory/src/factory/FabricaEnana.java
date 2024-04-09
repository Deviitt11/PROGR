/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import enanos.*;
import interfaces.InterfazCastillo;
import interfaces.InterfazEjercito;
import interfaces.interfazArmas;


/**
 *
 * @author ALUMNOS_FP
 */
public class FabricaEnana implements AbstractFactoryReino{

    @Override
    public InterfazEjercito crearEjercito() {
       return new EjercitoEnano();
    }

    @Override
    public interfazArmas crearArmas() {
        return new ArmaEnano();
    }

    @Override
    public InterfazCastillo crearCastillo() {
        return new CastilloEnano();
    }
}
