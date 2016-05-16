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
 *
 * @author Amelie
 */
public class ListePersonnesTest {
    
    public ListePersonnesTest() {
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
     * Test of ajouterPersonne method, of class ListePersonnes.
     */
    @Test
    public void testAjouterPersonne() {
        ListePersonnes maliste = new ListePersonnes();
        Personne alan = new Personne("Turing", "Alan", 1912);
        maliste.ajouterPersonne(alan);
        assertEquals(1, maliste.getNbPersonnes());
    }

    /**
     * Test of appartient method, of class ListePersonnes.
     */
    @Test
    public void testAppartient_Personne() {
        ListePersonnes maliste = new ListePersonnes();
        Personne alan = new Personne("Turing", "Alan", 1912);
        maliste.ajouterPersonne(alan);
        assertTrue(maliste.appartient(alan));
    }

    /**
     * Test of appartient method, of class ListePersonnes.
     */
    @Test
    public void testNAppartientPas_Personne() {
        ListePersonnes maliste = new ListePersonnes();
        Personne alan = new Personne("Turing", "Alan", 1912);
        Personne marvin = new Personne("Minsky", "Marvin", 1927);
        maliste.ajouterPersonne(alan);
        assertFalse(maliste.appartient(marvin));
    }

    /**
     * Test of appartient method, of class ListePersonnes, avec nom, prenom
     */
    @Test
    public void testAppartientNomPrenom() {
        ListePersonnes maliste = new ListePersonnes();
        Personne alan = new Personne("Turing", "Alan", 1912);
        maliste.ajouterPersonne(alan);
        assertTrue(maliste.appartient("Turing", "Alan")); 
    }

    /**
     * Test of appartient method, of class ListePersonnes, avec nom, prenom
     */
    @Test
    public void testNAppartientPasNomPrenom() {
        ListePersonnes maliste = new ListePersonnes();
        Personne alan = new Personne("Turing", "Alan", 1912);
        Personne marvin = new Personne("Minsky", "Marvin", 1927);
        maliste.ajouterPersonne(alan);
        assertFalse(maliste.appartient("Minsky", "Marvin")); 
    }


    /**
     * Test of appartient method, of class ListePersonnes, avec nom, prenom
     */
    @Test
    public void testAppartientJusteNom() {
        ListePersonnes maliste = new ListePersonnes();
        Personne alan = new Personne("Turing", "Alan", 1912);
        Personne marvin = new Personne("Minsky", "Marvin", 1927);
        Personne alanR = new Personne("Rickman", "Alan", 1946);
        maliste.ajouterPersonne(alan);
        maliste.ajouterPersonne(marvin);
        assertFalse(maliste.appartient("Rickman", "Alan")); 
    }

    
}
