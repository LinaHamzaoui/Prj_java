package Location;

import java.time.DateTimeException;
import java.util.Date;

/**
 * @author Lina1
 *
 */
public class Location {
	private int numeroLoc;
	private Date debut;
	private Date fin;

	public Location(int numeroLoc, Date debut, Date fin)
	{
		this.numeroLoc = numeroLoc;
		this.debut = debut;
		this.fin = fin;
	}
	
	public int getNumero()
	{
		return numeroLoc;
	}
	
	public Date getDebut()
	{
		return debut;
	}
	
	public Date getFin()
	{
		return fin;
	}
	
	public void setNumero(int numeroLoc)
	{
		this.numeroLoc = numeroLoc;
	}
	
	public void setDebut(Date debut)
	{
		this.debut = debut;
	}
	
	public void setFin(Date fin)
	{
		this.fin = fin;
	}
	
	public void DureeLocation(Date debut, Date fin, long nb_jours) throws DateTimeException{
		//si la durée de location du véhicule est dépassée alors une exception est lancée
		final long MILLISECONDS_PER_DAY = 1000 * 60 * 60 * 24; 
		 long delta = debut.getTime() - fin.getTime();
		 nb_jours =  delta / (MILLISECONDS_PER_DAY);
		 double devis;
		if(delta > nb_jours){
			throw new Exception("Depassement durée location");
			
			
			if(delta > 2*nb_jours)
			{
				devis = 2*devis;
				System.out.println("Payer le double ");
				 
			}
			else if (delta > 3*nb_jours)
			{
				devis = 3*devis;
				System.out.println("Vous devez payer le triple du tarif.");
			}
			
		}
		
	}

	