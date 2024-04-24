/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cantantes;
import interfaces.*;

/**
 *
 * @author david
 */
public class Persona implements PuedeCantar {

    @Override
    public void cantar() {
        System.out.println("do re mi fa sol la si");
    }
    
    
}
