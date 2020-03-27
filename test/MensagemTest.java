/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import antproj2.Mensagem;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miguel Ferreira
 */
public class MensagemTest {
    
    public MensagemTest() {
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

    @Test
    public void getMessageTestTrue() {
        String m = new Mensagem().getMessage();
        assertEquals("Hello World from class Mensagem antproj2 versao", m);
    }
    
    @Test
    public void getMessageTestFalse() {
        String m = new Mensagem().getMessage();
        assertNotEquals("Hello World", m);
    }
    
    @Test
    public void getMessageTestNotNull() {
        String m = new Mensagem().getMessage();
        assertNotNull(m);
    }
}
