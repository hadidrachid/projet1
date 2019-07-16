package fr.dawan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.upjv.modele.Utilisateur;

//import fr.dawan.model.Utilisateur;

public class UtilisateurDao {

	// Méthodes CRUD (create read update delete)
	// Une méthode pour insérer des données dans la base de données
	public static int inserer(Utilisateur u, Connection cnx, boolean fermerCnx) throws SQLException {
		// Création de la requête
		String sqlInsertion = "INSERT INTO utilisateur (identifiant, nom, prenom, adresse, telephone, login, password) VALUES (?,?,?,?,?,?,?)";
		
		// Injecter les valeurs de notre objets à enregistrer en BDD dans la requête
		PreparedStatement ps = cnx.prepareStatement(sqlInsertion);
		// Injection dans les ? dans l'ordre dans lequel on a précisé dans la requête ci-dessus
		ps.setLong(1, u.getIdentifiant());
		ps.setString(2, u.getNom());
		ps.setString(3, u.getPrenom());
		ps.setString(4, u.getAdresse());
		ps.setString(5, u.getTelephone());
		ps.setString(6, u.getLogin());
		ps.setString(7, u.getPassword());
		
		// Exécution de la requête
		int result = ps.executeUpdate();
		
		if(fermerCnx) {
			cnx.close();
		}

		return result;
		
	}
	
	// Une méthode pour lire les données
	public static List<Utilisateur> lireTouteLaTableUtilisateur(Connection cnx, boolean fermerConnexion) throws SQLException {
		String sql = "SELECT * FROM utilisateur";
		PreparedStatement ps = cnx.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		
		List<Utilisateur> users = new ArrayList<Utilisateur>();
		
		while(rs.next()) {
			
			Utilisateur user = new Utilisateur();
			user.setAdresse(rs.getString("adresse"));
			user.setIdentifiant(rs.getLong("identifiant"));
			user.setLogin(rs.getString("login"));
			user.setNom(rs.getString("nom"));
			user.setPassword(rs.getString("password"));
			user.setPrenom(rs.getString("prenom"));
			user.setTelephone(rs.getString("telephone"));
			
			users.add(user);
		}
		
		return users;
		
	}
	
	// Une méthode pour mettre à jour les données
	public static int modifier(Utilisateur user, Connection cnx, boolean fermerConnection) throws SQLException {
		
		String sql = "UPDATE utilisateur SET identifiant = ?, adresse=?, login=?, nom=?, prenom=?, telephone =?, password=?";
		
		PreparedStatement ps = cnx.prepareStatement(sql);
		ps.setLong(1, user.getIdentifiant());
		ps.setString(2, user.getAdresse());
		ps.setString(3, user.getLogin());
		ps.setString(4, user.getNom());
		ps.setString(5, user.getPrenom());
		ps.setString(6, user.getTelephone());
		ps.setString(7, user.getPassword());
		
		int result = ps.executeUpdate();
		
		if(fermerConnection) {
			cnx.close();
		}
		
		return result;
		
	}
	
	// Une méthode pour supprimer les données
	public static int supprimer(int id, Connection cnx, boolean fermerConnection) throws SQLException {
		
		String sql = "DELETE FROM utilisateur WHERE identifiant=?";
		PreparedStatement ps = cnx.prepareStatement(sql);
		
		ps.setLong(1, id);
		
		int rs = ps.executeUpdate();
		
		if(fermerConnection) {
			cnx.close();
		}
		
		return rs;
	}
}
