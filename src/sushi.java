import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class sushi extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sushi frame = new sushi();
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
	public sushi() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 413, 399);
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
		btnNazad.setBounds(294, 50, 93, 25);
		contentPane.add(btnNazad);
		
		JTextPane txtpnSushi = new JTextPane();
		txtpnSushi.setEditable(false);
		txtpnSushi.setBackground(new Color(255, 255, 255));
		txtpnSushi.setText("Sushi");
		txtpnSushi.setFont(new Font("Calibri", Font.BOLD, 30));
		txtpnSushi.setBounds(0, 0, 397, 87);
		contentPane.add(txtpnSushi);
		
	}
}

