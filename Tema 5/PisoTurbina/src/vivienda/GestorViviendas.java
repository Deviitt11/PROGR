package vivienda;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Carmen
 */
public class GestorViviendas {

    static final String[] DIRECCIONES = {"Calle Corrida, nº8", "Calle Corrida, nº13", "Calle Aguado, nº30", "Calle Ezcurdia, nº26", "Calle Grande, nº30", "Calle de Los Moros, nº2"};

    //Metodo
    public static void generarViviendas(ArrayList<Vivienda> viviendas, int numViviendas) {
        //Generamos varias viviendas con un bucle
        for (int i = 0; i < numViviendas; i++) {
            
            
                    
            Piso p = new Piso(5, 'A', 150000, "", 120);
            
            viviendas.add(p);
        }
    }
    
    private static char obtenerPuertaRand(){
        Random random = new Random();
        
        char puerta = (char) (random.nextInt(26) + 'A');
        
        return puerta;
    }

    private static String obtenerCalleAleatoria() {
        Random random = new Random();
        int indice = random.nextInt(DIRECCIONES.length);
        
        return DIRECCIONES[indice];
    }
    
    private static String obtenerSuperficieAleatoria() {
        Random random = new Random();
        int indice = random.nextInt(DIRECCIONES.length);
        
        return DIRECCIONES[indice];
    }
    
    // Método --> Nº Planta: devolver un entero aleatorio entre 1-7
    public static int plantaRand(){
        Random r = new Random();
        int x = r.nextInt(-1,7);
        return x;
    }
    // Método --> Superficie: devolver un entero random entre 60 y 210
    public static int superRand(){
        Random r = new Random();
        int x = r.nextInt(60,210)+1;
        return x;
    }
    
    public static void mostrarViviendas(ArrayList<Vivienda> viviendas) {
        for (Vivienda vivienda : viviendas) {
            vivienda.mostrarVivienda();
            
            System.out.println(vivienda.toString());
        }
    }
    
    public static Vivienda addVivienda(ArrayList<Vivienda> viviendas){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce planta (entero): ");
        int planta = Integer.parseInt(s.nextLine());
        
        System.out.println("Introduce puerta (letra): ");
        char letra = s.next().charAt(0);
        
        System.out.println("Introduce superficie (cadena): ");
        int superficie = Integer.parseInt(s.nextLine());
        s.nextLine();
        
        System.out.println("Introduce calle (numero): ");
        String calle = s.nextLine();
        
        Piso piso = new Piso(planta, letra, superficie*1000, calle, superficie);
        viviendas.add(piso);
        return piso;
        
    }
}
