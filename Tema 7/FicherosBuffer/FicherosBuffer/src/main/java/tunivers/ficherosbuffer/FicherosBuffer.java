package tunivers.ficherosbuffer;

import biblioteca.Bibliotecario;

public class FicherosBuffer {

    public static void main(String[] args) {
        Bibliotecario.escribir("fileBuffer.txt", true);
        
        Bibliotecario.leer("fileBuffer.txt");
        
        int caract = Bibliotecario.contarCaracteres("fileBuffer.txt");
        int palab = Bibliotecario.contarPalabras("fileBuffer.txt");
        int let = Bibliotecario.contarLetras("fileBuffer.txt");
        
        System.out.println(caract);
        System.out.println(palab);
        System.out.println(let);
        
    }
}
