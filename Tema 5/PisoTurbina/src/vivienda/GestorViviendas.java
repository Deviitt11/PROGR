package vivienda;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Carmen
 */
public class GestorViviendas {

    final String[] DIRECCIONES = {"Calle Corrida, nº8", "Calle Corrida, nº13", "Calle Aguado, nº30", "Calle Ezcurdia, nº26", "Calle Grande, nº30", "Calle de Los Moros, nº2"};

    //Metodo
    public void generarViviendas(ArrayList<Vivienda> viviendas, int numViviendas) {
        //Generamos varias viviendas con un bucle
        for (int i = 0; i < numViviendas; i++) {
            Piso p = new Piso(5, 'A', 150000, "", 120);
            viviendas.add(p);
        }
    }
    
    private char obtenerPuertaRand(){
        Random random = new Random();
        
        char puerta = (char) (random.nextInt(26) + 'A');
        
        return puerta;
    }

    private String obtenerCalleAleatoria() {
        Random random = new Random();
        int indice = random.nextInt(DIRECCIONES.length);
        
        return DIRECCIONES[indice];
    }
    
    // Método --> Nº Planta: devolver un entero aleatorio entre 1-7
    public int plantaRand(){
        Random r = new Random();
        int x = r.nextInt(-1,7);
        return x;
    }
    // Método --> Superficie: devolver un entero random entre 60 y 210
    public int superRand(){
        Random r = new Random();
        int x = r.nextInt(60,210)+1;
        return x;
    }
}
