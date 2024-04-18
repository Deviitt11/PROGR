
package mvcexample;

import controlador.StudentController;
import modelo.Student;
import vista.StudentView;

/**
 *
 * @author Carmen
 */
public class MVCExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //MVC: modelo vista controlador
        //Modelo: son los objetos, los datos, solo tienen atributos o como mucho metodos simples de parseo
        //Vista: presenta los datos al usuario mediante por ej println, interfaz...
        //Controlador: Intermediario entre el modelo y la vista, obtiene los datos del modelo y despues se lo presenta a la vista, y vicerversa
        //Dentro del modelo, cada una de las clases tiene su controlador y su vista propia
        
        //Se crea un objeto de cada parte
        //Objeto tipo modelo
        Student model = new Student("Alberto", "613654902C", 29);
        //Objeto tipo vista
        StudentView view = new StudentView();
        //Objeto tipo controlador, que recibe modelo estudiante y vista estudiante
        StudentController controller = new StudentController(model, view);
        
        //Utilizar controlador
        controller.updateView();
        controller.setStudentAge(30);
        controller.updateView();
    }
    
}
