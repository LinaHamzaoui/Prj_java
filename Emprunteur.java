package Location;
/**
 * @author Lina1
 *
 */
public class Emprunteur {
	private int id;
	private String nom;
	private String prenom;
	private Adresse adresse;
	
	public Emprunteur(int id, String nom, String prenom, Adresse adresse)
	{
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
	public int getId()
	{
		return id;
	}
	public String getNom()
	{
		return nom;
	}
	public String getPrenom()
	{
		return prenom;
	}
	public Adresse getAdresse()
	{
		return adresse;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	public void setPrenom(String prenom)
	{
		this.prenom = prenom;
	}
	public void setAdresse(Adresse adresse)
	{
		this.adresse = adresse;
	}
	public void louer(){}
	public void ramener(){}
	
	public String toString()
	{
		String s = "Id: " + id + "Nom: " + nom + "Prenom: " + prenom + "Adresse: " + adresse;
		return s;
	}

}
