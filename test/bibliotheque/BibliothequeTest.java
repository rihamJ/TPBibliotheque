/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotheque;

import static bibliotheque.LivreTest.computing;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Amelie
 */
public class BibliothequeTest {
    
    static Bibliotheque biblio;
    
    public BibliothequeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        Personne alan = new Personne("Turing", "Alan", 1912);
        Personne marvin = new Personne("Minsky", "Marvin", 1927);
        Personne douglas = new Personne("Hofstadter", "Douglas", 1945);
        Personne nonnon = new Personne("Non", "Non", 1980);
 
        Livre mind = new Livre("Mind", 50, alan);
        Livre computing = new Livre("Computing Machinery and Intelligence", 250, alan);
        Livre ged = new Livre("Godel, Escher et Bach", 450, douglas);
        Livre turingBook = new Livre("Turing", 100, marvin);
        Livre ouioui = new Livre("Oui oui", 10, nonnon);
        
        biblio = new Bibliotheque();
        
        biblio.ajouter(mind);
        biblio.ajouter(computing);
        biblio.ajouter(ged);
        biblio.ajouter(turingBook);
        
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
     * Test of ajouter method, of class Bibliotheque.
     */
    @Ignore
    @Test
    public void testAjouter() {
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Bibliotheque.
     */
    @Ignore
    @Test
    public void testToString() {
        fail("The test case is a prototype.");
    }

    /**
     * Test of rechercheParNomAuteur method, of class Bibliotheque.
     */
    @Ignore
    @Test
    public void testRechercheParNomAuteur() throws Exception {
        fail("The test case is a prototype.");
    }

    /**
     * Test de rechercheParTitre de la classe Bibliotheque.
     * Vérification que la recherche fonctionne
     * @throws bibliotheque.LivreException
     */
    @Test
    public void testRechercheParTitre() throws LivreException {
        String titre = "Mind";
        Livre l = biblio.rechercheParTitre(titre);
        assertTrue(l.getTitre().equals(titre));
    }

    /**
     * Test de rechercheParTitre de la classe Bibliotheque.
     * Vérification que l'exception est bien levée
     * @throws bibliotheque.LivreException
     */
    @Test(expected = LivreException.class)
    public void testRechercheParTitreException() throws LivreException {
        String titre = "ouioui";
        Livre l = biblio.rechercheParTitre(titre);
    }
}
