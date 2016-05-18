/**
 * Bibliothèque
 * TP CVDA 2016 - Amélie Cordier
 */
package bibliotheque;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Classe Biblothèque
 * @author Amélie Cordier - IUT Lyon 1
 * @version 1.0
 * mai 2016
 */
public class Bibliotheque {
    
    private List<Livre> listeLivres; 
    private int nombreDeLivres;

    /**
     * Constructeur vide
     */
    public Bibliotheque(){
        listeLivres = new ArrayList<>(100);
        nombreDeLivres = 0;
    }
    
    /** 
     * Constructeur permettant de créer une bibliothèque à partir d'une liste de livres
     * @param liste une liste de livres 
     */
    public Bibliotheque(ArrayList<Livre> liste){
        listeLivres = liste;
        nombreDeLivres = liste.size();        
    }
    
    public void ajouter(Livre l){
        listeLivres.add(l);
        nombreDeLivres = nombreDeLivres + 1;
    }
        
    public String toString(){
        return null;
    }
    
    public List<Livre> rechercheParNomAuteur(String nom) throws AuteurException{
        return null;
    }
        
    @SuppressWarnings("empty-statement")
    public Livre rechercheParTitre(String titre) throws LivreException{
            
        Iterator<Livre> il = listeLivres.iterator();
        boolean present = false; 
        Livre livrecourant = null;
        
        while (il.hasNext() && !(present)){
            Livre l = il.next();
            if(l.getTitre().equals(titre)){
                present = true;
                livrecourant = l;
            };    
        }
        
        if(!present){
            throw new LivreException();
        }else{
            return livrecourant;
        }
        
    }
}

