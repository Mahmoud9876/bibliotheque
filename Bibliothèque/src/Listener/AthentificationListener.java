package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.Authentification;
import View.Inscription;

public class AthentificationListener implements ActionListener{
	Authentification auth;
	public AthentificationListener() {
		auth = new Authentification();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == auth.getbConnecter()) {
			System.out.println("clicked");
		}
		if(e.getSource() == auth.getbSinscrir()) {
			Inscription inscription = new Inscription();
			inscription.setVisible(true);
		}
	}

}
