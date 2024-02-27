
package animales;


public class AnimalGranja {
    
    
protected String nombre;   
protected double peso;

public void hablar(){

    System.out.println("Hablar no definido: ");
         
}
public double comer(int kilosPienso){
    System.out.println(this.nombre + " esta comiendo"); 
    this.peso += kilosPienso*0.2;
    return this.peso;
}    

    public AnimalGranja(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }




@Override
public String toString(){
    return "AnimalGranja: " + " nombre=" + nombre + ", peso=" + peso;
}


}