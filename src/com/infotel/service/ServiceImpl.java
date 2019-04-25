package com.infotel.service;

import java.util.List;

import com.infotel.dao.DaoImpl;
import com.infotel.dao.Idao;
import com.infotel.metier.Adresse;
import com.infotel.metier.Connexion;
import com.infotel.metier.Personne;

public class ServiceImpl implements Iservice{
	Idao dao = new  DaoImpl();

	@Override
	public int ajouterPersonne(Personne p) {
		// TODO Auto-generated method stub
		return dao.ajouterPersonne(p);
	}

	@Override
	public Personne getPersonne(int idPersonne) {
		// TODO Auto-generated method stub
		return dao.getPersonne(idPersonne);
	}

	@Override
	public int supprimerPersonne(Personne p) {
		// TODO Auto-generated method stub
		return dao.supprimerPersonne(p);
	}

	@Override
	public int modifierPersonne(Personne p) {
		// TODO Auto-generated method stub
		return dao.modifierPersonne(p);
	}

	@Override
	public Personne affichagePersonne(int idPersonne) {
		// TODO Auto-generated method stub
		return dao.affichagePersonne(idPersonne);
	}

	@Override
	public List<Personne> findAllPersonnes() {
		// TODO Auto-generated method stub
		return dao.findAllPersonnes();
	}

	@Override
	public List<Personne> rechercherParMc(String mc) {
		// TODO Auto-generated method stub
		return dao.rechercherParMc(mc);
	}

	@Override
	public int ajouterAdresse(Adresse a) {
		// TODO Auto-generated method stub
		return dao.ajouterAdresse(a);
	}

	@Override
	public Adresse getAdresse(int idAdresse) {
		// TODO Auto-generated method stub
		return dao.getAdresse(idAdresse);
	}

	@Override
	public Adresse affichageAdresse(int idAdresse) {
		// TODO Auto-generated method stub
		return dao.affichageAdresse(idAdresse);
	}

	@Override
	public int supprimerAdresse(Adresse a) {
		// TODO Auto-generated method stub
		return dao.supprimerAdresse(a);
	}

	@Override
	public int modifierAdresse(Adresse a) {
		// TODO Auto-generated method stub
		return dao.modifierAdresse(a);
	}

	@Override
	public List<Adresse> findAllAdresses() {
		// TODO Auto-generated method stub
		return dao.findAllAdresses();
	}

	@Override
	public List<Adresse> rechercherParMca(String mc) {
		// TODO Auto-generated method stub
		return dao.rechercherParMca(mc);
	}

	@Override
	public int ajouterConnexion(Connexion c) {
		// TODO Auto-generated method stub
		return dao.ajouterConnexion(c);
	}

	@Override
	public Connexion getConnexion(int idConnexion) {
		// TODO Auto-generated method stub
		return dao.getConnexion(idConnexion);
	}

	@Override
	public Connexion affichageConnexion(int idConnexion) {
		// TODO Auto-generated method stub
		return dao.affichageConnexion(idConnexion);
	}

	@Override
	public int supprimerConnexion(Connexion c) {
		// TODO Auto-generated method stub
		return dao.supprimerConnexion(c);
	}

	@Override
	public int modifierConnexion(Connexion c) {
		// TODO Auto-generated method stub
		return dao.modifierConnexion(c);
	}

	@Override
	public List<Connexion> findAllConnexion() {
		// TODO Auto-generated method stub
		return dao.findAllConnexion();
	}

	@Override
	public List<Connexion> rechercherParMcc(String mc) {
		// TODO Auto-generated method stub
		return dao.rechercherParMcc(mc);
	}

	@Override
	public List<Personne> findAllpersonnesConnexion() {
		// TODO Auto-generated method stub
		return dao.findAllpersonnesConnexion();
	}

	@Override
	public List<Personne> findAllpersonnesAdresse() {
		// TODO Auto-generated method stub
		return dao.findAllpersonnesAdresse();
	}


}
