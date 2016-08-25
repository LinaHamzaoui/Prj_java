package Location;

import java.util.ArrayList;
/**
 * @author Lina1
 *
 */
public class CollectionExemplaire{
	private ArrayList<Exemplaire> exemplaires;
	private String nom;
	private Integer currentExemplaire;
	public CollectionExemplaire(String nom)
	{
		this.nom = nom;
		exemplaires = new ArrayList<Exemplaire>();
		currentExemplaire = 0;
	}
	public boolean addExemplaire(Exemplaire newExemplaire)
	{
		if(exemplaires.isEmpty())
		{
			exemplaires.add(currentExemplaire, newExemplaire);
			return true;
		}
		else{
			exemplaires.add(currentExemplaire + 1, newExemplaire);
			return true;
	        }
	}
	public void outputCollectionExemplaireDetails()
	{
		
		for(Exemplaire nextExemplaire : exemplaires)
		{
			System.out.println(nextExemplaire.toString());
		}
	}
	
	
}		
	
	
	
	
	
	
	
	