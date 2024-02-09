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
}