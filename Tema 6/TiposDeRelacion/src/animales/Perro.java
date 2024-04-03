
package animales;


public class Perro extends AnimalGranja{
    
int edad;
final int MAX_EDAD = 15;

public Perro(int edad, String nombre, double peso){
    super(nombre, peso);
    this.edad = edad;
}   
    
@Override
 public void hablar(){
     System.out.println("Hablar no definido");
 }
 
 public boolean sacrificar(){
     if(this.edad>=MAX_EDAD){
         System.out.println("Se debe sacrificar");
         return true;
     }else { System.out.println("Te has librado de momento");
     return false;
     }
 }
}
