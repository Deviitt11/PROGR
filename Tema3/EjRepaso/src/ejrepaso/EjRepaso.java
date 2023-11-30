/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejrepaso;

import java.time.DayOfWeek;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ALUMNOS_FP
 */
public class EjRepaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        EJERCICIOS
        -Programa que muestra los números primos desde 2 hasta N. El valor de N se introduce por teclado.
         */
        sumaCont();
        EsCapicua();
        Factous();

    }

    /*
    Escribir un programa que pida al usuario que introduzca por teclado números enteros. 
    La lectura de números por teclado finaliza cuando se introduce un cero. 
    El programa mostrará cuántos números positivos se han introducido.
     */
    public static void sumaCont() {
        // Variable contador para ir contando los números que se introducen
        int cont = 0;
        // 
        Scanner s = new Scanner(System.in);
        int n = 0;

        // Bucle do que pide números mientras NO sea 0
        do {
            try {
                // Pedimos y leemos números
                System.out.println("Introduce un numero: ");
                n = s.nextInt();
                // actualizamos el contador
                if (n >= 0) {
                    cont++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (n != 0);
        System.out.println("Se han introducido: " + cont + " números positivos");

    }

    /*
    Comprobar si un número es capicúa
     */
      public static boolean EsCapicua() {
          
        Scanner s = new Scanner(System.in);
        int numero = s.nextInt();
        
        int original = numero;
        int invertido = 0;

        // Invertir el número
        while (numero > 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }

        // Verificar si el número original es igual al invertido
        return original == invertido;
    }


    /*
    Leer por teclado un número entero N no negativo y mostrar el factorial de todos los números desde 0 hasta N.
     */
    public static void Factous() {
        // Creamos el objeto Scanner para leer el número que introduzca el usuario
        Scanner s = new Scanner(System.in);
        // Creamos una variable donde almacenaremos el número (se actualiza dentro del do)
        long num;
        // Creamos una variable para el factorial y la inicializamos a 1
        long fact = 1;

        // tuve que declarar estas dos variables como long, ya que al probar con números grandes como 25, el resultado me daba 0.
        // Utilizo un do while para que pida el número de forma cíclica
        do {
            // Se pide el número
            System.out.print("Introduce un numero positivo: ");
            try {
                // Leemos el número y actualizamos la variable num
                num = s.nextInt();
                if (num <= 0) {
                    // Pedimos de nuevo el número
                    System.out.println("Introduce un numero positivo: ");
                    num = s.nextInt();
                }
            } catch (ArithmeticException e) {
                // Pedimos de nuevo el número
                System.out.println("Numero no valido, introduce un numero positivo: ");
                // Reseteamos el número para que nos pida de nuevo el número
                num = 0;
                // No se pide que imprima la traza de error, asi que comento la siguiente línea
                // e.printStackTrace();
            }
        } while (num <= 0);
        // Realiza el factorial hasta llegar a num y se va actualizando la variable fact
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        // Imprimimos el factorial
        System.out.println("El factorial de: " + num + " es: " + fact);
    }
    
    /*
    Decimal a binario
    */
    public static void DecABinario() {
        
        Scanner s = new Scanner(System.in);
        double decimal = s.nextDouble();
        
        // Verificar si el número es 0
        if (decimal == 0) {
            System.out.println("0");;
        }

        // Inicializar una cadena para almacenar la representación binaria
        String binario = "";

        // Realizar la conversión
        while (decimal > 0) {
            int residuo = (int) (decimal % 2);
            binario += residuo; // Insertar el residuo al inicio de la cadena
            decimal /= 2;
        }

        // Devolver la representación binaria como una cadena
        System.out.println(binario.toString());
    }
    
    /*
    Programa que imprima los N primeros números de la serie de Fibonacci
    */
    public static void imprimirFibonacci() {
        
        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la cantidad de números de la serie Fibonacci
        System.out.print("Ingresa la cantidad de números de la serie Fibonacci a imprimir: ");
        int n = scanner.nextInt();
        
        int primerNumero = 0;
        int segundoNumero = 1;

        System.out.println("Los primeros " + n + " números de la serie Fibonacci son:");

        for (int i = 0; i < n; i++) {
            System.out.print(primerNumero + " ");

            int siguienteNumero = primerNumero + segundoNumero;
            primerNumero = segundoNumero;
            segundoNumero = siguienteNumero;
        }
    }
    
    /*
    -Algoritmo para comprobar si un número es perfecto.
    */
    public static boolean esNumeroPerfecto() {
        Scanner s = new Scanner(System.in);
        int numero = s.nextInt();
        
        if (numero <= 1) {
            return false;
        }

        int sumaDivisores = 1; // 1 siempre es divisor

        // Calcular la suma de los divisores propios
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
                if (i != numero / i) {
                    sumaDivisores += numero / i;
                }
            }
        }

        // Verificar si la suma de los divisores es igual al número
        return sumaDivisores == numero;
    }
}
    

