package Location;



import java.util.ArrayList;

/**
 * @author Lina1
 *
 */
public class CollectionEmprunteur {
	private ArrayList<Emprunteur> emprunteurs;
	private String nomCollection;
	private Integer currentEmprunteur;
	public CollectionEmprunteur(String nom)
	{
		nomCollection = nom;
		emprunteurs = new ArrayList<Emprunteur>();
		currentEmprunteur = 0;
		
	}
	public boolean addEmprunteur(Emprunteur newEmprunteur)
	{
		if(emprunteurs.isEmpty())
		{
			emprunteurs.add(currentEmprunteur, newEmprunteur);
			return true;
		}
		else{
			 emprunteurs.add(currentEmprunteur + 1, newEmprunteur);
			 return true;
		}
		
	}
	
	public void outputCollectionEmprunteurDetails()
	{
		System.out.println("Nom de la collection: " + nomCollection);
		System.out.println("Les emprunteurs: ");
		for(Emprunteur nextEmprunteur : emprunteurs)
		{
			System.out.println(nextEmprunteur.toString());
		}
	}
	
	public Emprunteur findEmprunteur(String nom)
	{
		for(Emprunteur e : emprunteurs)
		{
			if(e.getNom().equalsIgnoreCase(nom))
				return e;
		}
	    return null;
    }
}
	


