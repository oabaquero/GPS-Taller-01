/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpstaller1;

import java.util.Scanner;



/**
 *
 * @author rcbrian
 */
public class GPSTaller1 {
 
                
                
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc = new Scanner(System.in);
          String frase;
           int variable=0;
           int variable2=0;
           int variable3=0;
          Validador validador = new Validador();
          System.out.println("Por favor digite Una frase= ");
          frase=sc.nextLine();
          System.out.println (frase);
          variable= validador.cantidadPalabras(frase);
          variable2= validador.cantidadCaracteres(frase);
          variable3= validador.cantidadEspacios(frase);
          System.out.println("La frase que ud digito contiene "+variable+" palabras");
          System.out.println("La frase que ud digito contiene "+variable2+" caracteres");
          System.out.println("La frase que ud digito contiene "+variable3+" espacios");         
          
    }
    
}
