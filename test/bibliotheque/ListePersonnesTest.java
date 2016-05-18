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
 * Classe ListePersonnesTest
 * @author Amélie Cordier - IUT Lyon 1
 * @version 1.0
 * mai 2016
 */
public class ListePersonnesTest {
    
    static ListePersonnes maliste;
    static Personne alan;
    static Personne marvin;
    static Personne alanR;
    
    public ListePersonnesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        maliste = new ListePersonnes();
        alan = new Personne("Turing", "Alan", 1912);
        marvin = new Personne("Minsky", "Marvin", 1927);
        alanR = new Personne("Rickman", "Alan", 1946);
        maliste.ajouterPersonne(alan);
        maliste.ajouterPersonne(marvin);
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
     * Test de ajouterPersonne de la classe ListePersonnes
     */
    @Test
    public void testAjouterPersonne() {
        assertEquals(2, maliste.getNbPersonnes());
    }

    /**
     * Test de appartient de la classe ListePersonnes
     * avec une Personne, quand elle appartient à la liste
     */
    @Test
    public void testAppartient_Personne() {
        assertTrue(maliste.appartient(alan));
    }

    /**
     * Test de appartient de la classe ListePersonnes
     * avec une Personne, quand elle n'appartient pas à la liste
     */
    @Test
    public void testNAppartientPas_Personne() {
        Personne albert = new Personne("Einstein", "Albert", 1879);
        assertFalse(maliste.appartient(albert));
    }

    /**
     * Test de appartient de la classe ListePersonnes
     * avec nom, prenom, quand la personne appartient à la liste
     */
    @Test
    public void testAppartientNomPrenom() {
        assertTrue(maliste.appartient("Turing", "Alan")); 
    }

    /**
     * Test de appartient de la classe ListePersonnes
     * avec nom, prenom, quand la personne n'appartient pas à la liste
     */
    @Test
    public void testNAppartientPasNomPrenom() {
        assertFalse(maliste.appartient("Einstein", "Albert")); 
    }

    /**
     * Test de appartient de la classe ListePersonnes
     * avec seulement le nom 
     */
    @Test
    public void testAppartientJusteNom() {
        assertFalse(maliste.appartient("Einstein", "Albert")); 
    }

}
