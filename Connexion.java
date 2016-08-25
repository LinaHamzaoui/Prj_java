package Location;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * @author Lina1
 *
 */

public class Connexion {
	public static String executeQuery(String mess) throws SQLException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) {
		}
		
		String url = "jdbc:mysql://localhost/location";
		String utilisateur = "root";
		String motDePasse = "";
		Connection connexion = null;
		String string="Affichage";
	
		try {
		    connexion = DriverManager.getConnection( url, utilisateur, motDePasse );
		    
			Statement statement = connexion.createStatement();
			
			ResultSet r = statement.executeQuery( mess );
			
			ResultSetMetaData resultMeta = r.getMetaData();
			System.out.println(string+="\n");
			
		    for(int i = 1; i <= resultMeta.getColumnCount(); i++)
		    	string+=  resultMeta.getColumnName(i).toUpperCase() + "\t ";
		       
		    System.out.println(string+="\n");		         
		    while(r.next()){         
		    	for(int i = 1; i <= resultMeta.getColumnCount(); i++)
		    		string+= r.getObject(i).toString() + "\t |";
		          
		    	System.out.println(string+="\n");
		    }

		      r.close();
		      statement.close();
			
			

		} catch ( SQLException e ) {
		    System.out.println("sql exception");
		}
		try {
            System.out.println("la connexon va être fermée");
            connexion.close();
        } catch ( SQLException e ) {
            e.printStackTrace();
        }
		
		
		
		return string;
	}
	
	public static int executeUpdate(String mess) throws SQLException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} 
		catch (ClassNotFoundException e) {
		}
		
		String url = "jdbc:mysql://localhost/location";
		String utilisateur = "root";
		String motDePasse = "";
		Connection connexion ;
		int r=0;
		try {
			System.out.println("preparation de la connexion a la bdd");
		    connexion = DriverManager.getConnection( url, utilisateur, motDePasse );
		    System.out.println("connexion reussie");
			Statement statement = connexion.createStatement();
			r = statement.executeUpdate( mess );
			System.out.println("requete excecutee");


		} catch ( SQLException e ) {
		   e.printStackTrace();
		
		}
		
		
		return r;
		
		
	}

}
