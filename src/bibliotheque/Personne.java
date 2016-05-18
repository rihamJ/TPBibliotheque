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
    private int numPers;
    private String nomPers;
    private String prenomPers;
    private int anNaissPers;
    
    /**
     * Variable de classe pour gérer la numérotation des personnes
     */
    private static int _dernierNumero = 0;

    /* Commentaire de correction. par rapport à l'énoncé initial, 
       on a modifié la façon de gérer ce numéro pour le rendre plus 
       sûr : la variable est privée, de même que la méthode qui permet
       d'affecter un n° à une personne. Ainsi, on s'assure que les numéros
       ne peuvent pas être modifiés par n'importe qui et/ou n'importe quand.
    */

    
    
    /**
     * Constructeur
     * @param nom nom de la personne
     * @param prenom prénom de la personne 
     * @param anneeNaissance année de naissance de la personne au format YYYY
     */
    public Personne(String nom, String prenom, int anneeNaissance){
        numPers = getNumPersSuivant();
        nomPers = nom;
        prenomPers = prenom;
        anNaissPers = anneeNaissance;              
    }
    
    /**
     * Constructeur vierge
     * Construit une personne "vide"
     */
    public Personne(){
        numPers = getNumPersSuivant();
        nomPers = "";
        prenomPers = "";
        anNaissPers = 0;
    }
    /*
    Commentaire de correction : 
    ce constructeur n'est pas "requis" dans le sujet,
    mais il peut s'avérer utile. 
    */

    /**
     * Retourne le numéro de la personne
     * @return numéro affecté à la personne 
     */
    private int getNumPersSuivant(){
        int numero = _dernierNumero; 
        _dernierNumero = _dernierNumero + 1;
        return numero; 
    }
   
    // Getters
    /**
     * Retourne le n° de la personne
     * @return numPers  
     */
    public int getNumero(){
        return numPers;
    }
    
    /**
     * Retourne le nom de la personne
     * @return nomPers
     */
    public String getNom(){
        return nomPers;
    }
    
    /**
     * Retourne le prénom de la personne
     * @return prenomPers
     */
    public String getPrenom(){
        return prenomPers;
    }

    /**
     * Retourne l'année de naissance de la personne
     * @return anNaissPers
     */
    public int getAnNaissance(){
        return anNaissPers;
    }

    
    // Setters 
    /**
     * Fixe le nom de la personne 
     * @param nom le nom de la personne 
     */
    public void setNomPers(String nom){     
        nomPers = nom;
    }

    /**
     * Fixe le prénom de la personne 
     * @param prenom le prénom de la personne
     */
    public void setPrenomPers(String prenom){
        prenomPers = prenom;
    }
    
    /**
     * Fixe l'année de naissance de la personne 
     * @param annee l'année de naissance de la personne
     */
    public void setAnNaissance(int annee){
        anNaissPers = annee;
    }

 
    /**
     * Override de la méthode toString 
     * @return chaine de caractère représentant la personne
     */
    @Override
    public String toString(){
        String description = numPers + ", " + nomPers + ", " + prenomPers + ", " + anNaissPers;
        return description; 
    }
}
