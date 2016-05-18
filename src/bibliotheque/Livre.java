/**
 * Bibliothèque
 * TP CVDA 2016 - Amélie Cordier
 */
package bibliotheque;

/**
 * Classe Livre
 * @author Amélie Cordier - IUT Lyon 1
 * @version 1.0
 * mai 2016
 */
public class Livre {
       
    /**
     * Variables d'instances
     */
    private int numLivre;
    private String titre;
    private int nombreDePages;
    private Personne auteur;
    
    /**
     * Variable de classe pour gérer la numérotation des livres
     */
    private static int _dernierNum;
    
    /**
     * Constructeur
     * @param titrelivre le titre du livre
     * @param nbpages le nombre de pages
     * @param auteurlivre l'auteur du livre (une Personne)
     */
    public Livre(String titrelivre, int nbpages, Personne auteurlivre){
        numLivre = getNumLivreSuivant();
        titre = titrelivre;
        nombreDePages = nbpages;
        auteur = auteurlivre;
    }
    
    /**
     * Constructeur vide
     * @param a l'auteur d'un livre pour l'instant inconnu
     */
    public Livre(Personne a){
        numLivre = getNumLivreSuivant();
        titre = "";
        nombreDePages = 0;
        auteur = a;
    }
    /*
    Commentaire de correction : 
    ce constructeur n'est pas "requis" dans le sujet,
    mais il peut s'avérer utile. 
    */
    
    
    // Getters
    
    /**
     * Retourne l'identifiant du livre
     * @return numéro du livre
     */
    public int getNumLivre(){
        return numLivre;
    }
    
    /**
     * Retourne le titre du livre
     * @return titre du livre
     */
    public String getTitre(){
        return titre;
    }
    
    /**
     * Retourne le nombre de pages du livre
     * @return nombre de pages
     */
    public int getNombreDePages(){
        return nombreDePages;
    }
    
    /**
     * Retourne l'auteur du livre
     * @return auteur (type Personne)
     */
    public Personne getAuteur(){
        return auteur;
    }
    
    /**
     * Retourne le prochain numéro de livre disponible
     * et fait évoluer le compteur
     * @return numLivre
     */
    private int getNumLivreSuivant(){
        int numero = _dernierNum; 
        _dernierNum = _dernierNum + 1;
        return numero; 
    }
    
    
    // Setters 
    
    /**
     * Fixe le titre du livre
     * @param titrelivre 
     */
    public void setTitre(String titrelivre){
        titre = titrelivre;
    }
    
    /**
     * Fixe l'auteur du livre
     * @param p (une Personne)
     */
    public void setAuteur(Personne p){
        auteur = p;
    }
    
    /**
     * Fixe le nombre de pages
     * @param nbPages 
     */
    public void setNombreDePages(int nbPages){
        nombreDePages = nbPages;
    }
    
    
    /**
     * Retourne une chaîne de caractères représentant le livre
     * @return chaîne de caractères
     */
    @Override
    public String toString(){
        Personne a = auteur;
        return titre + ", " + a.getPrenom() + " " + a.getNom()+ ", " + nombreDePages + "p.";
    }
}
        
