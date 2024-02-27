
package animales;


public class PastorAleman extends Perro{
    
    public PastorAleman(int edad, String nombre, double peso) {
        super(edad, nombre, peso);
    }
    
    public void guiarOvejas(){
        System.out.println("Son ciegas las ovejas o qué loco");
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
    
    
    
    
    
}
