/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordlist;

import bosque.Arbol;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ALUMNOS_FP
 */
public class OrdList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear arraylist de tipo integer y añadir 5 elementos
        ArrayList<Integer> aI = new ArrayList<>();
        aI.add(1);
        aI.add(2);
        aI.add(3);
        aI.add(4);
        aI.add(5);

        // Crear arraylist de tipo String y añadir 5 elementos
        ArrayList<String> aD = new ArrayList<>();
        aD.add("Hola");
        aD.add("Hello");
        aD.add("Ja");
        aD.add("Bonjour");
        aD.add("Hola");

        // Crear Arraylist de tipo arbol 
        ArrayList<Arbol> aL = new ArrayList<>();

        aL.add(new Arbol(2, Arbol.TIPOS_ARBOL.ACACIA, 10));
        aL.add(new Arbol(10, Arbol.TIPOS_ARBOL.PINO, 50));
        aL.add(new Arbol(6, Arbol.TIPOS_ARBOL.ROBLE, 80));

        // mostrar los datos
        System.out.println(aL);

        // mostrar numberlist
        for (Integer num : aI) {
            System.out.println(num + "");
        }
        System.out.println("");
        
        // mostrar stringList
        for (String palabra : aD) {
            System.out.println(palabra + "");
        }
        System.out.println("");
        
        // mostrar arbolesList
        for(Arbol arbol: aL){
            arbol.showArbol();
        }
        
        // ordenamos los elementos
        Collections.sort(aI);
        Collections.sort(aD);
        
        System.out.println(aI);
        System.out.println(aD);
        
        Collections.sort(aD, Collections.reverseOrder());
        System.out.println(aI);
        
        Collections.sort(aL);
        
        for(Arbol arbol: aL){
            arbol.showArbol();
        }
        
        
    }
    
    

}
