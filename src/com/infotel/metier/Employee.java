package com.infotel.metier;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("EMP") //quand j'ajoute un employee il va marquer valeur EMP
public class Employee extends Personne {
      private double salaire;
      public double getSalaire() {
	     return salaire;
}

public void setSalaire(double salaire) {
	this.salaire = salaire;
}

@Override
public String toString() {
	return "Employee [salaire=" + salaire + ", toString()=" + super.toString() + "]";
}



}
