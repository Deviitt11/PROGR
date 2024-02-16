package mamifero;

public class Mamifero {
    
//Atributos
    
double peso;
double altura;
String especie;

public void setPeso(double peso){
    
    this.peso = peso;
}
public double getPeso(){
    return this.peso;
}

    public double getAltura() {
        return altura;
    }

    public String getEspecie() {
        return especie;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Mamifero(double peso, double altura, String especie) {
        this.peso = peso;
        this.altura = altura;
        this.especie = especie;
    }   
    
    public Mamifero(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
        this.especie = especie;
    }   
    
    // sobrecarga métodos
    public void hablar(String sonido) {
        System.out.println("El animal dice: " + sonido);
    }
    
    public void hablar(String sonido, String especie) {
        System.out.println("El " + especie + " dice: " + sonido);
    }
    
    public void actualizarPeso(double peso){
        this.peso = peso;
    }
    
    public void actualizarPeso(String peso){
        this.peso= Double.parseDouble(peso); //Pasar el double a String
    }
    
    // Método estático
    public static double convertAKilos(double gramos) {
        
        double kg = gramos/1000;
        
        return kg;
    }
}