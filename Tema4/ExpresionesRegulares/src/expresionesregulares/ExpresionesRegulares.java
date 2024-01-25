/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expresionesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ALUMNOS_FP
 */
public class ExpresionesRegulares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String regex = "[01]+";
        
        Pattern p = Pattern.compile(regex);
        
        Matcher m = p.matcher("00000011321i");
        
    }
    
}
