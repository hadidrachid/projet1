package fr.upjv.javaDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.dawan.dao.UtilisateurDao;
//import fr.dawan.model.Utilisateur;
import fr.dawan.utils.ConnexionBDD;
import fr.upjv.modele.Utilisateur;

public class App 
{
    public static void main( String[] args )
    {
    	Utilisateur u = new Utilisateur();
    	u.setAdresse("monAdresse");
    	u.setLogin("psw");
    	u.setNom("Delafont");
    	u.setPassword("pswd");
    	u.setPrenom("Arnaud");
    	u.setTelephone("012222222222");
    	
    	ConnexionBDD cnx = new ConnexionBDD();

    	try {
    		// Insertion
			UtilisateurDao.inserer(u, cnx.getConnection(), true);
			
			// Lecture
			List<Utilisateur> resultUsers = UtilisateurDao.lireTouteLaTableUtilisateur(cnx.getConnection(), true);
//			// Modification
//			Utilisateur userAModifer = new Utilisateur();
//			userAModifer.setIdentifiant(1);
//			userAModifer.setAdresse("adresseModifier");
//			userAModifer.setLogin("NomModifier");
//			userAModifer.setNom("nomModifier");
//	    	userAModifer.setPassword("nouveaupswd");
//	    	userAModifer.setPrenom("nouveauPrenom");
//	    	userAModifer.setTelephone("012222222222");
//			
//	    	UtilisateurDao.modifier(userAModifer, cnx.getConnection(), true);
//			
			for(Utilisateur user : resultUsers) {
				System.out.println(user.toString());
			}
//		
//			// Suppression
//			UtilisateurDao.supprimer(1, cnx.getConnection(), true);
    	
    	} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
    }
}
