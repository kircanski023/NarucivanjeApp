import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class burrito extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					burrito frame = new burrito();
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
	public burrito() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 348, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNazad = new JButton("Nazad");
		btnNazad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNazad.setFont(new Font("Calibri", Font.BOLD, 14));
		btnNazad.setBounds(10, 353, 93, 25);
		contentPane.add(btnNazad);
		
		JTextPane txtpnburrito = new JTextPane();
		txtpnburrito.setEditable(false);
		txtpnburrito.setText("burrito + pomfrit");
		txtpnburrito.setFont(new Font("Calibri", Font.BOLD, 30));
		txtpnburrito.setForeground(Color.WHITE);
		txtpnburrito.setBackground(Color.BLACK);
		txtpnburrito.setBounds(10, 23, 312, 151);
		contentPane.add(txtpnburrito);
	
	}

}