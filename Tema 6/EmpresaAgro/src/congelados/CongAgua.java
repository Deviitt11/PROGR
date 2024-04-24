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
public class CongAgua extends ProdCongelado{
    
    // Atributos
    String infoSalinidad;
    
    // Constructor

    public CongAgua(String infoSalinidad, Date fechaEnv, String paisOrig, double tempRecom, Date fechaCaducidad, int numLote) {
        super(fechaEnv, paisOrig, tempRecom, fechaCaducidad, numLote);
        this.infoSalinidad = infoSalinidad;
    }
    
    // Setters y getters
    public String getInfoSalinidad() {
        return infoSalinidad;
    }

    public void setInfoSalinidad(String infoSalinidad) {
        this.infoSalinidad = infoSalinidad;
    }
    
    
}
