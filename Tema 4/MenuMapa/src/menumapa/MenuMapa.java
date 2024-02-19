/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menumapa;

import java.util.HashMap;
import java.util.Scanner;
import persona.Persona;

/**
 *
 * @author ALUMNOS_FP
 */
public class MenuMapa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Crear Hashmap con clave numérica y valor sea un objeto persona
        // contador para la clave
        
        // Crear un menu
            // añadir persona: pedir al usuario los datos de la clase persona
            // comprobar si existe persona con nombre especifico: 
            // limpiar lista
            // comprobar si existe persona con nombre específico
            // mostrar lista
            
        int opcion;
        Scanner s = new Scanner(System.in);
        
        // Creamos el Hashmap
        HashMap<Integer, Persona> alumnado = new HashMap<>();
        
        // Variable contador
        int contador = 0;
        
        do {            
            
            System.out.println("Introduce una opción: ");
            System.out.println("1. Añadir persona");
            System.out.println("2. Eliminar persona");
            System.out.println("3. Limpiar lista");
            System.out.println("4. Comprobar si existe una persona");
            System.out.println("5. Mostrar lista");
            System.out.println("6. Salir");
            
            opcion = s.nextInt();
            
            switch (opcion) {
                case 1:
                    s.nextLine(); // Limpiamos el buffer al pasar de leer un número a una cadena
                    
                    System.out.println("Introduce un nombre: ");
                    String nombre = s.nextLine();
                    
                    System.out.println("Introduce una edad: ");
                    int edad = s.nextInt();
                    
                    // Crear objeto de la clase persona
                    Persona p1 = new Persona(nombre, edad);  
                    
                    // Añadimos la persona a nuestra colección
                    contador++;
                    alumnado.put(contador, p1);
                    
                    break;
                case 2:
                    System.out.println("Introduce la clave del alumno que se quiere eliminar: ");
                    int keyRemoved = s.nextInt();
                    
                    Persona eliminado = alumnado.remove(keyRemoved);
                    if(eliminado == null) {
                        System.out.println("No existe un alumno con esa clave");
                    }
                    else{
                        System.out.println("Alumno eliminado correctamente");
                    } 
                    break;
                case 3:
                    alumnado.clear();
                    System.out.println("La lista ha sido limpiada correctamente");
                    break;
                case 4:
                    s.nextLine();
                    System.out.println("Introduce un nombre: ");
                    String nombreBusc = s.nextLine();
                    
                    if(containerPers(alumnado, nombreBusc) == true){
                        System.out.println("Persona encontrada");
                    }
                    else{
                        System.out.println("Persona NO encontrada");
                    }
                    
                    break;
                case 5:
                    for(Integer key: alumnado.keySet()) {
                        System.out.println("Claves: " + key + ", Valor: " + alumnado.toString());
                        alumnado.get(key).showPersona();
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opción no válida");
            }
            
        } while (opcion != 6);

    }
    
    public static boolean containerPers(HashMap<Integer, Persona> alumnado, String nombre){
        for(Persona p: alumnado.values()){
            if(nombre.equalsIgnoreCase(p.getNombre())){
                return true;
            }
        }
        return false;
    }

}
