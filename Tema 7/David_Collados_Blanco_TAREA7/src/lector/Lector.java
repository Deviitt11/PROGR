/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lector;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ALUMNOS_FP
 */
public class Lector {

    // Atributo
    private String nombreFichero = "ficheroPrueba.txt";

    // Setters y getters
    public String getNombreFichero() {
        return nombreFichero;
    }

    public void setNombreFichero(String nombreFichero) {
        this.nombreFichero = nombreFichero;
    }

    // Constructor
    public Lector() {
    }

    // Métodos
    /*
    Método público ‘buscarPalabra’ que reciba por parámetro un String 
    con la palabra buscada y devuelva un entero. Debe leer el fichero 
    y devolver el número de la línea con la primera aparición de la palabra, 
    y devolver -1 en caso de no encontrarla
     */
    public static int buscarPalabra(String nombreFichero, String palBuscada){
        // variable para almacenar la linea en la que se encuentra la palabra
        int numLinea = 0;

        try (BufferedReader lector = new BufferedReader(new FileReader(nombreFichero))) {

            // variable para la linea
            String linea;

            // leo el fichero linea a linea
            while ((linea = lector.readLine()) != null) {
                // y aumento el contador del num de linea
                numLinea++;

                // si la linea contiene la palabra q busco
                if (linea.contains(palBuscada)) {
                    // devuelvo el numero de linea
                    return numLinea;
                }
            }
            // capturo las posibles excep
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
        }

        // si la palabra no se encuentra, devuelvo -1
        return -1;
    }

    /*
    Método público ‘contarPalabra’ que reciba por parámetro un String con la palabra buscada 
    y devuelva un entero. Debe leer el fichero y devolver el número de apariciones en el fichero 
    de la palabra buscada.
     */
    public static int contarPalabra(String nombreFichero, String palabraBuscada) {
        // variable para el contador de veces que aparece la palabra en el fichero
        int contPal = 0;

        try (BufferedReader lector = new BufferedReader(new FileReader(nombreFichero))) {

            // variable para la linea
            String linea;

            // leo el fichero linea a linea
            while ((linea = lector.readLine()) != null) {

                // pillo la linea y la divido en palabras, delimitador un espacio
                String[] palabras = linea.split(" ");

                // bucle for each para recorrer el vector de palabras
                for (String pal : palabras) {

                    // si la palabra seleccionada coincide con la que busco
                    if (pal.equals(palabraBuscada)) {
                        // aumento el contador
                        contPal++;
                    }
                }
            }
            // capturo las posibles excep
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contPal;
    }

    /*
    Método público ‘contarVocales’ que reciba no reciba nada y devuelva un entero. 
    Debe leer el fichero y devolver el número vocales que existen en el fichero.
     */
    public static int contarVocales(String nombreFichero) {
        // variable para el contador de vocales
        int contVoc = 0;

        try (BufferedReader lector = new BufferedReader(new FileReader(nombreFichero))) {

            // variable para la linea
            String linea;

            // leo el fichero linea a linea
            while ((linea = lector.readLine()) != null) {

                // pillo la linea y la divido en palabras, delimitador un espacio
                String[] palabras = linea.split(" ");

                // bucle for each para recorrer el vector de palabras
                for (String pal : palabras) {

                    // paso la linea a minus
                    linea = linea.toLowerCase();

                    // bucle for each y convierto la linea en un array de caracteres para facilitar la busqueda
                    for (char c : linea.toCharArray()) {
                        // llamo al metodo de las vocales
                        if (esVocal(c)) {
                            // si coincide, aumento contador
                            contVoc++;
                        }
                    }
                }
            }
            // capturo las posibles excep
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contVoc;
    }

    // Método para saber si el caracter es vocal o no
    public static boolean esVocal(char c) {
        // solo con minus
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    /*
    Método público ‘leerFicheroCifrado’ que no reciba nada por parámetro. 
    Debe leer el fichero e imprimir el texto del fichero línea a línea, 
    pero en vez de mostrar el carácter actual se debe mostrar el siguiente carácter 
    (ej: si es una ‘a’ se debe imprimir una ‘b’). En el caso de que sea la ‘z’ se debe imprimir la ‘a’.
    Opcional: solo aumentar el carácter si es una letra, si es un número dejarlo como está 
    (expresiones regulares).
     */
    public static void leerFicheroCifrado(String nombreFichero) {

        try (BufferedReader lector = new BufferedReader(new FileReader(nombreFichero))) {
            // variable para la linea
            String linea;

            // leo el fichero linea a linea
            while ((linea = lector.readLine()) != null) {
                
            // llamo al metodo de cifrado y lo almaceno en una variable
            String linCif = cifrarLinea(linea);
           
            // imprimo el resultado
            System.out.println(linCif);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // hago el cifrado en otro metodo para dejar mas limpio el codigo
    public static String cifrarLinea(String linea) {
        
        // almaceno el resultado en una variable
        StringBuilder resultado = new StringBuilder();
        
        // bucle for each 
        for (char c : linea.toCharArray()) {
            // si el caracter es minuscula
            if (Character.isLowerCase(c)) {
                // y es una z
                if (c == 'z') {
                    // quiero una a
                    resultado.append('a');
                } else {
                    // y si no, el siguiente
                    resultado.append((char) (c + 1));
                }
            } else if (Character.isUpperCase(c)) { // lo mismo para las mayusculas
                if (c == 'Z') {
                    resultado.append('A');
                } else {
                    resultado.append((char) (c + 1));
                }
            } else {
                resultado.append(c); // meto el resultado en la variable
            }
        }
        return resultado.toString();
    }
    
    /*
    Método público ‘leerFicheroDelimitado’ que no reciba nada por parámetro. 
    Debe leer el fichero con la clase Scanner utilizando como delimitador la coma 
    e imprimir por pantalla el resultado delimitado (cada resultado en una línea).
    */
    public static void leerFicheroDelimitado(String nombreFichero) {

        try (Scanner s = new Scanner(new File(nombreFichero))) {
            
            // Utilizo la coma como delimitador
            s.useDelimiter(",");
            
            // Leo
            while (s.hasNext()) {
                String elemento = s.next();
                // e imprimo cada elemento
                System.out.println(elemento.trim());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
