
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.*;

import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Color;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;

import javax.swing.text.*;
public class  narucivanjeGlavniP extends JFrame {

	private JPanel contentPane;
	private JTextField unostelefon;
	private JTextField unosadresa;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField5;
	private JTextField textField6;
	private JTextField textField7;
	private JPanel meni;
	private JPanel lokacija;
	private JPanel zavrsi;
	private JTextField txtRsd;
	private JTextField txtRsd_6;
	private JTextField txtRsd_5;
	private JTextField txtRsd_3;
	private JTextField txtRsd_2;
	private JTextField txtRsd_1;
	
	String ukupno;
	double[] cena = new double[10];
	double[] kolicina = new double[10];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					narucivanjeGlavniP frame = new narucivanjeGlavniP();
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
	public narucivanjeGlavniP() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 648, 557);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		
		
		JPanel meni = new JPanel();
		meni.setBackground(new Color(139, 0, 0));
		contentPane.add(meni, "name_21179649508782");
		meni.setLayout(null);
		meni.setVisible(true);
		
		JPanel lokacija = new JPanel();
		contentPane.add(lokacija, "name_21179637176489");
		lokacija.setLayout(null);
		lokacija.setVisible(false);
		
		JButton btnNazad = new JButton("<Nazad");
		btnNazad.setFont(new Font("Calibri", Font.BOLD, 20));
		btnNazad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				meni.setVisible(true);
				lokacija.setVisible(false);
				
			}
		});
		
		JTextArea racun = new JTextArea();
		racun.setFont(new Font("Calibri", Font.BOLD, 25));
		racun.setEditable(false);
		racun.setBounds(10, 13, 466, 326);
		lokacija.add(racun);
		btnNazad.setBounds(347, 350, 129, 148);
		lokacija.add(btnNazad);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 350, 323, 158);
		lokacija.add(panel);
		panel.setLayout(null);
		
		JLabel grad = new JLabel("Grad");
		grad.setBounds(10, 11, 144, 36);
		panel.add(grad);
		grad.setFont(new Font("Calibri", Font.BOLD, 17));
		
		JLabel adresa = new JLabel("Adresa");
		adresa.setBounds(10, 58, 144, 36);
		panel.add(adresa);
		adresa.setFont(new Font("Calibri", Font.BOLD, 17));
		
		JLabel brtel = new JLabel("Broj telefona");
		brtel.setBounds(10, 105, 144, 36);
		panel.add(brtel);
		brtel.setFont(new Font("Calibri", Font.BOLD, 17));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(172, 11, 144, 36);
		panel.add(comboBox);
		comboBox.setForeground(Color.BLACK);
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Zrenjanin", "Kikinda", "Novi Sad", "Vrsac"}));
		comboBox.setFont(new Font("Calibri", Font.BOLD, 17));
		
		unosadresa = new JTextField();
		unosadresa.setBounds(172, 58, 144, 36);
		panel.add(unosadresa);
		unosadresa.setFont(new Font("Calibri", Font.BOLD, 17));
		unosadresa.setColumns(10);
		
		unostelefon = new JTextField();
		unostelefon.setBounds(172, 105, 144, 36);
		panel.add(unostelefon);
		unostelefon.setFont(new Font("Calibri", Font.BOLD, 17));
		unostelefon.setColumns(10);
		
		JButton btnNewButton = new JButton("Poruci");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String adresa =unosadresa.getText();
				String tel =unostelefon.getText();
				Potvrda potv= new Potvrda();
				if (adresa.equals(""))
					JOptionPane.showMessageDialog(contentPane,"Unesite adresu.");
				else if (tel.equals(""))
					JOptionPane.showMessageDialog(contentPane,"Unesite telefon.");
				else if (ukupno.equals("0.00"))
					JOptionPane.showMessageDialog(contentPane,"Racun ne moze biti prazan.");
				else
				potv.show(true);
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Calibri", Font.BOLD, 20));
		btnNewButton.setBounds(486, 349, 136, 150);
		lokacija.add(btnNewButton);
		
		JLabel label = new JLabel("New label");
		label.setBounds(0, 0, 632, 519);
		lokacija.add(label);
		
		MaskFormatter maska = null;
		try {
			maska = new MaskFormatter("#");
			maska.setPlaceholder("0");
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		
		textField1 = new JFormattedTextField(maska);
		textField1.setToolTipText("Kolicina, najvise 9. ");
		textField1.setVisible(true);
		
		narucivanjeHrane li = new narucivanjeHrane();
		
		JButton btnZatvori = new JButton("Zatvori");
		btnZatvori.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnZatvori.setFont(new Font("Calibri", Font.BOLD, 14));
		btnZatvori.setBounds(21, 473, 89, 34);
		meni.add(btnZatvori);
		textField1.setEnabled(false);
		textField1.setText("0");
		textField1.setHorizontalAlignment(SwingConstants.CENTER);
		textField1.setFont(new Font("Calibri", Font.PLAIN, 17));
		textField1.setBounds(333, 21, 113, 48);
		meni.add(textField1);
		
		JCheckBox checkChesse =  new JCheckBox("Cheesburger");
		checkChesse.setBackground(new Color(255, 255, 255));
		checkChesse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(checkChesse.isSelected()) {
					textField1.setEnabled(true);
					textField1.requestFocus();
				}
				else {
					textField1.setEnabled(false);
					textField1.setText("0");
				}
					
			}
		});
		checkChesse.setFont(new Font("Calibri", Font.BOLD, 17));
		checkChesse.setBounds(6, 21, 208, 48);
		meni.add(checkChesse);
		if(checkChesse.isSelected())
			textField1.setVisible(false);
		
		textField2 = new JFormattedTextField(maska);
		textField2.setToolTipText("Kolicina, najvise 9.");
		textField2.setEnabled(false);
		textField2.setText("0");
		textField2.setHorizontalAlignment(SwingConstants.CENTER);
		textField2.setFont(new Font("Calibri", Font.PLAIN, 17));
		textField2.setBounds(333, 76, 113, 48);
		meni.add(textField2);
		
		JCheckBox checkBox2 = new JCheckBox("Sushi");
		checkBox2.setBackground(new Color(255, 255, 255));
		checkBox2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(checkBox2.isSelected()) {
					textField2.setEnabled(true);
					textField2.requestFocus();
				}
				else {
					textField2.setEnabled(false);
					textField2.setText("0");
				}
					
			}
		});
		checkBox2.setFont(new Font("Calibri", Font.BOLD, 17));
		checkBox2.setBounds(6, 76, 200, 48);
		meni.add(checkBox2);
		
		textField3 = new JFormattedTextField(maska);
		textField3.setToolTipText("Kolicina, najvise 9.");
		textField3.setEnabled(false);
		textField3.setText("0");
		textField3.setHorizontalAlignment(SwingConstants.CENTER);
		textField3.setFont(new Font("Calibri", Font.PLAIN, 17));
		textField3.setColumns(10);
		textField3.setBounds(333, 131, 113, 48);
		meni.add(textField3);
		
		JCheckBox checkBox3 = new JCheckBox("Burrito");
		checkBox3.setBackground(new Color(255, 255, 255));
		checkBox3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(checkBox3.isSelected()) {
					textField3.setEnabled(true);
					textField3.requestFocus();
				}
				else {
					textField3.setEnabled(false);
					textField3.setText("0");
				}
					
			}
		});
		checkBox3.setFont(new Font("Calibri", Font.BOLD, 17));
		checkBox3.setBounds(6, 131, 200, 48);
		meni.add(checkBox3);
		
		textField5 = new JFormattedTextField(maska);
		textField5.setToolTipText("Kolicina, najvise 9.");
		textField5.setEnabled(false);
		textField5.setText("0");
		textField5.setHorizontalAlignment(SwingConstants.CENTER);
		textField5.setFont(new Font("Calibri", Font.PLAIN, 17));
		textField5.setColumns(10);
		textField5.setBounds(333, 241, 113, 48);
		meni.add(textField5);
		
		JCheckBox checkBox5 = new JCheckBox("Belo meso");
		checkBox5.setBackground(new Color(255, 255, 255));
		checkBox5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(checkBox5.isSelected()) {
					textField5.setEnabled(true);
					textField5.requestFocus();
				}
				else {
					textField5.setEnabled(false);
					textField5.setText("0");
				}
					
			}
		});
		checkBox5.setFont(new Font("Calibri", Font.BOLD, 17));
		checkBox5.setBounds(6, 241, 200, 48);
		meni.add(checkBox5);
		
		textField6 = new JFormattedTextField(maska);
		textField6.setToolTipText("Kolicina, najvise 9.");
		textField6.setEnabled(false);
		textField6.setText("0");
		textField6.setHorizontalAlignment(SwingConstants.CENTER);
		textField6.setFont(new Font("Calibri", Font.PLAIN, 17));
		textField6.setColumns(10);
		textField6.setBounds(333, 296, 113, 48);
		meni.add(textField6);
		
		JCheckBox checkBox6 = new JCheckBox("Pileca krilca");
		checkBox6.setBackground(new Color(255, 255, 255));
		checkBox6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(checkBox6.isSelected()) {
					textField6.setEnabled(true);
					textField6.requestFocus();
				}
				else {
					textField6.setEnabled(false);
					textField6.setText("0");
				}
					
			}
		});
		checkBox6.setFont(new Font("Calibri", Font.BOLD, 17));
		checkBox6.setBounds(6, 296, 200, 48);
		meni.add(checkBox6);
		
		textField7 = new JFormattedTextField(maska);
		textField7.setToolTipText("Kolicina, najvise 9.");
		textField7.setEnabled(false);
		textField7.setText("0");
		textField7.setHorizontalAlignment(SwingConstants.CENTER);
		textField7.setFont(new Font("Calibri", Font.PLAIN, 17));
		textField7.setColumns(10);
		textField7.setBounds(333, 351, 113, 48);
		meni.add(textField7);
		
		JCheckBox checkBox7 = new JCheckBox("Nuggets");
		checkBox7.setBackground(new Color(255, 255, 255));
		checkBox7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(checkBox7.isSelected()) {
					textField7.setEnabled(true);
					textField7.requestFocus();
				}
				else {
					textField7.setEnabled(false);
					textField7.setText("0");
				}
					
			}
		});
		checkBox7.setFont(new Font("Calibri", Font.BOLD, 17));
		checkBox7.setBounds(6, 351, 200, 48);
		meni.add(checkBox7);
		
		JButton btnDalje = new JButton("Dalje");
		btnDalje.setFont(new Font("Calibri", Font.BOLD, 14));
		btnDalje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				racun.setText("\0");
				cena[0]= Double.parseDouble(textField1.getText()) * 300;
				cena[1]= Double.parseDouble(textField2.getText()) * 500;
				cena[2]= Double.parseDouble(textField3.getText()) * 350;
				cena[3]= Double.parseDouble(textField5.getText()) * 350;
				cena[4]= Double.parseDouble(textField6.getText()) * 250;
				cena[5]= Double.parseDouble(textField7.getText()) * 300;
				
				cena[6]= cena[0]+cena[1]+cena[2]+cena[3];
				cena[7]= cena[4]+cena[5];
				cena[8]= cena[7]+cena[6];

				ukupno =String.format("%.2f", cena[8]);
				
				String order = new String();
				order ="Racun";
				if(checkChesse.isSelected()) {
					order = order +"\n  Cheeseburger\t"+textField1.getText()+"x";}
				
				if(checkBox2.isSelected()) {
					order = order +"\n  Sushi \t"+textField2.getText()+"x";}
				
				if(checkBox3.isSelected()) {
					order = order +"\n  Burrito \t\t"+textField3.getText()+"x";}
				
				if(checkBox5.isSelected()) {
					order = order +"\n  Belo meso \t\t"+textField5.getText()+"x";}
				
				if(checkBox6.isSelected()) {
					order = order +"\n  Pileca krilca \t\t"+textField6.getText()+"x";}
				
				if(checkBox7.isSelected()) {
					order = order +"\n  Nuggets \t"+textField7.getText()+"x";}
				
				lokacija.setVisible(true);
			    meni.setVisible(false);
			racun.append(order + "\n\n  Ukupno:\t\t" + ukupno);
			}
		});
		btnDalje.setBounds(451, 450, 161, 48);
		meni.add(btnDalje);
		pilecaKrilca hw= new pilecaKrilca();
		burrito ta= new burrito();
		burrito btk= new burrito();
		beloMeso kin= new beloMeso();
		pilecaKrilca ngs= new pilecaKrilca();
		Nuggets hotw2= new Nuggets();
		Cheeseburger cheese=new Cheeseburger();
		cheese.setVisible(false);
		
		txtRsd = new JTextField();
		txtRsd.setEditable(false);
		txtRsd.setFont(new Font("Calibri", Font.PLAIN, 17));
		txtRsd.setBackground(Color.YELLOW);
		txtRsd.setHorizontalAlignment(SwingConstants.CENTER);
		txtRsd.setText("300 RSD");
		txtRsd.setBounds(220, 351, 103, 48);
		meni.add(txtRsd);
		txtRsd.setColumns(10);
		
		txtRsd_6 = new JTextField();
		txtRsd_6.setEditable(false);
		txtRsd_6.setText("350 RSD");
		txtRsd_6.setHorizontalAlignment(SwingConstants.CENTER);
		txtRsd_6.setFont(new Font("Calibri", Font.PLAIN, 17));
		txtRsd_6.setColumns(10);
		txtRsd_6.setBackground(Color.YELLOW);
		txtRsd_6.setBounds(220, 296, 103, 48);
		meni.add(txtRsd_6);
		
		txtRsd_5 = new JTextField();
		txtRsd_5.setEditable(false);
		txtRsd_5.setText("250 RSD");
		txtRsd_5.setHorizontalAlignment(SwingConstants.CENTER);
		txtRsd_5.setFont(new Font("Calibri", Font.PLAIN, 17));
		txtRsd_5.setColumns(10);
		txtRsd_5.setBackground(Color.YELLOW);
		txtRsd_5.setBounds(220, 241, 103, 48);
		meni.add(txtRsd_5);
		
		txtRsd_3 = new JTextField();
		txtRsd_3.setEditable(false);
		txtRsd_3.setText("350 RSD");
		txtRsd_3.setHorizontalAlignment(SwingConstants.CENTER);
		txtRsd_3.setFont(new Font("Calibri", Font.PLAIN, 17));
		txtRsd_3.setColumns(10);
		txtRsd_3.setBackground(Color.YELLOW);
		txtRsd_3.setBounds(220, 131, 103, 48);
		meni.add(txtRsd_3);
		
		txtRsd_2 = new JTextField();
		txtRsd_2.setEditable(false);
		txtRsd_2.setText("500 RSD");
		txtRsd_2.setHorizontalAlignment(SwingConstants.CENTER);
		txtRsd_2.setFont(new Font("Calibri", Font.PLAIN, 17));
		txtRsd_2.setColumns(10);
		txtRsd_2.setBackground(Color.YELLOW);
		txtRsd_2.setBounds(220, 76, 103, 48);
		meni.add(txtRsd_2);
		
		txtRsd_1 = new JTextField();
		txtRsd_1.setEditable(false);
		txtRsd_1.setText("300 RSD");
		txtRsd_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtRsd_1.setFont(new Font("Calibri", Font.PLAIN, 17));
		txtRsd_1.setColumns(10);
		txtRsd_1.setBackground(Color.YELLOW);
		txtRsd_1.setBounds(220, 21, 103, 48);
		meni.add(txtRsd_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(-12, -8, 644, 544);
		meni.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(narucivanjeGlavniP.class.getResource("/slike/9.jpg")));
		 
	}
}
