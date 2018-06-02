/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpstaller1;

import java.util.StringTokenizer;

/**
 *
 * @author obaquerog
 */
public class Validador {
    
    public  Validador(){
    
    }
    public int cantidadCaracteres(String frase){
        return frase.length();
    }
    public int cantidadPalabras(String frase){
        StringTokenizer cPalabras = new StringTokenizer(frase);
        return cPalabras.countTokens();
    }
    public int cantidadEspacios(String frase){
        return frase.replaceAll("[^ ]", "").length();
    }
    
}
