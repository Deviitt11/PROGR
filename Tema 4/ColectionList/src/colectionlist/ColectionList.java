/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colectionlist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ALUMNOS_FP
 */
public class ColectionList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Integer> listaNum = new ArrayList<Integer>();
        
        // Añadir elementos
        listaNum.add(4); // No se puede en array
        listaNum.add(9);
        listaNum.add(10);
        
        // Obtener tamaño de la lista
        listaNum.size(); // array.length
        
        // Obtener un elemento
        listaNum.get(2); // array[0]
        
        // Eliminar un elemento
        listaNum.remove(0); // No se puede en array
        
        // Vaciar mi lista
        //listaNum.clear();
        
        // Comprobar si mi lista está vacía
        listaNum.isEmpty();
        
        // Recorrer el arrayList
        for (int i = 0; i < listaNum.size(); i++) {
            System.out.println("indice: " + i + " Elemento: " + listaNum.get(i));
        }
        
        //foreach
        for(Integer num: listaNum) {
            System.out.println("Elemento: " + num);
        }
        
        // Ejemplo media numeros
        Scanner s = new Scanner(System.in);
        ArrayList<Double> listaDou = new ArrayList<>();
        double num = 1;
        
        while(num != 0) {
            System.out.println("Introduce un número (0 para finalizar): ");
            num = s.nextDouble();
            
            if(num != 0) {
                listaDou.add(num);
            }   
        }
        double media = calcMedia(listaDou);     
    }
    
    public static double calcMedia(ArrayList<Double> listaNuMB){
        double suma = 0;
        
        for(Double num: listaNuMB){
            suma += num;
        }
        
        double media = suma / listaNuMB.size();
        
        return media;
    }
    
}
