/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrix4x4;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Matrix4x4 {

    private static final int TAMANO = 4;
    private static int[][] matriz = new int[TAMANO][TAMANO];
    private static boolean matrizRellenada = false;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
    EJERCICIO 4 MATRICES
    Crear una matriz 4x4 de números enteros que inicialmente está vacía, nos piden hacer un menú con estas opciones:
    
    1. Rellenar: Rellenar toda la matriz de números, deben solicitarse al usuario por teclado.
    2. SumaFila: Suma de los datos de una fila que el usuario elegirá (controlar que elija una correcta)
    3. SumaColumna: Suma de los datos de una columna que el usuario elegirá (controlar que elija una correcta)
    4. SumaPrincipal: Sumar la diagonal principal.
    5. SumaInversa: Sumar la diagonal inversa.
    6. Media: Calcula la media de todos los valores de la matriz
    
    Tener en cuenta que hasta que no se realice la primera opción, el resto de opciones no se deberán ejecutar, 
    simplemente mostrar un mensaje donde diga que debes rellenar la matriz.
         */
        
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    rellenarMatriz(scanner);
                    matrizRellenada = true;
                    break;
                case 2:
                    if (matrizRellenada) sumaFila(scanner);
                    else imprimirMensajeRellenar();
                    break;
                case 3:
                    if (matrizRellenada) sumaColumna(scanner);
                    else imprimirMensajeRellenar();
                    break;
                case 4:
                    if (matrizRellenada) sumaPrincipal();
                    else imprimirMensajeRellenar();
                    break;
                case 5:
                    if (matrizRellenada) sumaInversa();
                    else imprimirMensajeRellenar();
                    break;
                case 6:
                    if (matrizRellenada) calcularMedia();
                    else imprimirMensajeRellenar();
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);
        
    }
    
    private static void mostrarMenu() {
        System.out.println("\nMenú:");
        System.out.println("1. Rellenar Matriz");
        System.out.println("2. Suma Fila");
        System.out.println("3. Suma Columna");
        System.out.println("4. Suma Diagonal Principal");
        System.out.println("5. Suma Diagonal Inversa");
        System.out.println("6. Media de la Matriz");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void rellenarMatriz(Scanner scanner) {
        System.out.println("Rellenando la matriz:");
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                System.out.print("Ingrese el elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    private static void sumaFila(Scanner scanner) {
        System.out.print("Ingrese el número de fila a sumar (0-3): ");
        int fila = scanner.nextInt();
        if (fila < 0 || fila >= TAMANO) {
            System.out.println("Número de fila no válido.");
            return;
        }

        int suma = 0;
        for (int j = 0; j < TAMANO; j++) {
            suma += matriz[fila][j];
        }
        System.out.println("Suma de la fila " + fila + " es: " + suma);
    }

    private static void sumaColumna(Scanner scanner) {
        System.out.print("Ingrese el número de columna a sumar (0-3): ");
        int columna = scanner.nextInt();
        if (columna < 0 || columna >= TAMANO) {
            System.out.println("Número de columna no válido.");
            return;
        }

        int suma = 0;
        for (int i = 0; i < TAMANO; i++) {
            suma += matriz[i][columna];
        }
        System.out.println("Suma de la columna " + columna + " es: " + suma);
    }

    private static void sumaPrincipal() {
        int suma = 0;
        for (int i = 0; i < TAMANO; i++) {
            suma += matriz[i][i];
        }
        System.out.println("Suma de la diagonal principal es: " + suma);
    }

    private static void sumaInversa() {
        int suma = 0;
        for (int i = 0; i < TAMANO; i++) {
            suma += matriz[i][TAMANO - 1 - i];
        }
        System.out.println("Suma de la diagonal inversa es: " + suma);
    }

    private static void calcularMedia() {
        int suma = 0;
        for (int i = 0; i < TAMANO; i++) {
            for (int j = 0; j < TAMANO; j++) {
                suma += matriz[i][j];
            }
        }
        double media = (double) suma / (TAMANO * TAMANO);
        System.out.println("La media de los valores de la matriz es: " + media);
    }

    private static void imprimirMensajeRellenar() {
        System.out.println("Primero debe rellenar la matriz.");
    }
}
