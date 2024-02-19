/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expregulares;

import java.util.regex.Pattern;

/**
 *
 * @author david
 */
public class ExpRegulares {

   public static void main(String[] args) {
       
       /*
    Realiza un programa de prueba, en el que se compruebe que has implementado correctamente una expresión regular 
    que se adapte a los siguientes requisitos:
    */
       
        // Ejemplos de cadenas para probar
        String entero = "-123456"; // a) un número entero sin limite de cifras (positivo o negativo)
        String enteroPositivo = "123456"; // b) un numero entero positivo sin limite de cifras
        String enteroNegativo = "-123456"; // c) un numero entero negativo sin limite de cifras
        String dni = "12345678Z"; // d) un dni con 8 numeros y una letra al final
        String ipv4 = "192.168.1.1"; // e) una direccion IPv4
        String matricula = "0000XXX"; // f) una matricula de un coche con formato 0000XXX
        String binario = "10101010"; // g) un numero binario
        String octal = "01234567"; // h) un numero octal
        String hexadecimal = "1A3F"; // i) un numero hexadecimal
        String real = "-123.456"; // j) un numero real
        String realPositivo = "123.456"; // k) un numero real positivo
        String realNegativo = "-123.456"; // l) un numero real negativo
        String realXDecimales = "123.4567"; // m) un numero real con x decimales
        String realPositivoXDecimales = "123.4567"; // n) un numero real positivo con x decimales
        String realNegativoXDecimales = "-123.4567";  // o) un numero real negativo con x decimales
        String fecha = "31/12/2020"; // p) una fecha con formato dd/mm/aaaa
        String nombre = "Juan Pérez López"; // q) un nombre, incluyendo nombres compuestos
        String email = "usuario@example.com"; // r) un email
        String twitter = "@usuario";  // s) un nombre de usuario en twitter, empieza por @ y puede contener letras mayusculas y minusculas, guiones y guiones bajos.
        String isbn = "9781234567890"; // t) un isbn de 13 digitos que siempre empieza en 978 o 979.

        // Expresiones regulares 
        String regexEntero = "-?\\d+"; // a) un número entero sin limite de cifras (positivo o negativo)
        String regexEnteroPositivo = "\\d+"; // b) un numero entero positivo sin limite de cifras
        String regexEnteroNegativo = "-\\d+"; // c) un numero entero negativo sin limite de cifras
        String regexDNI = "\\d{8}[A-Za-z]"; // d) un dni con 8 numeros y una letra al final
        String regexIPv4 = "\\b(?:[0-9]{1,3}\\.){3}[0-9]{1,3}\\b"; // e) una direccion IPv4
        String regexMatricula = "\\d{4}[A-Z]{3}"; // f) una matricula de un coche con formato 0000XXX
        String regexBinario = "[01]+"; // g) un numero binario
        String regexOctal = "0[0-7]+"; // h) un numero octal
        String regexHexadecimal = "[0-9a-fA-F]+"; // i) un numero hexadecimal
        String regexReal = "-?\\d+\\.\\d+"; // j) un numero real
        String regexRealPositivo = "\\d+\\.\\d+"; // k) un numero real positivo
        String regexRealNegativo = "-\\d+\\.\\d+"; // l) un numero real negativo
        String regexRealXDecimales = "\\d+\\.\\d+"; // m) un numero real con x decimales
        String regexRealPositivoXDecimales = "\\d+\\.\\d+"; // n) un numero real positivo con x decimales
        String regexRealNegativoXDecimales = "-\\d+\\.\\d+"; // o) un numero real negativo con x decimales
        String regexFecha = "\\d{2}/\\d{2}/\\d{4}"; // p) una fecha con formato dd/mm/aaaa
        String regexNombre = "[A-Za-záéíóúÁÉÍÓÚñÑ]+(?: [A-Za-záéíóúÁÉÍÓÚñÑ]+)*"; // q) un nombre, incluyendo nombres compuestos
        String regexEmail = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}"; // r) un email
        String regexTwitter = "@[A-Za-z0-9_-]+"; // s) un nombre de usuario en twitter, empieza por @ y puede contener letras mayusculas y minusculas, guiones y guiones bajos.
        String regexISBN = "97[89]\\d{10}"; // t) un isbn de 13 digitos que siempre empieza en 978 o 979.

        // Comprobaciones
        System.out.println("Entero: " + Pattern.matches(regexEntero, entero)); // a) un número entero sin limite de cifras (positivo o negativo)
        System.out.println("Entero positivo: " + Pattern.matches(regexEnteroPositivo, enteroPositivo)); // b) un numero entero positivo sin limite de cifras
        System.out.println("Entero negativo: " + Pattern.matches(regexEnteroNegativo, enteroNegativo)); // c) un numero entero negativo sin limite de cifras
        System.out.println("DNI: " + Pattern.matches(regexDNI, dni)); // d) un dni con 8 numeros y una letra al final
        System.out.println("IPv4: " + Pattern.matches(regexIPv4, ipv4)); // e) una direccion IPv4
        System.out.println("Matricula: " + Pattern.matches(regexMatricula, matricula)); // f) una matricula de un coche con formato 0000XXX
        System.out.println("Binario: " + Pattern.matches(regexBinario, binario)); // g) un numero binario
        System.out.println("Octal: " + Pattern.matches(regexOctal, octal)); // h) un numero octal
        System.out.println("Hexadecimal: " + Pattern.matches(regexHexadecimal, hexadecimal)); // i) un numero hexadecimal
        System.out.println("Real: " + Pattern.matches(regexReal, real)); // j) un numero real
        System.out.println("Real positivo: " + Pattern.matches(regexRealPositivo, realPositivo)); // k) un numero real positivo
        System.out.println("Real negativo: " + Pattern.matches(regexRealNegativo, realNegativo)); // l) un numero real negativo
        System.out.println("Real con X decimales: " + Pattern.matches(regexRealXDecimales, realXDecimales)); // m) un numero real con x decimales
        System.out.println("Real positivo con X decimales: " + Pattern.matches(regexRealPositivoXDecimales, realPositivoXDecimales)); // n) un numero real positivo con x decimales
        System.out.println("Real negativo con X decimales: " + Pattern.matches(regexRealNegativoXDecimales, realNegativoXDecimales)); // o) un numero real negativo con x decimales
        System.out.println("Fecha: " + Pattern.matches(regexFecha, fecha)); // p) una fecha con formato dd/mm/aaaa
        System.out.println("Nombre: " + Pattern.matches(regexNombre, nombre)); // q) un nombre, incluyendo nombres compuestos
        System.out.println("Email: " + Pattern.matches(regexEmail, email)); // r) un email
        System.out.println("Twitter: " + Pattern.matches(regexTwitter, twitter)); // s) un nombre de usuario en twitter, empieza por @ y puede contener letras mayusculas y minusculas, guiones y guiones bajos.
        System.out.println("ISBN: " + Pattern.matches(regexISBN, isbn)); // t) un isbn de 13 digitos que siempre empieza en 978 o 979.
    }    
}
