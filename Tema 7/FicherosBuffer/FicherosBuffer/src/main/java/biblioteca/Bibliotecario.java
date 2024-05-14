package biblioteca;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bibliotecario {

    final static String PATH = "C:\\Users\\ALUMNOS_FP\\Documents\\NetBeansProjects\\Tema 7\\EJFicheros";

    //Método para escribir fichero en la ruta asignada en la variable final
    public static void escribir(String fileName, boolean append) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(PATH + fileName, append))) {
            escritor.write("Esta es la primera linea\n");
            escritor.write("Esta es la segunda linea");
            escritor.newLine();
            escritor.write("Fin fichero");
            escritor.close();
        } catch (IOException ex) {
            Logger.getLogger(Bibliotecario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Método para leer fichero en la ruta asignada en la variable final
    public static void leer(String fileName) {
        try (BufferedReader lector = new BufferedReader(new FileReader(PATH + fileName))) {
            String line;
            while ((line = lector.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Bibliotecario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Bibliotecario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int contarPalabras(String fileName) {
        int numPalabras = 0;
        try (BufferedReader lector = new BufferedReader(new FileReader(PATH + fileName))) {

            String line;
            while ((line = lector.readLine()) != null) {
                String[] palabras = line.split(" ");
                numPalabras = palabras.length;
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Bibliotecario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Bibliotecario.class.getName()).log(Level.SEVERE, null, ex);
        }

        return numPalabras;
    }

    public static int contarCaracteres(String fileName) {
        int numLetras = 0;
        int numCaracteres2 = 0;

        try (BufferedReader lector = new BufferedReader(new FileReader(PATH + fileName))) {

            String line;
            while ((line = lector.readLine()) != null) {

                numLetras += line.replaceAll(" ", "").length();
            }

            int caracter;

            while ((caracter = lector.read()) != -1) {
                if ((char) caracter == ' ') {
                    numCaracteres2++;
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Bibliotecario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Bibliotecario.class.getName()).log(Level.SEVERE, null, ex);
        }

        return numLetras;
    }

    public static int contarLetras(String fileName) {
        int numLetras = 0;
        int numLetras2 = 0;

        try (BufferedReader lector = new BufferedReader(new FileReader(PATH + fileName))) {

            String line;
            while ((line = lector.readLine()) != null) {

                numLetras += line.replaceAll(" ", "").length();
            }

            int caracter;

            while ((caracter = lector.read()) != -1) {
                if ((char) caracter == ' ') {
                    numLetras2++;
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Bibliotecario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Bibliotecario.class.getName()).log(Level.SEVERE, null, ex);
        }

        return numLetras2;
    }

    public static void leerDelimitado(String fileName, String delimitador) {

        File file = new File(PATH + fileName);

        try (Scanner s = new Scanner(file)) {

            s.useDelimiter(delimitador);

            while (s.hasNext()) {
                System.out.println(s.next());
            }
        } catch (FileNotFoundException e) {
            Logger.getLogger(Bibliotecario.class.getName());
        }
    }

    public static void leerScanner(String fileName) {

        File file = new File(PATH + fileName);

        try (Scanner s = new Scanner(file)) {

            while (s.hasNextLine()) {
                System.out.println(s.nextLine());
            }
        } catch (FileNotFoundException e) {
            Logger.getLogger(Bibliotecario.class.getName());
        }
    }

    public static void crearFichero() {

        File file = new File(PATH + "ficheroNuevo.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("Fichero creado correctamente");
            } else {
                System.out.println("Ya existe un fichero con ese nombre");
            }
        } catch (IOException ex) {
            Logger.getLogger(Bibliotecario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void eliminarFichero() {

        File file = new File(PATH + "ficheroNuevo.txt");

        if (file.delete()) {
            System.out.println("Fichero eliminado correctamente");
        } else {
            System.out.println("Fichero no existe");
        }
    }
}
