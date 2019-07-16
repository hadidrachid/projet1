package fr.upjv.javaDB;

import java.awt.List;

import fr.dawan.dao.ProduitDao;
import fr.dawan.dao.UtilisateurDao;
import fr.dawan.utils.ConnexionBDD;
import fr.upjv.modele.Produit;
import fr.upjv.modele.Utilisateur;

public class AppProduit {

	public static void main(String[] args) {
	
		Produit p = new Produit();
    
    	p.setDescription("prod1");
    	p.setPrix(25);
    	
    
    	ConnexionBDD cnx = new ConnexionBDD();

    	try {
    		// Insertion
			ProduitDao.inserer(p, cnx.getConnection(), true);
			
	//		List<Produit> resultProduit =  ProduitDao.LireParIdentifiant(1, cnx.getConnection(), true) ; 
			
			// Lecture
		//	List<Utilisateur> resultUsers = UtilisateurDao.lireTouteLaTableUtilisateur(cnx.getConnection(), true);
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
//			for(Produit prd : resultUsers) {
//				System.out.println(user.toString());
//			}
//		
//			// Suppression
//			UtilisateurDao.supprimer(1, cnx.getConnection(), true);
    	
    	} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		

	}

}
