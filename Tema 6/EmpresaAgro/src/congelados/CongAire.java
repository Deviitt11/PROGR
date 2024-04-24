/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package congelados;
import java.util.Date;
import productos.*;

/**
 *
 * @author david
 */
public class CongAire extends ProdCongelado {
    
    // Atributos
    String composicionAire;
    
    // Constructor
    public CongAire(String composicionAire, Date fechaEnv, String paisOrig, double tempRecom, Date fechaCaducidad, int numLote) {
        super(fechaEnv, paisOrig, tempRecom, fechaCaducidad, numLote);
        this.composicionAire = composicionAire;
    }
    
    
    // Setters y getters
    public String getComposicionAire() {
        return composicionAire;
    }

    public void setComposicionAire(String composicionAire) {
        this.composicionAire = composicionAire;
    }
}
