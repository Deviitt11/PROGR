/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package busquedaalg;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ALUMNOS_FP
 */
public class BusquedaAlg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        LinkedList<Integer> lista = generarListNum(100);
        
        System.out.println("Introduce num a buscar: ");
        int numBusc = s.nextInt();
        int indEnc = busquedaSecuencial(lista, numBusc);
        int indEnc2 = busquedaSecuencialMejorada(lista, numBusc);
        
        System.out.println("Indice encontrado : " + indEnc);
        
        
    }
    
    public static int busquedaSecuencial(LinkedList<Integer> lista, int numBusc){
        int indice = -1;
        int iter = 0;
        
        long tiempIni = System.currentTimeMillis();
        
        for (int i = 0; i < lista.size(); i++) {
            
            if(lista.get(i) == numBusc) {
                
                // menos eficiente
                indice = i;
            }
        }
        long tiemFin = System.currentTimeMillis();
        
        System.out.println("Tiempo: " + (tiemFin-tiempIni) + " iteraciones: " + iter);
        return indice;
    }
    
    public static int busquedaSecuencialMejorada(LinkedList<Integer> lista, int numBusc){
        int indice = -1;
        
        int iter = 0;
        
        long tiempIni = System.currentTimeMillis();
        
        for (int i = 0; i < lista.size(); i++) {
            
            if(lista.get(i) == numBusc) {
                
                // menos eficiente
                indice = i;
                return indice;
            }
        }
        
        long tiemFin = System.currentTimeMillis();
        
        System.out.println("Tiempo: " + (tiemFin-tiempIni) + " iteraciones: " + iter);
        return indice;
    }
    
    public static LinkedList<Integer> generarListNum(int tam){
        
        LinkedList<Integer> listNum = new LinkedList<>();
        Random r = new Random();
        
        for (int i = 0; i < 10; i++) {
            int intRand = r.nextInt(1,tam*100);
            listNum.add(intRand);
        }
        return listNum;
    }
    
}
