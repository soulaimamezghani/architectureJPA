package com.infotel.metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Connexion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idConnexion;
	private String login;
	private String mdp;

@OneToOne(mappedBy="connexion")
 private  Personne personne;


	public int getIdConnexion() {
	return idConnexion;
}

public void setIdConnexion(int idConnexion) {
	this.idConnexion = idConnexion;
}

public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}
public String getMdp() {
	return mdp;
}
public void setMdp(String mdp) {
	this.mdp = mdp;
}

public Personne getPersonne() {
	return personne;
}

public void setPersonne(Personne personne) {
	this.personne = personne;
}

	@Override
	public String toString() {
		return "Connexion [idConnexion=" + idConnexion + ", login=" + login + ", mdp=" + mdp + "]";
	}

}
