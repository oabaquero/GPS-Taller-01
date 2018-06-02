/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpstaller1;

import java.util.StringTokenizer;

/**
 * Validador - Clase que contiene los metodos de conteo
 *
 * @author Omar Baquero - Brian Rodriguez
 * @version 1.0
 *
 */
public class Validador {

    public Validador() {

    }

    /**
     * cantidadCaracteres - Metodo para obtener la cantidad de caracteres de una
     * frase
     *
     * @param frase frase escrita por el usuario a través de la consola
     * @return retorna un valor entero de la cantidad de caracteres
     * @author Omar Baquero
     * @version 1.0
     *
     */
    public int cantidadCaracteres(String frase) {
        return frase.length();
    }

    /**
     * cantidadPalabras - Metodo para obtener la cantidad de palabras de una
     * frase
     *
     * @param frase frase escrita por el usuario a través de la consola
     * @return retorna un valor entero de la cantidad de palabras
     * @author Omar Baquero
     * @version 1.0
     *
     */
    public int cantidadPalabras(String frase) {
        StringTokenizer cPalabras = new StringTokenizer(frase);
        return cPalabras.countTokens();
    }

    /**
     * cantidadEspacios - Metodo para obtener la cantidad de espacios en una
     * frase
     *
     * @param frase frase escrita por el usuario a través de la consola
     * @return retorna un valor entero de la cantidad de espacios
     * @author Omar Baquero
     * @version 1.0
     *
     */
    public int cantidadEspacios(String frase) {
        return frase.replaceAll("[^ ]", "").length();
    }

}
