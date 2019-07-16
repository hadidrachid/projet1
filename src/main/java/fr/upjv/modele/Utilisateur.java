package fr.upjv.modele;

import java.io.Serializable;

//javabean 
public class Utilisateur implements Serializable   {

	private long identifiant; 
	private String nom; 
	private String prenom;
	private String adresse;
	private String telephone;
	private String login;
	private String password; //trensient
	
	public Utilisateur() {
	
	}

	@Override
	public String toString() {
		return "Utilisateur [identifiant=" + identifiant + ", nom=" + nom + ", prenom=" + prenom + ", adresse="
				+ adresse + ", telephone=" + telephone + ", login=" + login + ", password=" + password + "]";
	}

	public long getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(long identifiant) {
		this.identifiant = identifiant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	} 
	
	
}
