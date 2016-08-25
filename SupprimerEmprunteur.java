package Location;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
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
public class SupprimerEmprunteur extends JFrame {

	private JPanel contentPane;
	private JTextField tNom,tPrenom;
	private JLabel label;
	
	private JButton retour;
	private JButton valider;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SupprimerEmprunteur frame = new SupprimerEmprunteur();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public static void textfieldfocus(final JTextField t){
		t.addFocusListener(new FocusAdapter()
        {
            @Override
            public void focusGained(FocusEvent e)
            {
                t.setText("");
            }
            public void focusLost(FocusEvent e)
            {
                t.setText(t.getText());
            }
        });
	}
	public SupprimerEmprunteur() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		this.setTitle("Supprimer Emprunteur");;
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(100, 100, 100, 100));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JTextPane t = new JTextPane();
		t.setEditable(false);
		t.setBackground(Color.DARK_GRAY);
		
		t.setText("\n----Supprimer un emprunteur---- ");
		t.setBounds(200, 10, 600, 100);
		StyledDocument doc = t.getStyledDocument();		
		MutableAttributeSet center = new SimpleAttributeSet();		
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		doc.setParagraphAttributes(0, doc.getLength(), center, false);
		t.setFont(new Font("Arial Rounded MT BOLD", Font.PLAIN , 28));
		contentPane.add(t);
		
		label = new JLabel();
		label.setText("Veuillez remplir les champs suivants pour supprimer un emprunteur:");
	    label.setBounds(320, 200, 600, 100);
		contentPane.add(label);
		
		tNom = new JTextField();
		tNom.setFont(new Font("Arial Rounded MT PLAIN", Font.PLAIN, 14));
		tNom.setForeground(Color.BLACK);
		tNom.setHorizontalAlignment(SwingConstants.CENTER);
		tNom.setText("nom");
		tNom.setBounds(250, 300, 500, 30);
		textfieldfocus(tNom);
		contentPane.add(tNom);
		tNom.setColumns(10);
		
		tPrenom = new JTextField();
		tPrenom.setText("prenom");
		tPrenom.setHorizontalAlignment(SwingConstants.CENTER);
		tPrenom.setForeground(Color.BLACK);
		tPrenom.setFont(new Font("Arial Rounded MT PLAIN", Font.PLAIN, 14));
		tPrenom.setColumns(10);
		tPrenom.setBounds(250, 400, 500, 30);
		textfieldfocus(tPrenom);
		contentPane.add(tPrenom);
		
		
		valider = new JButton("VALIDER");
		valider.setFont(new Font("Arial Rounded MT BOLD", Font.PLAIN, 11));
		valider.setBounds(700, 500, 105, 50);
		contentPane.add(valider);
		
		valider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String nom = tNom.getText();
				String prenom = tPrenom.getText();
				
				
				
				try {
					System.out.println("connecté");
					String req = "DELETE FROM 'emprunteur' WHERE 'nom' ="+ nom+"AND 'prenom'="+prenom+"";
					int i =Connexion.executeUpdate(req);
					System.out.println(+i);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
		retour.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				dispose();
				InsererEmprunteur a=new InsererEmprunteur();
				a.setVisible(true);
				// TODO Auto-generated method stub
				
			}
		});
	}
	
}
