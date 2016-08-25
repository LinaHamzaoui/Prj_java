package Location;
/**
 * @author Lina1
 *
 */
public class Vehicule {
	protected String marque;
	public Vehicule(String marque)
	{
		this.marque = marque;
	}
	
	public String getMarque()
	{
		return marque;
	}
	public void setMarque(String marque)
	{
		this.marque = marque;
	}
	public String toString()
	{
		String s;
		s = "Marque: " + marque;
		return s;
	}
	
}
