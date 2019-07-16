package fr.dawan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.upjv.modele.Produit;
import fr.upjv.modele.Utilisateur;

public class ProduitDao {
	
	// Méthodes CRUD (create read update delete)
		// Une méthode pour insérer des données dans la base de données
		public static int inserer(Produit u, Connection cnx, boolean fermerCnx) throws SQLException {
			// Création de la requête
			String sqlInsertion = "INSERT INTO Produit (id, description, prix) VALUES (?,?,?)";
			
			// Injecter les valeurs de notre objets à enregistrer en BDD dans la requête
			PreparedStatement ps = cnx.prepareStatement(sqlInsertion);
			// Injection dans les ? dans l'ordre dans lequel on a précisé dans la requête ci-dessus
			ps.setLong(1, u.getId());
			ps.setString(2, u.getDescription());
			ps.setDouble(3, u.getPrix());
			
			// Exécution de la requête
			int result = ps.executeUpdate();
			
			if(fermerCnx) {
				cnx.close();
			}

			return result;
			
		}
		
		public static  Produit LireParIdentifiant(long idp, Connection cnx, boolean fermerConnexion) throws SQLException {
			
			String sql = "SELECT * FROM utilisateur where id = ?";
			PreparedStatement ps = cnx.prepareStatement(sql);
			ps.setLong(1, idp);
			
			ResultSet rs = ps.executeQuery();
			
			// List<Produit> leproduit = new ArrayList<Produit>();
			
			// while(rs.next()) {
			rs.next(); 
			
			Produit prd = new Produit();
				
				prd.setId(rs.getLong("id"));
				prd.setDescription(rs.getString("description")); 
				prd.setPrix(rs.getDouble("prix")); 
				
				
			//	leproduit.add(prd);
			// }
			
			return prd; 
			
		}
		
		
	
}
