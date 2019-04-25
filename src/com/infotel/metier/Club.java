package com.infotel.metier;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Club {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idclub;
	private String nomclub;
	
	@ManyToMany
   private List<Personne> personnes=new ArrayList<Personne>();
	
	public int getIdclub() {
		return idclub;
	}
	public void setIdclub(int idclub) {
		this.idclub = idclub;
	}
	public String getNomclub() {
		return nomclub;
	}
	public void setNomclub(String nomclub) {
		this.nomclub = nomclub;
	}
	public List<Personne> getPersonnes() {
		return personnes;
	}
	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}
	@Override
	public String toString() {
		return "Club [idclub=" + idclub + ", nomclub=" + nomclub + ", personnes=" + personnes + "]";
	}
  
	
}