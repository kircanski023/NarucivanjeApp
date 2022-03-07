import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.print.DocFlavor.STRING;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.BorderLayout;
//import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Font;

public class narucivanjeHrane {

	private JFrame frame;
	private JTextField username;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					narucivanjeHrane window = new narucivanjeHrane();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public narucivanjeHrane() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 191, 215);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		JLabel lblKorisni = new JLabel("Korisni\u010Dko ime");
		lblKorisni.setForeground(new Color(0, 0, 0));
		lblKorisni.setFont(new Font("Calibri", Font.BOLD, 17));
		lblKorisni.setBounds(24, 11, 140, 14);
		
		username = new JTextField();
		username.setBounds(10, 31, 154, 20);
		username.setColumns(10);
		
		JLabel lblLozinka = new JLabel("Lozinka");
		lblLozinka.setForeground(new Color(0, 0, 0));
		lblLozinka.setFont(new Font("Calibri", Font.BOLD, 17));
		lblLozinka.setBounds(24, 62, 140, 14);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(10, 82, 154, 20);
		
		JButton btnPrijava = new JButton("Prijava");
		btnPrijava.setBackground(new Color(255, 255, 255));
		btnPrijava.setForeground(new Color(0, 0, 0));
		btnPrijava.setFont(new Font("Calibri", Font.BOLD, 14));
		btnPrijava.setBounds(10, 145, 154, 23);
		btnPrijava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String uname= username.getText();
				String passw= passwordField.getText();
				if (uname.isEmpty() || (uname.equals(passw) || passw.isEmpty()))
					JOptionPane.showMessageDialog(frame,"Greska!");
				else {
					JOptionPane.showMessageDialog(frame,"Prijava uspesna");
					narucivanjeGlavniP exe= new narucivanjeGlavniP();
					frame.setVisible(false);
					exe.setVisible(true);}
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnPrijava);
		frame.getContentPane().add(lblLozinka);
		frame.getContentPane().add(lblKorisni);
		frame.getContentPane().add(username);
		frame.getContentPane().add(passwordField);
	
	}
}