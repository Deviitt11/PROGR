
package ejercicio6;


public class Perro extends Animal {

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void tipoAnimal() {
        System.out.println("Soy un perro");
    }

    @Override
    public void comunicarse() {
        System.out.println("Guau Guau");
    }
    
}
