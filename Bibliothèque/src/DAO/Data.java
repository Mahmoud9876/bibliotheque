package DAO;
/*
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;*/

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/*import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;*/

import Model.Ecrivain;
import Model.Livre;

public class Data {
	public static void main(String args[]) throws Exception {
		Configuration config = new Configuration();
		config = config.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction tx = null;
		
		try {
			tx = session.beginTransaction();
			Ecrivain ecrivain = new Ecrivain(null,"Poelo","Coelo","Bresilien");
			Livre livre = new Livre(null,"Alchimiste",ecrivain);
			session.save(ecrivain);
			session.save(livre);
			tx.commit();
			session.close();
		} catch (Exception e) {
			if(tx!=null) {
				tx.rollback();
				throw e;
			}
			sessionFactory.close();
		}
	}
	
	/* Connection con = null;
	void connexionDataBase() {
		try  {
			System.out.println("debut du chargement");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver charg? avec succes");
		} catch (Exception ex1 ) {
			System.out.println("Chargement Driver non r?ussi" + ex1.getLocalizedMessage());	
		}
	
		try {
			con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/ensa?" +
	                                  "user=root&password=");
			System.out.println(" connexion reussie " );
		} catch (SQLException ex2) {
			System.out.println("SQLException: " + ex2.getMessage());
			System.out.println("SQLState: " + ((SQLException) ex2).getSQLState());
			System.out.println("VendorError: " + ((SQLException) ex2).getErrorCode());
		}

		try{
			Statement st;
			st = (Statement) con.createStatement();
			ResultSet res = null;
			res  = st.executeQuery("select * from etudiant");
			while(res.next())
				System.out.println("le resultat est " + res.getString("nom"));
		} catch (Exception ex) {

		}
	}*/
}
