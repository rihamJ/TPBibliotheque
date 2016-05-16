/**
 * Bibliothèque
 * TP CVDA 2016 - Amélie Cordier
 */
package bibliotheque;

import java.util.ArrayList;

/**
 * Classe Personne
 * @author Amélie Cordier - IUT Lyon 1
 * @version 1.0
 * mai 2016
 */

public class ListePersonnes {
    
    ArrayList<Personne> listepers;
    
    public ListePersonnes(){
        listepers = new ArrayList<>();
    }
    
    public void ajouterPersonne(Personne p){
        
    }
    
    public boolean appartient(Personne p){
        return false;
    }
 
    public boolean appartient(String nom, String prenom){
        return false;
    }
    
    public void afficherAppartenance(Personne p){
        System.out.println("appartenance");
    }
    
}


