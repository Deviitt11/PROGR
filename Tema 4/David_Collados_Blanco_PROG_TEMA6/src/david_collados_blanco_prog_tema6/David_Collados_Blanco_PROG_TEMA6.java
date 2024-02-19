/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package david_collados_blanco_prog_tema6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ALUMNOS_FP
 */
public class David_Collados_Blanco_PROG_TEMA6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("INICIO EJ 1");
        //cadenaNumeros(); // Llamada al método del EJ 1
        
        System.out.println("INICIO EJ 2");
        operacionesVector(); // Llamada al método del EJ 2

        HashMap<Integer, String> mapa = new HashMap<>(); // Creamos el mapa del EJ 3

        System.out.println("INICIO EJ 3");
        cadenaMap(mapa); // Llamada al método del EJ 3

        int[] v1 = new int[100]; // Creamos el vector del EJ 4

        ArrayList<Integer> listaNum = new ArrayList<>(); // Creamos el arrayList del EJ 4

        System.out.println("INICIO EJ 4");
        compruebaEstruc(v1, listaNum); // Llamada al método del EJ 4
          
        System.out.println("INICIO EJ 5");
        matrizCustom(); // Llamada al método del EJ 5

    }

    /*
    EJERCICIO 1
    Se debe pedir al usuario que introduzca una cadena de números separados por coma 
    (Ej: “4,8,2,6,9,23,0”) y se debe almacenar el valor en una variable de tipo String.
    Obtén un array con todos los números introducidos y recorre el array para mostrar por pantalla todos los valores. 
    Además, se debe mostrar por pantalla la suma de todos los números.
     */
    public static void cadenaNumeros() {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce una cadena de numeros separados por coma: ");
        String cadena = s.nextLine();
        
        cadena.split(","); // Separamos por números

        // Creamos el array
        int[] introducidos = new int[cadena.length()];
        
        int suma = 0; // variable para la suma;
       
        // Rellenamos el array con los números introducidos
        for (int i = 0; i < introducidos.length; i++) {
            int caracter = Integer.parseInt(cadena); // Pillamos el primer caracter de la cadena y lo pasamos a numero
            introducidos[i] += caracter;
            caracter += suma;
        }
        
        System.out.println("La suma total es: " + suma);
    }

    /*
    EJERCICIO 2
    Se debe crear un vector de tipo String de tamaño 2. 
    Luego, se debe pedir al usuario que introduzca dos nombres por pantalla y se deben almacenar en el vector. 
    Se debe mostrar por pantalla si los dos elementos del vector son iguales o no 
    sin tener en cuenta las mayúsculas y minúsculas.
    Por último, se debe sustituir todos los caracteres ‘a’ de las cadenas del array 
    por el carácter ‘o’ y se debe recorrer y mostrar los valores del vector. (0,5 puntos).
     */
    public static void operacionesVector() {
     
        // Creamos el vector
        String[] vector = new String[2];

        // Se introducen los nombres en el vector
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce un nombre: ");
        vector[0] = s.nextLine();
        System.out.println("Introduce otro nombre: ");
        vector[1] = s.nextLine();

        // Se comprueban si son iguales
        if (vector[0].equalsIgnoreCase(vector[1])) {
            System.out.println("Los elementos son IGUALES");
        } else {
            System.out.println("Los elementos NO SON IGUALES");
        }

        /*
        Sustituir todos los carácteres a de las cadenas del array por el caracter o
        y recorrer y mostrar los valores del vector
         */
        String cam1 = vector[0].replace("a", "o");
        String cam2 = vector[1].replace("a", "o");
        
        vector[0] = cam1;
        vector[1] = cam2;

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Elemento " + i + ": " + vector[i]);
        }
    }

    /*
    EJERCICIO 3
    Se debe pedir al usuario que introduzca tres cadenas de texto. 
    Cada cadena debe añadirse como un elemento a un HashMap. 
    Por último, debe recorrerse los valores del mapa y comprobar y mostrar por pantalla 
    si cumplen una expresión regular que cumpla lo siguiente:
    Que comience por ‘a’ o ‘A’, que le sigan mínimo dos números, 
    que le sigan una o varias veces ‘#B#’ y que acabe con entre dos y tres números entre 3 y 7.
     */
    public static void cadenaMap(HashMap<Integer, String> mapa) {

        Scanner s = new Scanner(System.in);

        // Pedir al usuario que introduzca 3 cadenas de texto
        System.out.println("Introduce una cadena de texto: ");
        String cad1 = s.nextLine();
        mapa.put(0, cad1);

        System.out.println("Introduce otra cadena de texto: ");
        String cad2 = s.nextLine();
        mapa.put(1, cad2);

        System.out.println("Introduce otra cadena de texto: ");
        String cad3 = s.nextLine();
        mapa.put(2, cad3);

        String regexExp = "[a][A]";

        Pattern p = Pattern.compile(regexExp);

        // Recorrer los valores el mapa y comprobar y mostrar por pantalla
        for (int key : mapa.keySet()) {

            Matcher m1 = p.matcher(cad1);

            if (m1.matches()) {
                System.out.println("La primera cadena COINCIDE");
            } else {
                System.out.println("La primera cadena NO COINCIDE");
            }

            Matcher m2 = p.matcher(cad2);

            if (m2.matches()) {
                System.out.println("La segunda cadena COINCIDE");
            } else {
                System.out.println("La segunda cadena NO COINCIDE");
            }

            Matcher m3 = p.matcher(cad2);

            if (m3.matches()) {
                System.out.println("La tercera cadena COINCIDE");
            } else {
                System.out.println("La tercera cadena NO COINCIDE");
            }
        }
    }

    /*
    EJERCICIO 4
    Se debe crear un vector y un ArrayList e iniciar ambos a los 100 primeros números pares. 
    Después, se debe comprobar que ambas estructuras tienes los mismos datos guardados.
     */
    public static void compruebaEstruc(int[] v1, ArrayList<Integer> listaNum) {

        // Bucle for para rellenar el vector con los 100 primeros números pares
        for (int i = 2; i < v1.length; i++) {
            v1[i] += i;
        }

        // Bucle for para rellenar el arrayList con los 100 primeros números pares
        for (int i = 2; i < listaNum.size(); i++) {
            int elemento = listaNum.get(i);
            elemento += i;
        }

        // Bucle para comparar ambas estructuras
        for (int i = 2; i < v1.length; i++) {
            for (int j = 2; j < listaNum.size(); j++) {
                if (!(v1[i] == listaNum.get(i))) {
                    System.out.println("Las estructuras NO SON IGUALES");
                } else {
                    System.out.println("Las estructuras SON IGUALES");
                }
            }
        }
    }

    /*
    EJERCICIO 5
    Se debe pedir al usuario que introduzca los valores de un matriz (3x3 nueve números enteros).
    Se debe crear una matriz con los valores introducidos por el usuario y luego recorrer y 
    mostrar los valores de la matriz por filas y columnas.
    Por último, se debe calcular la suma de la diagonal principal de la matriz
     */
    /**
     * Hola
     */
    public static void matrizCustom() {
        Scanner s = new Scanner(System.in);

        // Rellenamos la matriz con los valores que introduce el usuario
        int[][] matriz = new int[3][3];

        System.out.println("Introduce los valores para la matriz: ");
        rellenaCustomMatrix(s, matriz, 3, 3); // Llamamos al método que rellena la matriz
        muestraMatrix(matriz, 3, 3); // Llamamos al método que muestra la matriz
        sumaDiagPrinci(matriz); // Llamamos al método que realiza la suma de la diagonal principal

    }

    public static int[][] rellenaCustomMatrix(Scanner s, int[][] matriz, int rows, int columns) { // Recibe como argumentos las filas y columnas, en nuestro caso serán 4

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Introduce el valor: ");
                matriz[i][j] = s.nextInt();
            }
        }
        return matriz;
    }

    public static void muestraMatrix(int[][] m, int rows, int columns) { // Recibe como parámetros una matriz, y los números de filas y columnas
        for (int i = 0; i < rows; i++) { // bucle for para recorrer las filas
            for (int j = 0; j < columns; j++) { // bucle for para recorrer las columnas
                System.out.println(m[i][j] + ""); // imprimimos elemento a elemento
            }
            System.out.println(""); // salto de línea
        }
    }
    
    public static void sumaDiagPrinci(int[][] m){
        int suma = 0;
        
        for (int i = 0; i < 3; i++) {
            suma += m[i][i];
        }
        
        System.out.println("La suma de la diagonal principal es: " + suma);
    }

}
