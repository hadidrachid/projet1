package fr.upjv.modele;

import java.io.Serializable;

public class Produit  implements Serializable {
	
	private	long id; 
	private String description;
	private double prix;
	
	public Produit() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	
	
	
	
	
	

}
