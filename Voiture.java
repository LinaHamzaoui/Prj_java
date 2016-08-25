package Location;
/**
 * @author Lina1
 *
 */
public class Voiture extends Vehicule{
	private String modele;
	public Voiture(String marque, String modele)
	{
		super(marque);
		this.modele = modele;
	}
	
	public String getModele()
	{
		return modele;
	}
	
	public void setModele(String modele)
	{
		this.modele = modele;
	}
	public String toString()
	{
		return "Marque: " + marque + "Modele: " + modele;
	}
	
	
	
	

}
