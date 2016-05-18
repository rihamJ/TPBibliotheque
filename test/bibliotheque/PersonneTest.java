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

/**
 * Classe PersonneTest
 * @author Amélie Cordier - IUT Lyon 1
 * @version 1.0
 * mai 2016
 */
public class PersonneTest {
    
    private static Personne alan;
    private static Personne marvin;
    
    public PersonneTest() {
    }

    /**
     * Création de deux personnes, à l'initialisation des tests.
     * Ces personnes ne seront pas modifiées par la suite. 
     */
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
        System.out.println("--- Test suivant ---");
        System.out.println(alan.toString());
        System.out.println(marvin.toString());
    }
   /*
    Commentaire de correction : 
    ceci a pour seul but d'illustrer le rôle de la méthode setUp
    */

    @After
    public void tearDown() {
    }

    /**
     * Test de getNumero de la classe Personne.
     */
    @Test
    public void testGetNumero() {       
        int numAlan = alan.getNumero();
        int numMarvin = marvin.getNumero();
        assertTrue("Les numéros doivent se suivre", numMarvin == (numAlan+1));
    }

    /**
     * Test de getNom de la classe Personne.
     */
    @Test
    public void testGetNom() {
        assertEquals("Turing", alan.getNom());
    }

    /**
     * Test de getPrenom de la classe Personne.
     */
    @Test
    public void testGetPrenom() {
        assertEquals("Alan", alan.getPrenom());
    }

    /**
     * Test de getAnNaissance de la classe Personne.
     */
    @Test
    public void testGetAnNaissance() {
        assertEquals(1912, alan.getAnNaissance());
    }

    /**
     * Test de setNomPers, de la classe Personne.
     */
    @Test
    public void testSetNomPers() {
        Personne inconnu = new Personne("?", "?", 0);
        inconnu.setNomPers("Mystère");
        assertEquals("Mystère", inconnu.getNom());
    }

    /**
     * Test de setPrenomPers de la classe Personne.
     */
    @Test
    public void testSetPrenomPers() {
        Personne inconnu = new Personne("?", "?", 0);
        inconnu.setPrenomPers("Bouldegom");
        assertEquals("Bouldegom", inconnu.getPrenom());
    }

    /**
     * Test de setAnNaissance de la classe Personne.
     */
    @Test
    public void testSetAnNaissance() {
        Personne inconnu = new Personne("?", "?", 0);
        inconnu.setAnNaissance(1990);
        assertEquals(1990, inconnu.getAnNaissance());
    }

    /**
     * Test de toString de la classe Personne.
     */
    @Test
    public void testToString() {
        assertEquals("0, Turing, Alan, 1912", alan.toString());
    }
    
}
    