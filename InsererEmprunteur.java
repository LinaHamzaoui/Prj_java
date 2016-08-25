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
public class InsererEmprunteur extends JFrame {

	private JPanel contentPane;
	private JTextField tNom,tPrenom,tNtel,tNrue,tRue,tCP,tVi;
	private JLabel label;

	private JButton retour;
	private JButton valider;
	private JButton supp;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InsererEmprunteur frame = new InsererEmprunteur();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	
	public InsererEmprunteur() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		this.setTitle("Ajouter Emprunteur");;
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(100, 100, 100, 100));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JTextPane t = new JTextPane();
		t.setEditable(false);
		t.setBackground(Color.DARK_GRAY);

		t.setText("\n----Emprunteur---- ");
		t.setBounds(200, 10, 600, 100);
		StyledDocument doc = t.getStyledDocument();		
		MutableAttributeSet center = new SimpleAttributeSet();		
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		doc.setParagraphAttributes(0, doc.getLength(), center, false);
		t.setFont(new Font("Arial Rounded MT BOLD", Font.PLAIN , 28));
		contentPane.add(t);

		label = new JLabel();
		label.setText("Veuillez remplir les champs suivants pour ajouter un emprunteur:");
		label.setBounds(320, 85, 600, 100);
		contentPane.add(label);

		tNom = new JTextField();
		tNom.setFont(new Font("Arial Rounded MT PLAIN", Font.PLAIN, 14));
		tNom.setForeground(Color.BLACK);
		tNom.setHorizontalAlignment(SwingConstants.CENTER);
		tNom.setText("nom");
		tNom.setBounds(250, 160, 500, 30);
		
		contentPane.add(tNom);
		tNom.setColumns(10);

		tPrenom = new JTextField();
		tPrenom.setText("prenom");
		tPrenom.setHorizontalAlignment(SwingConstants.CENTER);
		tPrenom.setForeground(Color.BLACK);
		tPrenom.setFont(new Font("Arial Rounded MT PLAIN", Font.PLAIN, 14));
		tPrenom.setColumns(10);
		tPrenom.setBounds(250, 200, 500, 30);
		
		contentPane.add(tPrenom);

		tNtel = new JTextField();
		tNtel.setText("numero telephone");
		tNtel.setHorizontalAlignment(SwingConstants.CENTER);
		tNtel.setForeground(Color.BLACK);
		tNtel.setFont(new Font("Arial Rounded MT PLAIN", Font.PLAIN, 14));
		tNtel.setColumns(10);
		tNtel.setBounds(250, 250, 500, 30);
		
		contentPane.add(tNtel);

		tNrue = new JTextField();
		tNrue.setText("numero rue");
		tNrue.setHorizontalAlignment(SwingConstants.CENTER);
		tNrue.setForeground(Color.BLACK);
		tNrue.setFont(new Font("Arial Rounded MT PLAIN", Font.PLAIN, 14));
		tNrue.setColumns(10);
		tNrue.setBounds(250, 300, 500, 30);
		contentPane.add(tNrue);

		tRue = new JTextField();
		tRue.setText("rue");
		tRue.setHorizontalAlignment(SwingConstants.CENTER);
		tRue.setForeground(Color.BLACK);
		tRue.setFont(new Font("Arial Rounded MT PLAIN", Font.PLAIN, 14));
		tRue.setColumns(10);
		tRue.setBounds(250, 350, 500, 30);
		contentPane.add(tRue);

		tCP = new JTextField();
		tCP.setText("code postal");
		tCP.setHorizontalAlignment(SwingConstants.CENTER);
		tCP.setForeground(Color.BLACK);
		tCP.setFont(new Font("Arial Rounded MT PLAIN", Font.PLAIN, 14));
		tCP.setColumns(10);
		tCP.setBounds(250, 400, 500, 30);
		contentPane.add(tCP);

		tVi = new JTextField();
		tVi.setText("ville");
		tVi.setHorizontalAlignment(SwingConstants.CENTER);
		tVi.setForeground(Color.BLACK);
		tVi.setFont(new Font("Arial Rounded MT PLAIN", Font.PLAIN, 14));
		tVi.setColumns(10);
		tVi.setBounds(250, 350, 500, 30);
		contentPane.add(tVi);

		valider = new JButton("VALIDER");
		valider.setFont(new Font("Arial Rounded MT BOLD", Font.PLAIN, 11));
		valider.setBounds(700, 500, 105, 50);
		contentPane.add(valider);


		supp = new JButton("Supprimer un emprunteur");
		supp.setFont(new Font("Arial Rounded MT BOLD", Font.PLAIN, 11));
		supp.setBounds(355, 500, 300, 50);
		contentPane.add(supp);
		supp.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				dispose();
				SupprimerEmprunteur b=new SupprimerEmprunteur();
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
				String nom = tNom.getText();
				String prenom = tPrenom.getText();
				String rue = tRue.getText();
				int numero = Integer.parseInt(tNtel.getText());
				int cp = Integer.parseInt(tCP.getText());
				int numR = Integer.parseInt(tNrue.getText());
				try {
					
					String req = "INSERT INTO emprunteur(Nom,Prenom,NumTel,Numero,Rue,CP) VALUES('"+nom+"','" + prenom+ "','" +numero+ "','" + numR+ "','" + rue+"','"+cp+"')";
					Connexion.executeUpdate(req);
					System.out.println("update");
					
				  
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
