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
public class LivreTest {
    
    static Personne alan;
    static Livre computing;
    public LivreTest() {
    }
    
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
     * Test of getNumLivre method, of class Livre.
     */
    @Test
    public void testGetNumLivre() {
        assertEquals(0, computing.getNumLivre());
    }

    /**
     * Test of getNumLivre method, of class Livre.
     */
    @Test
    public void testGetNumLivreTwoBooks() {
        Livre mind = new Livre("mind", 0, alan);
        Livre mind2 = new Livre("mind2", 0, alan);
        assertEquals(mind.getNumLivre()+1, mind2.getNumLivre());
    }

    /**
     * Test of getTitre method, of class Livre.
     */
    @Test
    public void testGetTitre() {
        String titreAttendu = "Computing Machinery and Intelligence";
        assertTrue(computing.getTitre().equals(titreAttendu));
    }

    /**
     * Test of getNombreDePages method, of class Livre.
     */
    @Test
    public void testGetNombreDePages() {
        assertEquals(250, computing.getNombreDePages());
    }

    /**
     * Test of getAuteur method, of class Livre.
     */
    @Test
    public void testGetAuteur() {
        assertEquals(alan, computing.getAuteur());
    }


    /**
     * Test of setTitre method, of class Livre.
     */
    @Test
    public void testSetTitre() {
        Livre mind = new Livre("?", 0, alan);
        mind.setTitre("Mind");
        assertTrue(mind.getTitre().equals("Mind"));
    }

    /**
     * Test of setAuteur method, of class Livre.
     */
    @Test
    public void testSetAuteur() {
        Livre ged = new Livre("?", 0, alan);
        Personne douglas = new Personne("Hofstadter", "Douglas", 1945);  
        ged.setAuteur(douglas);
        assertTrue(ged.getAuteur().equals(douglas));
    }

    /**
     * Test of setNombreDePages method, of class Livre.
     */
    @Test
    public void testSetNombreDePages() {
        Livre mind = new Livre("?", 0, alan);
        mind.setNombreDePages(500);
        assertEquals(500, mind.getNombreDePages());
    }

    /**
     * Test of toString method, of class Livre.
     */
    @Test
    public void testToString() {
        String expStr = "Computing Machinery and Intelligence, Alan Turing, 250p.";
        assertTrue(computing.toString().equals(expStr));
    }
}
    