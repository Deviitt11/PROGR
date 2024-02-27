
package granja;

import animales.AnimalGranja;
import animales.Mastin;
import animales.PastorAleman;
import animales.Perro;
import composicion.Cencerro;
import composicion.Vaca;


public class Granja {

    
    public static void main(String[] args) {
        
        // crear objetos
        AnimalGranja animal = new AnimalGranja("Pato", 2);
        Perro perro = new Perro(1, "Manchas", 1);
        PastorAleman pastorAleman = new PastorAleman(2, "JulioAlberto", 20);
        Mastin mastinL = new Mastin(1, "Julio", 50.0);
        
        pastorAleman.comer(10);
        pastorAleman.hablar();
        
        boolean sacrificado = pastorAleman.sacrificar();
        
        // metodo especifico de pastoraaLE
        pastorAleman.guiarOvejas();
       
        // pastor continua con vida
        pastorAleman.setEdad(20);
        
        sacrificado = pastorAleman.sacrificar();
        
        ////////
        
        // Compo
        Cencerro cencerro = new Cencerro("2222");
        
        Vaca vaca1 = new Vaca(1, cencerro, "Paco",33.5);
        Vaca vaca2 = new Vaca(1, "Paco",33.5);
        
        
        
        
        
        
        
    }
    
}
