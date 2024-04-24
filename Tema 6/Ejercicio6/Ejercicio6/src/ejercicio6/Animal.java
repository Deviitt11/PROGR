
package ejercicio6;


public abstract class Animal implements InterfazAnimal{
    
    String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Animal (String nombre) {
        this.nombre = nombre;
    }

    public abstract void tipoAnimal();
    
    
    
    
}
