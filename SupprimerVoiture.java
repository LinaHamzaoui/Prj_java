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
public class SupprimerVoiture extends JFrame {

	private JPanel contentPane;
	private JTextField idV;
	private JLabel label;
	
	private JButton retour;
	private JButton valider;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SupprimerVoiture frame = new SupprimerVoiture();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
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
	public SupprimerVoiture() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		this.setTitle("Supprimer Voiture");;
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(100, 100, 100, 100));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JTextPane t = new JTextPane();
		t.setEditable(false);
		t.setBackground(Color.WHITE);
		
		t.setText("\n----Supprimer une voiture---- ");
		t.setBounds(200, 10, 600, 100);
		StyledDocument doc = t.getStyledDocument();		
		MutableAttributeSet center = new SimpleAttributeSet();		
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		doc.setParagraphAttributes(0, doc.getLength(), center, false);
		t.setFont(new Font("Arial Rounded MT BOLD", Font.PLAIN , 28));
		contentPane.add(t);
		
		label = new JLabel();
		label.setText("Veuillez saisir l'identifiant d la voiture à supprimer:");
	    label.setBounds(350, 100, 500, 150);
		contentPane.add(label);
		
		idV = new JTextField();
		idV.setText("Id Voiture");
		idV.setHorizontalAlignment(SwingConstants.CENTER);
		idV.setForeground(Color.BLACK);
		idV.setFont(new Font("Arial Rounded MT PLAIN", Font.PLAIN, 14));
		idV.setColumns(10);
		idV.setBounds(390, 200, 200, 30);
		
		contentPane.add(idV);
		
		
		
		
		valider = new JButton("VALIDER");
		valider.setFont(new Font("Arial Rounded MT BOLD", Font.PLAIN, 11));
		valider.setBounds(700, 350, 105, 50);
		contentPane.add(valider);
		
		valider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int id = Integer.parseInt(idV.getText());
				
				
				try {
					
					String req = "DELETE FROM 'vehicule' WHERE IdVehicule = "+id;
					
					 int i = Connexion.executeUpdate(req);
					 System.out.println(+i);
					 System.out.println("update");
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
		
		retour.setBounds(200, 350, 105, 50);
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
