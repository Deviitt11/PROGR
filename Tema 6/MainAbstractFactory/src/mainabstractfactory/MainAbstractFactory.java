/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainabstractfactory;

import factory.FabricaElfica;
import factory.FabricaEnana;
import factory.FabricaHumana;

/**
 *
 * @author ALUMNOS_FP
 */
public class MainAbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String elecEspecie = "";
        if(args.length > 0) {
            elecEspecie = args[0];
        }
        
        Kingdom reino;
        
        switch (elecEspecie) {
            case "Humano":
                reino = new Kingdom(new FabricaHumana());
                break;
            case "Enano":
                reino = new Kingdom(new FabricaEnana());
                break;
            case "Elfo":
                reino = new Kingdom(new FabricaElfica());
                break;
            default:
                reino = new Kingdom(new FabricaElfica());
        }
        
        
    }
    
}
