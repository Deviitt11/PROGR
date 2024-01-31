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
    
    a) un número entero sin limite de cifras (positivo o negativo)
    b) un numero entero positivo sin limite de cifras
    c) un numero entero negativo sin limite de cifras
    d) un dni con 8 numeros y una letra al final
    e) una direccion IPv4
    f) una matricula de un coche con formato 0000XXX
    g) un numero binario
    h) un numero octal
    i) un numero hexadecimal
    j) un numero real
    k) un numero real positivo
    l) un numero real negativo
    m) un numero real con x decimales
    n) un numero real positivo con x decimales
    o) un numero real negativo con x decimales
    p) una fecha con formato dd/mm/aaaa
    q) un nombre, incluyendo nombres compuestos
    r) un email
    s) un nombre de usuario en twitter, empieza por @ y puede contener letras mayusculas y minusculas, guiones y guiones bajos.
    t) un isbn de 13 digitos que siempre empieza en 978 o 979.
    */
       
        // Ejemplos de cadenas para probar
        String entero = "-123456";
        String enteroPositivo = "123456";
        String enteroNegativo = "-123456";
        String dni = "12345678Z";
        String ipv4 = "192.168.1.1";
        String matricula = "0000XXX";
        String binario = "10101010";
        String octal = "01234567";
        String hexadecimal = "1A3F";
        String real = "-123.456";
        String realPositivo = "123.456";
        String realNegativo = "-123.456";
        String realXDecimales = "123.4567";
        String realPositivoXDecimales = "123.4567";
        String realNegativoXDecimales = "-123.4567";
        String fecha = "31/12/2020";
        String nombre = "Juan Pérez López";
        String email = "usuario@example.com";
        String twitter = "@usuario";
        String isbn = "9781234567890";

        // Expresiones regulares
        String regexEntero = "-?\\d+";
        String regexEnteroPositivo = "\\d+";
        String regexEnteroNegativo = "-\\d+";
        String regexDNI = "\\d{8}[A-Za-z]";
        String regexIPv4 = "\\b(?:[0-9]{1,3}\\.){3}[0-9]{1,3}\\b";
        String regexMatricula = "\\d{4}[A-Z]{3}";
        String regexBinario = "[01]+";
        String regexOctal = "0[0-7]+";
        String regexHexadecimal = "[0-9a-fA-F]+";
        String regexReal = "-?\\d+\\.\\d+";
        String regexRealPositivo = "\\d+\\.\\d+";
        String regexRealNegativo = "-\\d+\\.\\d+";
        String regexRealXDecimales = "\\d+\\.\\d+";
        String regexRealPositivoXDecimales = "\\d+\\.\\d+";
        String regexRealNegativoXDecimales = "-\\d+\\.\\d+";
        String regexFecha = "\\d{2}/\\d{2}/\\d{4}";
        String regexNombre = "[A-Za-záéíóúÁÉÍÓÚñÑ]+(?: [A-Za-záéíóúÁÉÍÓÚñÑ]+)*";
        String regexEmail = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}";
        String regexTwitter = "@[A-Za-z0-9_-]+";
        String regexISBN = "97[89]\\d{10}";

        // Comprobaciones
        System.out.println("Entero: " + Pattern.matches(regexEntero, entero));
        System.out.println("Entero positivo: " + Pattern.matches(regexEnteroPositivo, enteroPositivo));
        System.out.println("Entero negativo: " + Pattern.matches(regexEnteroNegativo, enteroNegativo));
        System.out.println("DNI: " + Pattern.matches(regexDNI, dni));
        System.out.println("IPv4: " + Pattern.matches(regexIPv4, ipv4));
        System.out.println("Matricula: " + Pattern.matches(regexMatricula, matricula));
        System.out.println("Binario: " + Pattern.matches(regexBinario, binario));
        System.out.println("Octal: " + Pattern.matches(regexOctal, octal));
        System.out.println("Hexadecimal: " + Pattern.matches(regexHexadecimal, hexadecimal));
        System.out.println("Real: " + Pattern.matches(regexReal, real));
        System.out.println("Real positivo: " + Pattern.matches(regexRealPositivo, realPositivo));
        System.out.println("Real negativo: " + Pattern.matches(regexRealNegativo, realNegativo));
        System.out.println("Real con X decimales: " + Pattern.matches(regexRealXDecimales, realXDecimales));
        System.out.println("Real positivo con X decimales: " + Pattern.matches(regexRealPositivoXDecimales, realPositivoXDecimales));
        System.out.println("Real negativo con X decimales: " + Pattern.matches(regexRealNegativoXDecimales, realNegativoXDecimales));
        System.out.println("Fecha: " + Pattern.matches(regexFecha, fecha));
        System.out.println("Nombre: " + Pattern.matches(regexNombre, nombre));
        System.out.println("Email: " + Pattern.matches(regexEmail, email));
        System.out.println("Twitter: " + Pattern.matches(regexTwitter, twitter));
        System.out.println("ISBN: " + Pattern.matches(regexISBN, isbn));
    }    
}
