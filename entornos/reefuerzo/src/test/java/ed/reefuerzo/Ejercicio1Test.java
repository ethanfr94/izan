/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ed.reefuerzo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author usuario
 */
public class Ejercicio1Test {
    
    public Ejercicio1Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of sumar method, of class Ejercicio1.
     */
    @Test
    public void testSumar1() {
        System.out.println("sumar");
        int a = 2;
        int b = 5;
        Ejercicio1 instance = new Ejercicio1();
        int expResult = 7;
        int result = instance.sumar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testsumar2(){
        System.out.println("sumar: test corto");
        Ejercicio1 instance = new Ejercicio1();
        assertEquals(7,instance.sumar(2, 5));
    }

    /**
     * Test of concatenar method, of class Ejercicio1.
     */
    @Test
    public void testConcatenar() {
        System.out.println("concatenar");
        String s1 = "hola ";
        String s2 = "mundo";
        Ejercicio1 instance = new Ejercicio1();
        String expResult = "hola mundo";
        String result = instance.concatenar(s1, s2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testConcatenar2() {
        System.out.println("concatenar: test corto");
        Ejercicio1 instance = new Ejercicio1();
        assertEquals("hola mundo", instance.concatenar("hola ", "mundo"));
        
    }
    
    /**
     * Test of getArray method, of class Ejercicio1.
     */
    @Test
    public void testGetArray() {
        System.out.println("getArray");
        Ejercicio1 instance = new Ejercicio1();
        int[] expResult = {1, 2, 3, 4, 5};
        int[] result = instance.getArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetArray2() {
        System.out.println("getArray: test corto");
        Ejercicio1 instance = new Ejercicio1();
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, instance.getArray());
    }

    /**
     * Test of esMayorQueCero method, of class Ejercicio1.
     */
    @Test
    public void testEsMayorQueCero() {
        System.out.println("esMayorQueCero");
        int numero = -5;
        Ejercicio1 instance = new Ejercicio1();
        boolean expResult = false;
        boolean result = instance.esMayorQueCero(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testEsMayorQueCero2() {
        System.out.println("esMayorQueCero: test corto");        
        Ejercicio1 instance = new Ejercicio1();        
        assertTrue(instance.esMayorQueCero(5));       
        assertFalse(instance.esMayorQueCero(-5));        

    }
    
    /**
     * Test of obtenerNulo method, of class Ejercicio1.
     */
    @Test
    public void testObtenerNulo() {
        System.out.println("obtenerNulo");
        Ejercicio1 instance = new Ejercicio1();
        Object expResult = null;
        Object result = instance.obtenerNulo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testObtenerNulo2() {
        System.out.println("obtenerNulo: test corto");
        Ejercicio1 instance = new Ejercicio1();        
        assertNull(instance.obtenerNulo());        
    }

    /**
     * Test of getObjeto method, of class Ejercicio1.
     */
    @Test
    public void testGetObjeto() {
        System.out.println("getObjeto");
        Ejercicio1 instance = new Ejercicio1();
        Object expResult = casa;
        Object result = instance.getObjeto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    } 
    
    Object casa = "hola";
    
    @Test
    public void testGetObjeto2() {
        System.out.println("getObjeto: test corto");
        Ejercicio1 instance = new Ejercicio1();
        Object expResult = casa;        
        assertSame(casa, instance.getObjeto());
        
    } 
}
