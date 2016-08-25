package Location;


import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JTextPane;




import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
/**
 * @author Lina1
 *
 */
@SuppressWarnings("serial")
public class InterfaceLocation extends JFrame {

	private JPanel contentPane;
	private JTextField tNom,tPrenom,tNrue,tRue,tCP;
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
					InterfaceLocation frame = new InterfaceLocation();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	
	public InterfaceLocation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		this.setTitle("Ajouter Location");;
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(100, 100, 100, 100));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JTextPane t = new JTextPane();
		t.setEditable(false);
		t.setBackground(Color.DARK_GRAY);

		t.setText("\n----Location---- ");
		t.setBounds(200, 10, 600, 100);
		StyledDocument doc = t.getStyledDocument();		
		MutableAttributeSet center = new SimpleAttributeSet();		
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		doc.setParagraphAttributes(0, doc.getLength(), center, false);
		t.setFont(new Font("Arial Rounded MT BOLD", Font.PLAIN , 28));
		contentPane.add(t);

		label = new JLabel();
		label.setText("Veuillez remplir les champs suivants pour ajouter une Location:");
		label.setBounds(320, 85, 600, 100);
		contentPane.add(label);

		tNom = new JTextField();
		tNom.setFont(new Font("Arial Rounded MT PLAIN", Font.PLAIN, 14));
		tNom.setForeground(Color.BLACK);
		tNom.setHorizontalAlignment(SwingConstants.CENTER);
		tNom.setText("Date debut de location");
		tNom.setBounds(250, 160, 500, 30);
		
		contentPane.add(tNom);
		tNom.setColumns(10);

		tPrenom = new JTextField();
		tPrenom.setText("Date fin de location");
		tPrenom.setHorizontalAlignment(SwingConstants.CENTER);
		tPrenom.setForeground(Color.BLACK);
		tPrenom.setFont(new Font("Arial Rounded MT PLAIN", Font.PLAIN, 14));
		tPrenom.setColumns(10);
		tPrenom.setBounds(250, 200, 500, 30);
		
		contentPane.add(tPrenom);

		tNrue = new JTextField();
		tNrue.setText("numero rue");
		tNrue.setHorizontalAlignment(SwingConstants.CENTER);
		tNrue.setForeground(Color.BLACK);
		tNrue.setFont(new Font("Arial Rounded MT PLAIN", Font.PLAIN, 14));
		tNrue.setColumns(10);
		tNrue.setBounds(250, 250, 500, 30);
		contentPane.add(tNrue);

		tRue = new JTextField();
		tRue.setText("rue");
		tRue.setHorizontalAlignment(SwingConstants.CENTER);
		tRue.setForeground(Color.BLACK);
		tRue.setFont(new Font("Arial Rounded MT PLAIN", Font.PLAIN, 14));
		tRue.setColumns(10);
		tRue.setBounds(250, 300, 500, 30);
		contentPane.add(tRue);

		tCP = new JTextField();
		tCP.setText("code postal");
		tCP.setHorizontalAlignment(SwingConstants.CENTER);
		tCP.setForeground(Color.BLACK);
		tCP.setFont(new Font("Arial Rounded MT PLAIN", Font.PLAIN, 14));
		tCP.setColumns(10);
		tCP.setBounds(250, 350, 500, 30);
		contentPane.add(tCP);


		valider = new JButton("VALIDER");
		valider.setFont(new Font("Arial Rounded MT BOLD", Font.PLAIN, 11));
		valider.setBounds(700, 500, 105, 50);
		contentPane.add(valider);


		supp = new JButton("Supprimer une Location");
		supp.setFont(new Font("Arial Rounded MT BOLD", Font.PLAIN, 11));
		supp.setBounds(355, 500, 300, 50);
		contentPane.add(supp);
		supp.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				dispose();
				SupprimerLocation b=new SupprimerLocation();
				b.setVisible(true);
				// TODO Auto-generated method stub

			}
		});
		retour = new JButton("RETOUR");
		
		retour.setFont(new Font("Arial Rounded MT BOLD", Font.PLAIN, 11));;

		retour.setBounds(200, 500, 105, 50);
		contentPane.add(retour);
		
		valider.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String req = null;
				try {
					System.out.println("connecté");
					
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
