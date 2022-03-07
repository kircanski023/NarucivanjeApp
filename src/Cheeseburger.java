
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cheeseburger extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cheeseburger frame = new Cheeseburger();
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
	public Cheeseburger() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnDuplaPljeskavicaSa = new JTextPane();
		txtpnDuplaPljeskavicaSa.setFont(new Font("Calibri", Font.BOLD, 17));
		txtpnDuplaPljeskavicaSa.setEditable(false);
		txtpnDuplaPljeskavicaSa.setText("Dupla pljeskavica sa sirom, krastavcima, kecapom i senfom + srednji pomfrit i kola(200ml)");
		txtpnDuplaPljeskavicaSa.setBounds(273, 53, 143, 164);
		contentPane.add(txtpnDuplaPljeskavicaSa);
		
		JButton btnNewButton = new JButton("Nazad");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 14));
		btnNewButton.setBounds(273, 228, 151, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Cheeseburger.class.getResource("/slike/burger.jpg")));
		lblNewLabel.setBounds(12, 29, 185, 171);
		contentPane.add(lblNewLabel);
		
	}
}
