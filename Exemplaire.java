package Location;
/**
 * @author Lina1
 *
 */
public class Exemplaire {
	private int Numero;
	private int kilometres;
	public Exemplaire(int numero, int kilometre)
	{
		this.Numero = numero;
		this.kilometres = kilometre;
	}
	public int getNumero()
	{
		return Numero;
	}
	public void setNumero(int numero)
	{
		this.Numero = numero;
	}
	public int getKilometres()
	{
		return kilometres;
	}
	public void setKilometres(int kilometres)
	{
		this.kilometres = kilometres;
	}
	public String toString()
	{
		return "Numero: " + Numero + "Nombre de kilometres: " + kilometres;
	}
}

