package com.infotel.service;

import java.util.List;

import com.infotel.metier.Adresse;
import com.infotel.metier.Connexion;
import com.infotel.metier.Personne;

public interface Iservice {
	public int ajouterPersonne(Personne p);
	public Personne getPersonne (int idPersonne);// trouver une personne a partir de son id
	
	
	public Personne affichagePersonne(int idPersonne);
	public int supprimerPersonne (Personne p);
	public int modifierPersonne (Personne p);
	public List<Personne> findAllPersonnes();
    public List<Personne> rechercherParMc(String mc);//Mc mot cle qui prend en parametre mc
    public int ajouterAdresse(Adresse a);
	public Adresse getAdresse (int idAdresse);// trouver une personne a partir de son id
	public Adresse affichageAdresse(int idAdresse);
	public int supprimerAdresse (Adresse a);
	public int modifierAdresse (Adresse a);
    public List<Adresse> findAllAdresses();
    public List<Adresse> rechercherParMca(String mc);
    public int ajouterConnexion(Connexion c);
   	public Connexion getConnexion (int idConnexion);// trouver une personne a partir de son id
   	public Connexion affichageConnexion(int idConnexion);
   	public int supprimerConnexion (Connexion c);
   	public int modifierConnexion (Connexion c);
    public List<Connexion> findAllConnexion();
    public List<Connexion> rechercherParMcc(String mc);
    public List<Personne> findAllpersonnesConnexion();
    public List<Personne> findAllpersonnesAdresse();
		
	}


