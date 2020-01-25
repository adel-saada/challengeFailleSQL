package fr.NoPasaran.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Administrateur")
public class Admin {

	@Id
	@GeneratedValue
	@Column(name = "id",nullable=false)
	private Long id;

	@Column(name = "nom", length = 128, nullable = false)
	private String nom;
	
	@Column(name = "motDePasse", nullable = false)
	private String motDePasse;
	
	public Admin() {
		
	}
	
	public Admin(String nom, String motDePasse) {
		this.nom = nom;
		this.motDePasse = motDePasse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	
	
}
