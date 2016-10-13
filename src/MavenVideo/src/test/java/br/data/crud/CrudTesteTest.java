/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.crud;

import br.data.entity.Cidades;
import br.data.entity.Teste;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class CrudTesteTest {
    
    public CrudTesteTest() {
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
     * Test of persist method, of class CrudTeste.
     */
    @Test
    public void testPersist() {
     //   System.out.println("persist");
     //   Object object = null;
     //   CrudTeste instance = new CrudTeste();
     //   instance.persist(object);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class CrudTeste.
     */
    @Test
    public void testRemove() {
      //  System.out.println("remove");
     //   Cidades cidade = null;
      //  CrudTeste instance = new CrudTeste();
      //  instance.remove(cidade);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of merge method, of class CrudTeste.
     */
    @Test
    public void testMerge() {
      //  System.out.println("merge");
      //  Cidades cidade = null;
      //  CrudTeste instance = new CrudTeste();
       // instance.merge(cidade);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class CrudTeste.
     */
    @Test
    public void testGetAll() {
        System.out.println("getAll");
        CrudTeste instance = new CrudTeste();
        int x;        
        Collection<Teste> result = instance.getAll();
        x = result.size();
        System.out.println("-----------------------------------------------");
        System.out.println(x);
        assertNotEquals(0, x);
        assertEquals(-1, x);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
