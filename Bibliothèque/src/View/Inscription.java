package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;


public class Inscription extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNom;
	private JTextField tfPrenom;
	private JTextField tfEmail;
	private JTextField tfMotDePasse;
	private JTextField tfCMotDePasse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inscription frame = new Inscription();
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
	public Inscription() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel jHeader = new JLabel("Inscription");
		jHeader.setHorizontalAlignment(SwingConstants.CENTER);
		jHeader.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		jHeader.setBounds(0, 0, 434, 33);
		contentPane.add(jHeader);
		
		JLabel jlNom = new JLabel("Nom");
		jlNom.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		jlNom.setBounds(40, 60, 46, 14);
		contentPane.add(jlNom);
		
		JLabel jlPrenom = new JLabel("Pr\u00E9nom");
		jlPrenom.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		jlPrenom.setBounds(40, 90, 58, 14);
		contentPane.add(jlPrenom);
		
		JLabel jlEmail = new JLabel("Email");
		jlEmail.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		jlEmail.setBounds(40, 120, 46, 14);
		contentPane.add(jlEmail);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe");
		lblMotDePasse.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblMotDePasse.setBounds(40, 150, 86, 19);
		contentPane.add(lblMotDePasse);
		
		JLabel jlCMotDePasse = new JLabel("Confirmation");
		jlCMotDePasse.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		jlCMotDePasse.setBounds(40, 180, 121, 20);
		contentPane.add(jlCMotDePasse);
		
		tfNom = new JTextField();
		tfNom.setBounds(171, 57, 178, 20);
		contentPane.add(tfNom);
		tfNom.setColumns(10);
		
		tfPrenom = new JTextField();
		tfPrenom.setColumns(10);
		tfPrenom.setBounds(171, 87, 178, 20);
		contentPane.add(tfPrenom);
		
		tfEmail = new JTextField();
		tfEmail.setColumns(10);
		tfEmail.setBounds(171, 117, 178, 20);
		contentPane.add(tfEmail);
		
		tfMotDePasse = new JTextField();
		tfMotDePasse.setColumns(10);
		tfMotDePasse.setBounds(171, 147, 178, 20);
		contentPane.add(tfMotDePasse);
		
		tfCMotDePasse = new JTextField();
		tfCMotDePasse.setColumns(10);
		tfCMotDePasse.setBounds(171, 177, 178, 20);
		contentPane.add(tfCMotDePasse);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setBounds(72, 213, 89, 23);
		contentPane.add(btnAnnuler);
		
		JButton button = new JButton("S'inscrir");
		button.setBounds(285, 213, 89, 23);
		contentPane.add(button);
	}
}
