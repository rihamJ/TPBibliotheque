package bibliotheque;

/**
 *
 * @author Amelie
 */
public class Livre {
    
    private int numLivre;
    private String titre;
    private int nombreDePages;
    private Personne auteur;
    
    private static int dernierNum;
    
    public Livre(String titrelivre, int nbpages, Personne auteurlivre){
        numLivre = getNextNumLivre();
        titre = titrelivre;
        nombreDePages = nbpages;
        auteur = auteurlivre;
    }
    
    public int getNumLivre(){
        return numLivre;
    }
    
    public String getTitre(){
        return titre;
    }
    
    public int getNombreDePages(){
        return nombreDePages;
    }
    
    public Personne getAuteur(){
        return auteur;
    }
    
    private int getNextNumLivre(){
        int numero = dernierNum; 
        dernierNum = dernierNum + 1;
        return numero; 
    }
    
    
    public void setTitre(String titrelivre){
        titre = titrelivre;
    }
    
    public void setAuteur(Personne p){
        auteur = p;
    }
    
    public void setNombreDePages(int nbPages){
        nombreDePages = nbPages;
    }
    
    public String toString(){
        Personne a = auteur;
        return titre + ", " + a.getPrenom() + " " + a.getNom()+ ", " + nombreDePages + "p.";
    }
}
        
