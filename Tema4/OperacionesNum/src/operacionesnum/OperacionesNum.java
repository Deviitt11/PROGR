/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionesnum;

/**
 *
 * @author david
 */
public class OperacionesNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static String separarMiles(String number) {
        // Separar el numero
        String[] vectorNumeros = number.split(" ");
        int contador = 0;
        String numeroMillares = "";

        for (int i = vectorNumeros.length - 1; i > 0; i--) {
            contador++;

            numeroMillares = vectorNumeros[i] + numeroMillares;

            if (contador == 3) {
                // Reiniciamos el contador
                contador = 0;
                // AÑADIR PUNTO
                numeroMillares = "." + numeroMillares;
            }
        }

        numeroMillares = vectorNumeros[0] + numeroMillares;

        return numeroMillares;
    }
}
