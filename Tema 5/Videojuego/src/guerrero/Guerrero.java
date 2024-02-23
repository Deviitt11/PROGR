package guerrero;
 
import personaje.Personaje;
 
 
public class Guerrero extends Personaje{
 
    public Guerrero(int armadura, String publicId, int vida, int ataque, String nombre) {
        super(publicId, vida, ataque, nombre);
        this.armadura = armadura;
    }
    int armadura;
    @Override
    public void recibirAtaque(int ataque){
        int vidaArmadura = armadura + vida;
        if(ataque>armadura){
            super.recibirAtaque(ataque-armadura);
        }
        if(armadura<=0){
            System.out.println("Armadura Destruida");
            vida-=armadura; //para que el ataque restante afecte a la vida después de romperse la armadura
        }else System.out.println("Armadura golpeada, armadura restante " + this.armadura);
    }

    @Override
    public void mostrarPers() {
        super.mostrarPers();
        System.out.println("Armadura: " + this.armadura);
    }
    
    
}