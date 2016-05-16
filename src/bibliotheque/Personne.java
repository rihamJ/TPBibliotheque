/**
 * Bibliothèque
 * TP CVDA 2016 - Amélie Cordier
 */
package bibliotheque;

/**
 * Classe Personne
 * @author Amélie Cordier - IUT Lyon 1
 * @version 1.0
 * mai 2016
 */
public class Personne {
    
    /**
     * Variables d'instances
     */
    private int numeroPers;
    private String nomPers;
    private String prenomPers;
    private int anNaissance;
    
    /**
     * Variable de classe pour gérer la numérotation des personnes
     */
    private static int dernierNumero = 0;

    
    /**
     * Constructeur
     * @param nom : nom de la personne
     * @param prenom : prénom de la personne 
     * @param anneeNaissance : année de naissance de la personne
     */
    public Personne(String nom, String prenom, int anneeNaissance){
    }

    // Gestion des numéros de personne 
    /**
     * Méthode d'affectation du numéro de personne
     * @param numero 
     */
    public void setNumPers(int numero){
    }

    /**
     * Retourne le dernier numéro disponible
     * @return dernierNumero
     */
    public int getDernierNum(){
        return 0;
    }

   
    // Getters
    /**
     * Retourne le n° de la personne
     * @return numeroPers  
     */
    public int getNumero(){
        return 0;
    }
    
    /**
     * Retourne le nom de la personne
     * @return nomPers
     */
    public String getNom(){
        return "";
    }
    
    /**
     * Retourne le prénom de la personne
     * @return prenomPers
     */
    public String getPrenom(){
        return "";
    }

    /**
     * Retourne l'année de naissance de la personne
     * @return anNaissance
     */
    public int getAnNaissance(){
        return 0;
    }

    
    // Setters 
    /**
     * Fixe le nom de la personne 
     * @param nom 
     */
    public void setNomPers(String nom){     
    }

    /**
     * Fixe le prénom de la personne 
     * @param prenom 
     */
    public void setPrenomPers(String prenom){
    }
    
    /**
     * Fixe l'année de naissance de la personne 
     * @param annee
     */
    public void setAnNaissance(int annee){
    }

    // Méthode toString 

    /**
     * Override de la méthode toString 
     * @return chaine de caractère représentant la personne
     */
    @Override
    public String toString(){
        return "To be completed"; 
    }
}
