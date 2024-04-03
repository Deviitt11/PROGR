package brujo;
 
import personaje.Personaje;
 
 
public class Brujo extends Personaje {
 
    int mana;
 
    public Brujo(int mana, String publicId, int vida, int ataque, String nombre) {
        super(publicId, vida, ataque, nombre);
        this.mana = mana;
    }
    
    public void lanzarHechizo(int poderHechizo, Personaje objetivo){
        if(mana>=poderHechizo){
            mana-=poderHechizo;    
            objetivo.recibirAtaque(poderHechizo);
        }
    }

    @Override
    public void mostrarPers() {
        super.mostrarPers();
        System.out.println("Maná: " + this.mana);
    }

}