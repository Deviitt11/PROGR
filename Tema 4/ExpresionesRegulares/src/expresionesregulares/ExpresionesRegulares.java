/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expresionesregulares;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.InputMap;

/**
 *
 * @author ALUMNOS_FP
 */
public class ExpresionesRegulares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Example
        String regex = "[01]+";

        String regexBinario = "[01]+";
        String regexDNI = "[0-9]{8}[A-Z]";
        String regexMatricula = "[0-9]{4}([A-Z&&[^AEIOU]){3}";

        // ISBN: 13 DIGITOS, EMPIEZA POR 978 Y 979
        String regexISBN = "[978-979][0-9]{10}";
        // DIRECCION IP: 192.109.0.1
            // 0-255
        String regexIP = "[0-255]\\.[0-255]\\.[0-255]\\.[0-255]";
        // HEXA: 0X6400: Comienza por 0x y le siguen 4 digitos
        Scanner s = new Scanner(System.in);

        Pattern p = Pattern.compile(regexDNI);
        String input;

        do {
            System.out.println("Introduce una entrada para comprobar: ");
            input = s.nextLine();
            Matcher m = p.matcher(input);

            if (m.matches()) {
                System.out.println("Si, contiene el patrón");
            } else {
                System.out.println("No, no contiene el patrón");
            }
        } while (!input.equals(""));
    }
}
