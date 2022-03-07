import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pilecaKrilca extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pilecaKrilca frame = new pilecaKrilca();
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
	public pilecaKrilca() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 359, 383);
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
		btnNazad.setBounds(121, 139, 89, 23);
		contentPane.add(btnNazad);
		
		JTextPane txtpnLjutihKrilca = new JTextPane();
		txtpnLjutihKrilca.setText("ljuta krilca + pomfrit");
		txtpnLjutihKrilca.setFont(new Font("Calibri", Font.BOLD, 30));
		txtpnLjutihKrilca.setForeground(Color.WHITE);
		txtpnLjutihKrilca.setBackground(Color.BLACK);
		txtpnLjutihKrilca.setBounds(10, 11, 200, 151);
		contentPane.add(txtpnLjutihKrilca);
		
	}
}
