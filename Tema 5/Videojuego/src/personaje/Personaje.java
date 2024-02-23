/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personaje;

/**
 *
 * @author ALUMNOS_FP
 */
public class Personaje {
    
    // Atrib público
    public String IDpub;
    
    // Atrib privado
    private String IDpriv;
    
    protected int vida;
    protected String nombre;
    protected int ataque;

    public Personaje(String IDpub, String IDpriv, int vida, String nombre, int ataque) {
        this.IDpub = IDpub;
        this.IDpriv = IDpriv;
        this.vida = vida;
        this.nombre = nombre;
        this.ataque = ataque;
    }

    public Personaje(String IDpub, int vida, int ataque, String nombre) {
        this.IDpub = IDpub;
        this.vida = vida;
        this.nombre = nombre;
        this.ataque = ataque;
    }
    
    // metodo atacar
    public void atacar(Personaje objetivo){
        
        objetivo.recibirAtaque(this.ataque);
        
    }
    
    // metodo atacar
    public void recibirAtaque(int ataque){
        
        this.vida -= ataque;
        
        if(vida <= 0) {
            System.out.println("Personaje derrotado");
        }
        else{
            System.out.println("Personaje atacado, vida restante: " + this.vida);
        }
    }
    
    public void mostrarPers(){
        System.out.println();
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Vida: " + this.vida);
        System.out.println("Ataque: " + this.ataque);
    }
    
    

    
    
    
    
}
