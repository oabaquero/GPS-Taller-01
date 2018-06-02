/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpstaller1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author obaquerog
 */
public class ValidadorTest {
    
    public ValidadorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of cantidadCaracteres method, of class Validador.
     */
    @Test
    public void testCantidadCaracteres() {
        System.out.println("cantidadCaracteres");
        String frase = "Hola";
        Validador instance = new Validador();
        int expResult = 4;
        int result = instance.cantidadCaracteres(frase);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult!=result){
             fail("The test case is a prototype.");
        }
    }

    /**
     * Test of cantidadPalabras method, of class Validador.
     */
    @Test
    public void testCantidadPalabras() {
        System.out.println("cantidadPalabras");
        String frase = "Hola";
        Validador instance = new Validador();
        int expResult = 1;
        int result = instance.cantidadPalabras(frase);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult!=result){
             fail("The test case is a prototype.");
        }
    }

    /**
     * Test of cantidadEspacios method, of class Validador.
     */
    @Test
    public void testCantidadEspacios() {
        System.out.println("cantidadEspacios");
        String frase = "Hola Todos";
        Validador instance = new Validador();
        int expResult = 1;
        int result = instance.cantidadEspacios(frase);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if(expResult!=result){
             fail("The test case is a prototype.");
        }
    }
    
}
