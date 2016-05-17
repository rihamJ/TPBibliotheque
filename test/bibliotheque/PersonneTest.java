/**
 * Bibliothèque
 * TP CVDA 2016 - Amélie Cordier
 */
package bibliotheque;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 * Classe PersonneTest
 * @author Amélie Cordier   
 */
public class PersonneTest {
    
    private static Personne alan;
    private static Personne marvin;
    
    public PersonneTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        alan = new Personne("Turing", "Alan", 1912);
        marvin = new Personne("Minsky", "Marvin", 1927);
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.out.println("--- Next test ---");
        System.out.println(alan.toString());
        System.out.println(marvin.toString());
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNumero method, of class Personne.
     */
    @Test
    public void testGetNumero() {       
        int numAlan = alan.getNumero();
        int numMarvin = marvin.getNumero();
        assertTrue("Les numéros doivent se suivre", numMarvin == (numAlan+1));
    }

    /**
     * Test of getNom method, of class Personne.
     */
    @Test
    public void testGetNom() {
        assertEquals("Turing", alan.getNom());
    }

    /**
     * Test of getPrenom method, of class Personne.
     */
    @Test
    public void testGetPrenom() {
        assertEquals("Alan", alan.getPrenom());
    }

    /**
     * Test of getAnNaissance method, of class Personne.
     */
    @Test
    public void testGetAnNaissance() {
        assertEquals(1912, alan.getAnNaissance());
    }

    /**
     * Test of setNomPers method, of class Personne.
     */
    @Test
    public void testSetNomPers() {
        Personne inconnu = new Personne("?", "?", 0);
        inconnu.setNomPers("Mystère");
        assertEquals("Mystère", inconnu.getNom());
    }

    /**
     * Test of setPrenomPerso method, of class Personne.
     */
    @Test
    public void testSetPrenomPers() {
        Personne inconnu = new Personne("?", "?", 0);
        inconnu.setPrenomPers("Bouldegom");
        assertEquals("Bouldegom", inconnu.getPrenom());
    }

    /**
     * Test of setAnNaissance method, of class Personne.
     */
    @Test
    public void testSetAnNaissance() {
        Personne inconnu = new Personne("?", "?", 0);
        inconnu.setAnNaissance(1990);
        assertEquals(1990, inconnu.getAnNaissance());
    }

    /**
     * Test of toString method, of class Personne.
     */
    @Test
    public void testToString() {
        assertEquals("Turing, Alan, 1912", alan.toString());
    }
    
}
    