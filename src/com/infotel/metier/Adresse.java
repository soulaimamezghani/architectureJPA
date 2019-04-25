package com.infotel.metier;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PreRemove;


@Entity

public class Adresse {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)// cest 2 @ s'adressent seulent a la ligne d'apres qui es idAdresse
 private int idAdresse ;
 private String numrue;
 private  String nomrue;
 private String cp;
 private String ville;

 @OneToMany (mappedBy="adresse")//adresse cest objet//fetch=FetchType.LAZY
 private List <Personne>personnes=new ArrayList<Personne>();

public int getIdAdresse() {
	return idAdresse;
}

public void setIdAdresse(int idAdresse) {
	this.idAdresse = idAdresse;
}

public String getNumrue() {
	return numrue;
}

public void setNumrue(String numrue) {
	this.numrue = numrue;
}

public String getNomrue() {
	return nomrue;
}

public void setNomrue(String nomrue) {
	this.nomrue = nomrue;
}

public String getCp() {
	return cp;
}

public void setCp(String cp) {
	this.cp = cp;
}

public String getVille() {
	return ville;
}

public void setVille(String ville) {
	this.ville = ville;
}

public List<Personne> getPersonnes() {
	return personnes;
}

public void setPersonnes(List<Personne> personnes) {
	this.personnes = personnes;
}

@Override
public String toString() {
	return "Adresse [idAdresse=" + idAdresse + ", numrue=" + numrue + ", nomrue=" + nomrue + ", cp=" + cp + ", ville="
			+ ville + "]";
}

@PreRemove
public void deleteSetNull() {
	for(Personne p : personnes)
	{
		p.setAdresse(null);// achaque fois je veux supprimer ladre je prends les personnes qui habitent a cette adresse et j'enleve l'id de ladrs//la personne va rester mais son id va etre null
	
}
}


 
}
