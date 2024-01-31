/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercdiego;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class EjercDiego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //cadenaInvertida(); // EJERCICIO 1
        //minusToMas(); // EJERCICIO 2
        
        // Ejemplo media numeros, EJERCICIO 3
//        Scanner s = new Scanner(System.in);
//        ArrayList<Double> listaDou = new ArrayList<>();
//        double num = 1;
//        
//        while(num != 0) {
//            System.out.println("Introduce un número (0 para finalizar): ");
//            num = s.nextDouble();
//            
//            if(num != 0) {
//                listaDou.add(num);
//            }   
//        }
//        double media = calcMedia(listaDou);
//        System.out.println("La media es: " + media);  
//        
//        // EJERCICIO 4
//        int numero;
//        int[] arrayDesord = {5,2,7,9,1};
//        
//        System.out.println("Array original: " + Arrays.toString(arrayDesord));
//        arrayOrdenado(arrayDesord);
        
        // EJERCICIO 5
//        numPalabras();
//        
//        // EJERCICIO 6
//        vocales();
//        
//       // EJERCICIO 1 MATRICES
//       creaYMuestraMatriz();
        
        // EJERCICIO 2 MATRICES
        solicitaDim();
        
        
    }
    
    /*
    EJERCICIO 1
    Realizar un programa que solicite por teclado una cadena y la almacene en otro vector invertida.
    El contenido de dicho vector se mostrará también en la salida estándar.
    */    
    public static void cadenaInvertida() {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce una cadena: ");
        String cadena = s.nextLine();
        
        // Creamos el vector con la longitud de la cadena
        char[] cadInvertida = new char[cadena.length()];
     
        // Bucle para invertir la cadena
        for (int i = 0; i < cadena.length(); i++) {
            cadInvertida[i] = cadena.charAt(cadena.length() - 1 - i);
        }
        
        System.out.println("Cadena invertida: ");
        for (char c : cadInvertida) {
            System.out.println(c);
        }
        System.out.println();
    }
    
    /*
    EJERCICIO 2
    Leer desde la entrada estándar una entrada en minúsculas y escribirla en mayúsculas
    */
    public static void minusToMas(){
        
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce una cadena en minúsculas: ");
        String cadena = s.nextLine();
        
        System.out.println(cadena.toUpperCase());
    }
    
    /*
    EJERCICIO 3
    Introducir números enteros en un array, finalizando cuando el usuario escriba un 0 (el 0 no se almacena)
    Calcula la media de dichos números
    */
    public static double calcMedia(ArrayList<Double> listaNuMB){
        double suma = 0;
        
        for(Double num: listaNuMB){
            suma += num;
        }
        
        double media = suma / listaNuMB.size();
        
        return media;
    }
    
    /*
    EJERCICIO 4
    Ordenar un array de números enteros de menor a mayor y mostrarlo ordenado en pantalla
    */
    public static void arrayOrdenado(int[] array) {
        
        Arrays.sort(array);
       
        System.out.println("Array ordenado: " + Arrays.toString(array));
            
    }
    
    /*
    EJERCICIO 5
    Solicitar una línea por teclado y contar el número de palabras que tiene
    */
    public static void numPalabras(){
        
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce una línea de texto: ");
        String linea = s.next();
           
        String[] palabras = linea.split(" ");
        System.out.println("Número de palabras: " + palabras.length);   
        
    }
    
    /*
    EJERCICIO 6
    Contar el número de vocales de una cadena de caracteres solicitada previamente desde teclado
    */
    public static int vocales(){
        
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce una cadena de caracteres: ");
        String cadena = s.nextLine();
        
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char c = Character.toLowerCase(cadena.charAt(i));
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        return contador;
    }
    
    /*
    EJERCICIO 1 MATRICES
    Crea una matriz de 3x3 con los números del 1 al 9. Mostrarla por pantalla, tal como se representa en una matriz
    */
    public static void creaYMuestraMatriz(){
        int[][] matriz = new int[3][3];
        int contador = 1;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println(); // salto de linea para cada nueva fila
        }
    }
    
    /*
    EJERCICIO 2 MATRICES
    Crea una matriz de 5 filas y n columnas se solicitará la dimensión al usuario.
    Rellena dicha matriz con números aleatorios entre 0 y 10.
    */
    public static int[][] solicitaDim(){
        int rows = 5;
        int columns = 0;
        
        int minimo = 0;
        int maximo = 10;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el numero de columnas: ");
        columns = s.nextInt();
        
        int[][] matriz = new int[rows][columns];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                Random r = new Random();
                int randNumb = r.nextInt(minimo, maximo) + 1; // Genera un número aleatorio entre 10 y 99 (98 + 1)
                matriz[i][j] = randNumb; // se asigna un número aleatorio a cada elemento de la matriz
            }
        }
        return matriz;
    }
    
    /*
    EJERCICIO 3
    Crear dos matrices de nxm y sumar sus valores, los resultados se deben almacenar en otra matriz.
    Los valores y la dimensión, serán insertados por el usuario. Mostrar las matrices originales y el resultado.
    */
    public static void sumaMatrices(){
        Scanner scanner = new Scanner(System.in);

        // Pedir las dimensiones de las matrices
        System.out.print("Ingrese el número de filas (n): ");
        int n = scanner.nextInt();
        System.out.print("Ingrese el número de columnas (m): ");
        int m = scanner.nextInt();

        // Crear las matrices
        int[][] matriz1 = new int[n][m];
        int[][] matriz2 = new int[n][m];
        int[][] matrizSuma = new int[n][m];

        // Llenar y mostrar la primera matriz
        System.out.println("Ingrese los valores para la primera matriz:");
        llenarMatriz(scanner, matriz1);
        System.out.println("Primera Matriz:");
        mostrarMatriz(matriz1);

        // Llenar y mostrar la segunda matriz
        System.out.println("Ingrese los valores para la segunda matriz:");
        llenarMatriz(scanner, matriz2);
        System.out.println("Segunda Matriz:");
        mostrarMatriz(matriz2);

        // Sumar las matrices y mostrar el resultado
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        System.out.println("Matriz Resultante:");
        mostrarMatriz(matrizSuma);
    }
    
    private static void llenarMatriz(Scanner scanner, int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }
    
    private static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }  
}
