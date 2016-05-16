/**
 * Bibliothèque
 * TP CVDA 2016 - Amélie Cordier
 */
package bibliotheque;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

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
        listepers.add(p);
    }
    
    public boolean appartient(Personne p){
        return listepers.contains(p);
    }
 
    public boolean appartient(String nom, String prenom){
        boolean present = false;
        Iterator<Personne> li = listepers.iterator();
        while(li.hasNext()){
            Personne p = li.next();
            if(p.getNom()==nom && p.getPrenom()==prenom){
                present = true;
            }
        }
        return present;
    }
    
    public void afficherAppartenance(Personne p){
        if(this.appartient(p)){
            System.out.println("La personne demandée appartient bien à la liste (" + p.getNom() + ", " + p.getPrenom()+").");
        } else {
            System.out.println("La personne demandée n'appartient pas à la liste");
        }
    }
    public int getNbPersonnes(){
        return listepers.size();
    }
    
}


