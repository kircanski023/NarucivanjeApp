import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Nuggets extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nuggets frame = new Nuggets();
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
	public Nuggets() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 408, 339);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
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
		btnNazad.setBounds(287, 265, 91, 25);
		contentPane.add(btnNazad);
		
		JTextPane txtpnPilecaMedaljona = new JTextPane();
		txtpnPilecaMedaljona.setFont(new Font("Calibri", Font.BOLD, 30));
		txtpnPilecaMedaljona.setBounds(198, 5, 180, 185);
		contentPane.add(txtpnPilecaMedaljona);
		txtpnPilecaMedaljona.setText("4 pileca medaljona i sos + srednji pomfrit + kola(200ml)");
		
    }
}

