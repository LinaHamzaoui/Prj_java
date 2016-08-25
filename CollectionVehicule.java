package Location;

import java.util.ArrayList;
/**
 * @author Lina1
 *
 */
public class CollectionVehicule {
	private ArrayList<Vehicule> vehicules;
	private String nom;
	private Integer currentVehicule;
	public CollectionVehicule(String nom)
	{
		this.nom = nom;
		vehicules = new ArrayList<Vehicule>();
		currentVehicule = 0;
	}
	public boolean addVehicule(Vehicule newVehicule)
	{
		if(vehicules.isEmpty())
		{
			vehicules.add(currentVehicule, newVehicule);
			return true;
		}	
		else{
			vehicules.add(currentVehicule + 1, newVehicule);
			return true;
		    }
	}
	public void outputCollectionVehiculeDetails()
	{
		System.out.println("Nom de la collection: " + nom);
		System.out.println("Les vehicules: ");
		for(Vehicule nextVehicule : vehicules)
		{
			System.out.println(nextVehicule.toString());
		}
    }
	
	public Vehicule findVehicule(String marque)
	{
		for(Vehicule v : vehicules)
		{
			if(v.getMarque().equalsIgnoreCase(nom))
				return v;
		}
		return null;
		
	}
}	

		
	
