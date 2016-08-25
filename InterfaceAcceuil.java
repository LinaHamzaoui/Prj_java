package Location;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class InterfaceAcceuil extends JFrame {

	/**
	 * @author Lina1
	 *
	 */
	private JButton btnLoc, btnV, btnEmp, btnS;
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceAcceuil frame = new InterfaceAcceuil();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	private static void addAButton(JButton buton, JPanel panel) {
        buton.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(Box.createRigidArea(new Dimension(40,40)));
        panel.add(buton);
    }
	public InterfaceAcceuil() {
		setResizable(true);
		setTitle("Acceuil Location");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		setBounds(100, 100, 1000, 700);
		initInterface();
		
	}
	
	private void initInterface(){
		
		
		
		contentPane1 = new JPanel();
		contentPane1.setPreferredSize(new Dimension(600,400)); 
		setContentPane(contentPane1);
		
		 contentPane1.setLayout(new BoxLayout(contentPane1, BoxLayout.Y_AXIS));
		 	btnEmp = new JButton("Emprunteurs");
		 	btnEmp.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 22));
			btnEmp.setBounds(636, 147, 212, 111);
	        addAButton(btnEmp, contentPane1);
	       
	        btnV= new JButton("Vehicules");
	        btnV.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 22));
			btnV.setBounds(636, 147, 212, 111);
	        addAButton(btnV, contentPane1);
	        
	        btnLoc= new JButton("Locations");
	        btnLoc.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 22));
			btnLoc.setBounds(636, 147, 212, 111);
	        addAButton(btnLoc, contentPane1);
	        
	        
	        btnS = new JButton("Sortir");
	        btnS.setBackground(Color.GREEN);
	        btnS.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 22));
			btnS.setBounds(636, 147, 212, 111);
	        addAButton(btnS, contentPane1);
	        
	        
	        
		 
	    
	 	
	 
		
		
		
		btnEmp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				InsererEmprunteur b = new InsererEmprunteur();
				b.setVisible(true);
			}

		});
		
		
		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				InterfaceVehicule b = new InterfaceVehicule();
				b.setVisible(true);
			}

		});
		
		
		btnLoc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				InterfaceLocation b = new InterfaceLocation();
				b.setVisible(true);
			}

		});
		
		
		
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				InterfaceConnexion b = new InterfaceConnexion();
				b.setVisible(true);
			}

		});
		pack();
		
		
	}
}
