package bibliotheque;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Amélie Cordier   
 */
public class PersonneTest {
        
    public PersonneTest() {
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
     * Test of getNumero method, of class Personne.
     */
    @Test
    public void testGetNumero() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        Personne marvin = new Personne("Minsky", "Marvin", 1927);
        
        int numAlan = alan.getNumero();
        int numMarvin = marvin.getNumero();
       
        assertTrue("Les numéros doivent se suivre", numMarvin == (numAlan+1));
    }

    /**
     * Test of getNom method, of class Personne.
     */
    @Test
    public void testGetNom() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        assertEquals("Turing", alan.getNom());
    }

    /**
     * Test of getPrenom method, of class Personne.
     */
    @Test
    public void testGetPrenom() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        assertEquals("Alan", alan.getPrenom());
    }

    /**
     * Test of getAnNaissance method, of class Personne.
     */
    @Test
    public void testGetAnNaissance() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        assertEquals(1912, alan.getAnNaissance());
    }


    /**
     * Test of setNomPers method, of class Personne.
     */
    @Test
    public void testSetNomPers() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        alan.setNomPers("Minsky");
        assertEquals("Minsky", alan.getNom());
    }

    /**
     * Test of setPrenomPerso method, of class Personne.
     */
    @Test
    public void testSetPrenomPers() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        alan.setPrenomPers("Marvin");
        assertEquals("Marvin", alan.getPrenom());
    }

    /**
     * Test of setAnNaissance method, of class Personne.
     */
    @Test
    public void testSetAnNaissance() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        alan.setAnNaissance(1990);
        assertEquals(1990, alan.getAnNaissance());
    }

    /**
     * Test of toString method, of class Personne.
     */
    @Test
    public void testToString() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        assertEquals("Turing, Alan, 1912", alan.toString());
    }
    
}
    