package Location;

/**
 * @author Lina1
 *
 */

public class Adresse {
	private int numero;
	private String rue;
	private int code_postal;
	private String ville;
	public Adresse(int numero, String rue, int code_postal, String ville)
	{
		this.numero = numero;
		this.rue = rue;
		this.code_postal = code_postal;
		this.ville = ville;
	}
	public int getNumero()
	{
		return numero;
	}
	public String getRue()
	{
		return rue;
	}
	public int getCode_postal()
	{
		return code_postal;
	}
	public String getVille()
	{
		return ville;
	}
	public void setNumero(int numero)
	{
		this.numero = numero;
	}
	public void setRue(String rue)
	{
		this.rue = rue;
	}
	public void setCode_postal(int code_postal)
	{
		this.code_postal = code_postal;
	}
	public void setVille(String ville)
	{
		this.ville = ville;
	}
	public String toString()
	{
		return "N°" + numero + "rue " + rue + "code postal " + code_postal + "ville " + ville;
	}

}
