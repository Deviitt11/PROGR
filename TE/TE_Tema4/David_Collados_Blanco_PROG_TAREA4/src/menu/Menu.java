/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menu;

import java.util.ArrayList;
import java.util.HashMap;
import matrix.Matrix;
import java.util.Scanner;
import lista.Lista;
import mapa.Mapa;

/**
 *
 * @author david
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Se debe crear un menú con las siguientes opciones:
        
        //-Matrices 4x4:
            //1. Generar matrices aleatorias
            //2. Comprobar matrices son iguales
            //3. Mostrar matrices
            
        //-Lista:
            //4. Rellenar lista
            //5. Ordenar lista
            //6. Mostrar palabra más larga
            //7. Mostrar lista
            
        //-Mapa:
            //8. Añadir elemento a mapa
            //9. Vaciar mapa
            //10. Mostrar mapa
            
        //-Otras opciones:
            //11. Salir del programa
            
        int opcion;  // Creamos la variable opción que nos servirá para el número del menú
        
        Scanner s = new Scanner(System.in); // Creamos el Scanner para leer por teclado
        
        // Creamos las matrices vacías y declaramos sus dimensiones (4x4)
        int rows = 4;
        int columns = 4;
        int[][] m1 = new int[rows][columns];
        int[][] m2 = new int[rows][columns];
        
        ArrayList<String> listaPal = new ArrayList<>(); // Creamos la lista
        
        HashMap<Integer, String> mapa = new HashMap<>(); // Creamos el hashMap
        
        int contador = 0; // contador para el hashMap
        

        do { // do while para el menú, se mostrará hasta que se introduzca el número 11 (salir) o un número fuera del rango 1-11 (opción no válida)

            // El menú que el usuario ve en la consola
            System.out.println("Introduce un numero (1-11): ");
            System.out.println("1. Generar matrices aleatorias");
            System.out.println("2. Comprobar matrices son iguales");
            System.out.println("3. Mostrar matrices");
            System.out.println("4. Rellenar lista");
            System.out.println("5. Ordenar lista");
            System.out.println("6. Mostrar palabra mas larga");
            System.out.println("7. Mostrar lista");
            System.out.println("8. Anadir elemento a mapa");
            System.out.println("9. Vaciar mapa");
            System.out.println("10. Mostrar mapa");
            System.out.println("11. Salir del programa");

            opcion = s.nextInt(); // Leemos el número que introduce el usuario
 
            switch (opcion) { // Menú Switch, cada opción realiza su correspondiente acción
                case 1: // OPCIÓN 1: GENERAR MATRICES ALEATORIAS
                    m1 = Matrix.generaMatrix1(rows, columns);
                    m2 = Matrix.generaMatrix2(rows, columns);
                    break;
                case 2: // OPCIÓN 2: COMPROBAR MATRICES SON IGUALES

                    break;
                case 3: // OPCIÓN 3: MOSTRAR MATRICES
                          
                    Matrix.muestraMatrix(m1, rows, columns);
                    Matrix.muestraMatrix(m2, rows, columns);
                    break;
                case 4: // OPCIÓN 4: RELLENAR LISTA
                    s.nextLine(); // Limpiamos el buffer al pasar de leer un número a una cadena
                    Lista.rellenaLista(listaPal);
                    break;
                case 5: // OPCIÓN 5: ORDENAR LISTA
                    if(listaPal.size() == 0) {
                        System.out.println("Primero se debe rellenar con valores la estructura de almacenamiento\n");
                        break;
                    }
                    Lista.ordenaLista(listaPal);
                    break;
                case 6: // OPCIÓN 6: MOSTRAR PALABRA MÁS LARGA
                    if(listaPal.size() == 0) {
                        System.out.println("Primero se debe rellenar con valores la estructura de almacenamiento\n");
                        break;
                    }
                    Lista.palabraMasLarga(listaPal);
                    break;
                case 7: // OPCIÓN 7: MOSTRAR LISTA
                    if(listaPal.size() == 0) {
                        System.out.println("Primero se debe rellenar con valores la estructura de almacenamiento\n");
                        break;
                    }
                    Lista.muestraLista(listaPal);
                    break;
                case 8: // OPCIÓN 8: AÑADIR ELEMENTO A MAPA
                    s.nextLine(); // Limpiamos el buffer al pasar de leer un número a una cadena
                    Mapa.incluyeElemento(mapa, contador);
                    break;
                case 9: // OPCIÓN 9: VACIAR MAPA
                    if(mapa.isEmpty()){
                        System.out.println("Primero se debe rellenar con valores la estructura de almacenamiento\n");
                        break;
                    }
                    Mapa.vaciaMapa(mapa);
                    break;
                case 10: // OPCIÓN 10: MOSTRAR MAPA
                    if(mapa.isEmpty()){
                        System.out.println("Primero se debe rellenar con valores la estructura de almacenamiento\n");
                        break;
                    }
                    Mapa.muestraMapa(mapa);
                    break;
                case 11:
                    break; // Salir del programa: con está opción se deberá salir del menú y acabar el programa.
                default:
                    System.out.println("Opcion no valida\n"); // opción por defecto que indica que la opción no ha sido valida en caso de introducir un número no valido.
            }
        } while (opcion != 11);

    }

}
