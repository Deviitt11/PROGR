
package ejercicio6;

import java.util.ArrayList;


public class MainAnimales {

   
    public static void main(String[] args) {
       
        //Crear objetos
        Gato garfield = new Gato("Gar");
        Perro pluto = new Perro("Pluto");
        
        //Crear arraylist (Dentro del array list hay polimorfismo, ya que habra gatos y perros)
        ArrayList<Animal> animales = new ArrayList<>();
                
        //Para recorrer el arraylist se pone lo que va dentro de <> y luego un nombre, despues : nombre del arraylist (en este caso animales)
        for(Animal anim: animales) {
            System.out.println(anim);
        }
        
        
    }
    
}
