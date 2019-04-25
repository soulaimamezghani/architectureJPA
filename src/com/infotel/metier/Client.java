package com.infotel.metier;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CLI")
public class Client extends Personne { // 2 maniere je commante les 
	private int numeroAdherent;

	public int getNumeroAdherent() {
		return numeroAdherent;
	}

	public void setNumeroAdherent(int numeroAdherent) {
		this.numeroAdherent = numeroAdherent;
	}

	@Override
	public String toString() {
		return "Client [numeroAdherent=" + numeroAdherent + ", toString()=" + super.toString() + "]";
	}

	
	

}
