package View;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Listener.AthentificationListener;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;


public class Authentification extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JButton getbConnecter() {
		return bConnecter;
	}

	public void setbConnecter(JButton bConnecter) {
		this.bConnecter = bConnecter;
	}

	public JButton getbSinscrir() {
		return bSinscrir;
	}

	public void setbSinscrir(JButton bSinscrir) {
		this.bSinscrir = bSinscrir;
	}

	private JTextField tfLogin;
	private JTextField tfMotDePasse;
	private JLabel jlHeader;
	private JLabel jlLogin;
	private JButton bConnecter;
	private JButton bSinscrir;

	public Authentification() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		jlHeader = new JLabel("Gestion de bibliothèque personnelle");
		jlHeader.setBounds(5, 5, 424, 23);
		jlHeader.setHorizontalAlignment(SwingConstants.CENTER);
		jlHeader.setVerifyInputWhenFocusTarget(false);
		jlHeader.setFont(new Font("Comic Sans MS", Font.ITALIC, 16));
		contentPane.add(jlHeader);
		
		jlLogin = new JLabel("Login");
		jlLogin.setBounds(39, 97, 101, 23);
		contentPane.add(jlLogin);
		jlLogin.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		
		JLabel jlMotDePasse = new JLabel("Mot de passe");
		jlMotDePasse.setBounds(39, 135, 96, 30);
		contentPane.add(jlMotDePasse);
		jlMotDePasse.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		
		tfLogin = new JTextField();
		tfLogin.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		tfLogin.setBounds(194, 96, 152, 30);
		contentPane.add(tfLogin);
		tfLogin.setColumns(10);
		
		tfMotDePasse = new JTextField();
		tfMotDePasse.setColumns(10);
		tfMotDePasse.setBounds(194, 138, 152, 30);
		contentPane.add(tfMotDePasse);
		
		bConnecter = new JButton("Se Connecter");
		bConnecter.setBounds(301, 215, 101, 23);
		contentPane.add(bConnecter);
		bConnecter.addActionListener(new AthentificationListener());
		
		bSinscrir = new JButton("S'inscrir");
		bSinscrir.addActionListener(new AthentificationListener());
		bSinscrir.setBounds(46, 215, 106, 23);
		contentPane.add(bSinscrir);
	}

}
