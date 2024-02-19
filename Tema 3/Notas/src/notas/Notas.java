/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notas;

/**
 *
 * @author ALUMNOS_FP
 */
public class Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         int numPreguntas = 20;
         int aciertos = 19;
         int fallos = 2;
         
         int nota = ((aciertos - fallos/2) * 10)/ numPreguntas;
         
         switch(nota) {
             case 5:
                 System.out.println("Suficiente");
             case 6:
                 System.out.println("Bien");
             case 7, 8:
                 System.out.println("Notable");
             case 9:
                 System.out.println("Sobresaliente");
             case 10:
                 System.out.println("MDH");
         }
    }
    
}
