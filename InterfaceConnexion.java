package Location;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
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
public class InterfaceConnexion extends JFrame {
	
	

	private JPanel contentPane;
	
	private JPasswordField password;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					InterfaceConnexion frame = new InterfaceConnexion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public InterfaceConnexion() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		password = new JPasswordField();
		password.setBounds(100, 100, 300, 40);
		contentPane.add(password);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setBounds(300, 90, 10, 20);
		contentPane.add(verticalStrut);

		JTextPane admn = new JTextPane();
		admn.setEditable(false);
		admn.setBackground(Color.WHITE);
		StyledDocument doc = admn.getStyledDocument();		
		MutableAttributeSet center = new SimpleAttributeSet();		
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		doc.setParagraphAttributes(0, doc.getLength(), center, false);
		admn.setFont(new Font("Arial Rounded MT BOLD", Font.PLAIN, 25));
		admn.setText("Connexion Admin:");
		admn.setBounds(50, 10, 400, 50);
		contentPane.add(admn);

		
		JButton ok = new JButton("OK");
		ok.setBounds(200, 203, 70, 29);
		contentPane.add(ok);
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (String.valueOf(password.getPassword()).equals("admin")) {
					dispose();
					InterfaceAcceuil a = new InterfaceAcceuil();
					a.setVisible(true);
				}

			}

		});

		
		

	}
}

