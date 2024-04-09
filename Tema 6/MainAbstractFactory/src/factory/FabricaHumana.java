/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import interfaces.InterfazCastillo;
import interfaces.InterfazEjercito;
import interfaces.interfazArmas;
import humanos.*;

/**
 *
 * @author ALUMNOS_FP
 */
public class FabricaHumana implements AbstractFactoryReino {

    @Override
    public InterfazEjercito crearEjercito() {
        return new EjercitoHumano();
    }

    @Override
    public interfazArmas crearArmas() {
        return new ArmaHumana();
    }

    @Override
    public InterfazCastillo crearCastillo() {
        return new CastilloHumano();
    }
    
}
