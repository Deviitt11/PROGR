
package controlador;

import modelo.Student;
import vista.StudentView;

/**
 *
 * @author Carmen
 */
public class StudentController {
    //Referencia a modelo y a la vista
    Student model;
    StudentView view;
    
    //Constructor para que el controlador acceda al modelo y a la vista
    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }
    
    //Getter y setter para modificar utilizando el modelo
    public String getStudentName(){
        return model.getName();
    }
    public void setStudentName(String name){
        model.setName(name);
    }
    
    public String getStudentDni(){
        return model.getDni();
    }
    public void setStudentDni(String dni){
        model.setDni(dni);
    }
    
    public int getStudentAge(){
        return model.getAge();
    }
    public void setStudentAge(int age){
        model.setAge(age);
    }
    
    public void updateView(){
        view.showStudent(model.getName(), model.getDni(), model.getAge());
    }
}
