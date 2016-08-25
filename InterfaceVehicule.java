package Location;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
/**
 * @author Lina1
 *
 */
@SuppressWarnings("serial")
public class InterfaceVehicule extends JFrame {

	private JPanel contentPane;
	private JTextField marque,modele,type,kilometrage,tJauge;
	private JLabel label;

	private JButton retour;
	private JButton valider;
	private JButton supp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceVehicule frame = new InterfaceVehicule();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	
	public InterfaceVehicule() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		this.setTitle("Ajouter Voiture");;
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(100, 100, 100, 100));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JTextPane t = new JTextPane();
		t.setEditable(false);
		t.setBackground(Color.DARK_GRAY);

		t.setText("\n----Voiture---- ");
		t.setBounds(200, 10, 600, 100);
		StyledDocument doc = t.getStyledDocument();		
		MutableAttributeSet center = new SimpleAttributeSet();		
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		doc.setParagraphAttributes(0, doc.getLength(), center, false);
		t.setFont(new Font("Arial Rounded MT BOLD", Font.PLAIN , 28));
		contentPane.add(t);

		label = new JLabel();
		label.setText("Veuillez remplir les champs suivants pour ajouter une voiture:");
		label.setBounds(320, 85, 600, 100);
		contentPane.add(label);

		marque = new JTextField();
		marque.setFont(new Font("Arial Rounded MT PLAIN", Font.PLAIN, 14));
		marque.setForeground(Color.BLACK);
		marque.setHorizontalAlignment(SwingConstants.CENTER);
		marque.setText("Marque");
		marque.setBounds(250, 160, 500, 30);
		
		contentPane.add(marque);
		marque.setColumns(10);

		modele = new JTextField();
		modele.setText("Modele");
		modele.setHorizontalAlignment(SwingConstants.CENTER);
		modele.setForeground(Color.BLACK);
		modele.setFont(new Font("Arial Rounded MT PLAIN", Font.PLAIN, 14));
		modele.setColumns(10);
		modele.setBounds(250, 200, 500, 30);
		
		contentPane.add(modele);

		type = new JTextField();
		type.setText("Type du vehicule (v/m)");
		type.setHorizontalAlignment(SwingConstants.CENTER);
		type.setForeground(Color.BLACK);
		type.setFont(new Font("Arial Rounded MT PLAIN", Font.PLAIN, 14));
		type.setColumns(10);
		type.setBounds(250, 250, 500, 30);
		
		contentPane.add(type);

		kilometrage = new JTextField();
		kilometrage.setText("Kilometrage");
		kilometrage.setHorizontalAlignment(SwingConstants.CENTER);
		kilometrage.setForeground(Color.BLACK);
		kilometrage.setFont(new Font("Arial Rounded MT PLAIN", Font.PLAIN, 14));
		kilometrage.setColumns(10);
		kilometrage.setBounds(250, 300, 500, 30);
		contentPane.add(kilometrage);


		tJauge = new JTextField();
		tJauge.setText("Jauge");
		tJauge.setHorizontalAlignment(SwingConstants.CENTER);
		tJauge.setForeground(Color.BLACK);
		tJauge.setFont(new Font("Arial Rounded MT PLAIN", Font.PLAIN, 14));
		tJauge.setColumns(10);
		tJauge.setBounds(250, 350, 500, 30);
		contentPane.add(tJauge);

		

		valider = new JButton("VALIDER");
		valider.setFont(new Font("Arial Rounded MT BOLD", Font.PLAIN, 11));
		valider.setBounds(700, 500, 105, 50);
		contentPane.add(valider);


		supp = new JButton("Supprimer un vehicule");
		supp.setFont(new Font("Arial Rounded MT BOLD", Font.PLAIN, 11));
		supp.setBounds(355, 500, 300, 50);
		contentPane.add(supp);
		supp.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				dispose();
				SupprimerVoiture b=new SupprimerVoiture();
				b.setVisible(true);
				// TODO Auto-generated method stub

			}
		});
		retour = new JButton("RETOUR");
		retour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		retour.setFont(new Font("Arial Rounded MT BOLD", Font.PLAIN, 11));;

		retour.setBounds(200, 500, 105, 50);
		contentPane.add(retour);
		
		valider.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				try {
					
					String req = "INSERT INTO vehicules (Kilometrage, Type, Jauge, NomVeh, Genre)  VALUES ("+Integer.parseInt(kilometrage.getText())+",'"+type.getText()+"',"+Integer.parseInt(tJauge.getText())+",'"+marque.getText()+"','"+modele.getText()+"')";
					int i = Connexion.executeUpdate(req);
					System.out.println(+i);
				  
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}catch(NumberFormatException exception){
			System.out.println("erreur dans le format");
		
				}
	
			}
	});
		retour.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				dispose();
				InterfaceAcceuil a=new InterfaceAcceuil();
				a.setVisible(true);
				// TODO Auto-generated method stub

			}
		});


	
}
		}
