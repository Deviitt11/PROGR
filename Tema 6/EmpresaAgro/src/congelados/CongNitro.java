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
public class CongNitro extends ProdCongelado {
    
    // Atributos
    String infoMetCong;
    int tiempExpo;
    
    // Constructor
    public CongNitro(String infoMetCong, int tiempExpo, Date fechaEnv, String paisOrig, double tempRecom, Date fechaCaducidad, int numLote) {
        super(fechaEnv, paisOrig, tempRecom, fechaCaducidad, numLote);
        this.infoMetCong = infoMetCong;
        this.tiempExpo = tiempExpo;
    }
    
    // Setters y getters
    public String getInfoMetCong() {
        return infoMetCong;
    }

    public void setInfoMetCong(String infoMetCong) {
        this.infoMetCong = infoMetCong;
    }

    public int getTiempExpo() {
        return tiempExpo;
    }

    public void setTiempExpo(int tiempExpo) {
        this.tiempExpo = tiempExpo;
    }
    
    
}
