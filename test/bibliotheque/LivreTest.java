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
 * Classe LivreTest
 * @author Amélie Cordier - IUT Lyon 1
 * @version 1.0
 * mai 2016
 */
public class LivreTest {
    
    static Personne alan;
    static Livre computing;
    
    public LivreTest() {
    }
    
    /**
     * Création d'une personne et d'un livre à l'initialisation des tests.
     * Ces éléments ne seront pas modifiées par la suite. 
     */
    @BeforeClass
    public static void setUpClass() {
        alan = new Personne("Turing", "Alan", 1912);
        computing = new Livre("Computing Machinery and Intelligence", 250, alan);
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
     * Test de getNumLivre de la classe Livre.
     */
    @Test
    public void testGetNumLivre() {
        assertEquals(0, computing.getNumLivre());
    }

    /**
     * Test de getNumLivre de la classe Livre.
     */
    @Test
    public void testGetNumLivreTwoBooks() {
        Livre mind = new Livre("mind", 0, alan);
        Livre mind2 = new Livre("mind2", 0, alan);
        assertEquals(mind.getNumLivre()+1, mind2.getNumLivre());
    }

    /**
     * Test de getTitre de la classe Livre.
     */
    @Test
    public void testGetTitre() {
        String titreAttendu = "Computing Machinery and Intelligence";
        assertTrue(computing.getTitre().equals(titreAttendu));
    }

    /**
     * Test de getNombreDePages de la classe Livre.
     */
    @Test
    public void testGetNombreDePages() {
        assertEquals(250, computing.getNombreDePages());
    }

    /**
     * Test de getAuteur de la classe Livre.
     */
    @Test
    public void testGetAuteur() {
        assertEquals(alan, computing.getAuteur());
    }

    /**
     * Test de setTitre de la classe Livre.
     */
    @Test
    public void testSetTitre() {
        Livre mind = new Livre("?", 0, alan);
        mind.setTitre("Mind");
        assertTrue(mind.getTitre().equals("Mind"));
    }

    /**
     * Test de setAuteur de la classe Livre.
     */
    @Test
    public void testSetAuteur() {
        Livre ged = new Livre("?", 0, alan);
        Personne douglas = new Personne("Hofstadter", "Douglas", 1945);  
        ged.setAuteur(douglas);
        assertTrue(ged.getAuteur().equals(douglas));
    }

    /**
     * Test de setNombreDePages de la classe Livre.
     */
    @Test
    public void testSetNombreDePages() {
        Livre mind = new Livre("?", 0, alan);
        mind.setNombreDePages(500);
        assertEquals(500, mind.getNombreDePages());
    }

    /**
     * Test de toString de la classe Livre.
     */
    @Test
    public void testToString() {
        String expStr = "Computing Machinery and Intelligence, Alan Turing, 250p.";
        assertTrue(computing.toString().equals(expStr));
    }
}
    