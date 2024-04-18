
package modelo;

/**
 *
 * @author Carmen
 */
public class Student {
    //Atributos
    String name;
    String dni;
    int age;
    
    //Getter y setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    //Constructor: opcional pero mas util
    public Student(String name, String dni, int age) {
        this.name = name;
        this.dni = dni;
        this.age = age;
    }
    
}
