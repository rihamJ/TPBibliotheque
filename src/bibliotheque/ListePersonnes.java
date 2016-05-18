/**
 * Bibliothèque
 * TP CVDA 2016 - Amélie Cordier
 */
package bibliotheque;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Classe ListePersonnes
 * @author Amélie Cordier - IUT Lyon 1
 * @version 1.0
 * mai 2016
 */
public class ListePersonnes {
    
    ArrayList<Personne> listepers;
    
    /**
     * Constructeur 
     */
    public ListePersonnes(){
        listepers = new ArrayList<>();
    }
    
    /**
     * Ajoute une personne à la liste de personnes
     * @param p la personne à ajouter
     */
    public void ajouterPersonne(Personne p){
        listepers.add(p);
    }
    
    /**
     * Vérifie qu'une personne p appartient bien à la liste
     * @param p la personne
     * @return vrai si la personne appartient à la liste, faux dans tous les autres cas
     */
    public boolean appartient(Personne p){
        return listepers.contains(p);
    }
 
    /** 
     * Vérifie si une personne appartient à la liste d'après son 
     * nom et son prénom
     * @param nom
     * @param prenom
     * @return vrai si la personne ayant le bon nom et le bon prénom appartient à la liste
     */
    public boolean appartient(String nom, String prenom){
        boolean present = false;
        Iterator<Personne> li = listepers.iterator();
        while(li.hasNext()){
            Personne p = li.next();
            if(p.getNom().equals(nom) && p.getPrenom().equals(prenom)){
                present = true;
            }
        }
        return present;
    }
    
    /**
     * Affiche l'appartenance d'une personne p à la liste
     * @param p la personne
     */
    public void afficherAppartenance(Personne p){
        if(this.appartient(p)){
            System.out.println("La personne demandée appartient bien à la liste (" + p.getNom() + ", " + p.getPrenom()+").");
        } else {
            System.out.println("La personne demandée n'appartient pas à la liste");
        }
    }
    
    /**
     * Retourne le nombre de personnes dans la liste
     * @return nombre de personnes dans la liste
     */
    public int getNbPersonnes(){
        return listepers.size();
    }
    
}


