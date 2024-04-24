
package ejercicio6;


public class Gato extends Animal {
    
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void tipoAnimal() {
        System.out.println("Soy un Gato");
    }

    @Override
    public void comunicarse() {
        System.out.println("Miau Miau");
    }
}
