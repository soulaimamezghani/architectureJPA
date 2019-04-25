package com.infotel.presentation;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.infotel.metier.Adresse;
import com.infotel.metier.Client;
import com.infotel.metier.Connexion;
import com.infotel.metier.Employee;
import com.infotel.metier.Personne;
import com.infotel.service.Iservice;
import com.infotel.service.ServiceImpl;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //EntityManagerFactory emf =Persistence.createEntityManagerFactory("demojpa-pu");// ser a creer les tables 
	Iservice service=new ServiceImpl();
	
//    Personne p= new Personne();
//	p.setNom("ZEC");
//	p.setPrenom("UNION");
//	p.setAge(20); 
//	Personne t = new Personne();
//   t.setNom("Bouchaala");
//   t.setPrenom("Amel");
//	t.setAge(63);
//  service.ajouterPersonne(t);
////	
////////	service.getPersonne(9);
////////	service.supprimerPersonne(service.getPersonne(9));
//////	
//////	
//////	service.affichagePersonne(2);
//////	Personne h = service.affichagePersonne(4);
//////	h.setNom("louati");
//////	h.setPrenom("Sirine");
//////	h.setAge(30);
//////	service.modifierPersonne(h);
//////	
//////	
//////	Employee e = new Employee();
//////	e.setAge(25);
//////	e.setPrenom("toto");
//////	e.setNom("tata");
//////	e.setSalaire(2000);
//////	
//////	
//////	Employee x =new Employee();
//////	x.setNom("Dridi");
//////	x.setPrenom("Ahmed");
//////	x.setAge(37);
//////	x.setSalaire(5500);
////////	service.ajouterPersonne(x);
//////	
////////	service.getPersonne(7);
////////	service.supprimerPersonne(service.getPersonne(7));
//////	service.affichagePersonne(6);
//////	Personne g =service.affichagePersonne(6);
//////	g.setNom("mliki");
//////	g.setPrenom("taher");
//////	g.setAge(70);
//////	service.modifierPersonne(g);
//////	
//////	Client c = new Client();
//////	c.setAge(28);
//////	c.setPrenom("coco");
//////	c.setNom("JJJ");
//////	c.setNumeroAdherent(13);
//////	
//////	Client nn = new Client();
//////	nn.setAge(28);
//////	nn.setPrenom("soulaima");
//////	nn.setNom("kilop");
//////	nn.setNumeroAdherent(19);
//////	
//////	Client n = new Client();
//////	n.setAge(28);
//////	n.setPrenom("coco");
//////	n.setNom("JJJ");
//////	n.setNumeroAdherent(15);
//////	
//////	service.findAllPersonnes();
//////	System.out.println(service.findAllPersonnes());
//////	service.rechercherParMc("ik");
//////	System.out.println(service.rechercherParMc("i"));
////////	service.ajouterPersonne(nn);
////////	service.ajouterPersonne(n);
//////
////////	service.ajouterPersonne(c); 
////////	service.ajouterPersonne(e);
//////////	service.ajouterPersonne(p);
////////	service.getPersonne(1);
////////	System.out.println(service.getPersonne(1));
//////	
//////	
////////	service.supprimerPersonne(service.getPersonne(1));// pour supprimer la personne il faut d,abord faire getPersonne
////////	}}
////////	
////////	Personne p3=service.affichagePersonne(2); 
////////	p3.setNom("Triki");
////////	p3.setPrenom("Soulaima");
////////	p3.setAge(29);
////////	service.modifierPersonne(p3);
////////	System.out.println(service.modifierPersonne(p3));
//////
//////// System.out.println(service.findAllPersonnes());
////// 
//////	Adresse a= new Adresse();
//////	a.setNumrue("98");
//////	a.setNomrue("Avenue des Genottes");
//////	a.setCp("95800");
//////	a.setVille("Paris");
////////	service.ajouterAdresse(a);
//////	
//////	Adresse b= new Adresse();
//////	b.setNumrue("99");
//////	b.setNomrue("pierre de rail");
//////	b.setCp("92000");
//////	b.setVille("Paris");
////////	service.ajouterAdresse(b);
//////	
//////	Adresse f= new Adresse();
//////	f.setNumrue("55");
//////	f.setNomrue("palier de giki");
//////	f.setCp("84009");
//////	f.setVille("Islande");
////////	service.ajouterAdresse(f);
////////	service.getAdresse(7);
////////	service.supprimerAdresse(service.getAdresse(7));
////////	service.affichageAdresse(5);
////////	Adresse a1= service.affichageAdresse(5);
////////	a1.setCp("97899");
////////	a1.setNomrue("mahrouch");
////////	a1.setNumrue("76");
////////	service.modifierAdresse(a1);
////////	System.out.println(service.modifierAdresse(a1));
//////////	service.findAllAdresses();
////////	 System.out.println(service.findAllPersonnes());
//////// System.out.println(service.findAllAdresses());
////////   System.out.println(service.rechercherParMca("mahrouch"));
////////	Connexion v = new Connexion();
////////	v.setLogin("sousou");
////////	v.setMdp("touta");
////////	service.ajouterConnexion(v);
////////	System.out.println(service.ajouterConnexion(v));
////////	
////////	Connexion v1 = new Connexion();
////////	v1.setLogin("ziz");
////////	v1.setMdp("kout");
////////	service.ajouterConnexion(v1);
////////	System.out.println(service.ajouterConnexion(v1));
////////	
////////	Connexion v2 = new Connexion();
////////	v2.setLogin("yalili");
////////	v2.setMdp("nasina");
////////	service.ajouterConnexion(v2);
////////	System.out.println(	service.ajouterConnexion(v2));
////////	
////////	Connexion v3 = new Connexion();
////////	v3.setLogin("YUOIHY");
////////	v3.setMdp("LOUKA");
////////	service.ajouterConnexion(v3);
////////	System.out.println(	service.ajouterConnexion(v3));
////////	service.getConnexion(8);
////////	service.supprimerConnexion(service.getConnexion(8));
////////	service.affichageConnexion(3);
////////	Connexion w=service.affichageConnexion(3);
////////	w.setLogin("habibi");
////////	w.setMdp("mhayara");
////////	service.modifierConnexion(w);
////// //service.findAllConnexion();
//////// System.out.println( service.findAllConnexion());
////////	System.out.println(service.rechercherParMc("o"));
//////	
//////	
//////	Personne p=new Personne();
//////	Adresse a=new Adresse();//je vais ajouter adresse a persoone
//////	a.setCp("75000");
//////	a.setNomrue("rue des hht");
//////	a.setNumrue("15");
//////	a.setVille("Paris");
//////
//////	
//////	p.setNom("MEZ");
//////	p.setPrenom("chouchou");
//////	p.setAge(25);
//////	p.setAdresse(a);//j'ai 2 objets transients vont s'ajouter a BDD
//////	
////////	Personne k =service.affichagePersonne(8);
////////	k.setAdresse(service.getAdresse(11));
////////	service.modifierPersonne(k);
//////   
//////	Personne u =service.affichagePersonne(10);
//////	u.setAdresse(service.getAdresse(20));
////////	service.modifierPersonne(u);
//////	
//////	Personne c=service.affichagePersonne(4);
//////	c.setAdresse(service.getAdresse(18));
////////	service.modifierPersonne(c);
////	
////	Personne m=new Personne();
////	Adresse n=new Adresse();//je vais ajouter adresse a persoone
////	n.setCp("99998");
////	n.setNomrue("rue des brioches");
////	n.setNumrue("19");
////	n.setVille("Paris");
////
////
////	
////	m.setNom("MEZGH");
////	m.setPrenom("jihen");
////	m.setAge(67);
////	m.setAdresse(n);
////	service.ajouterPersonne(m);
//   
////	service.ajouterPersonne(p);//il va ajouter personne et adresse à BDD
////	service.supprimerAdresse(service.getAdresse(96));
//	// appel ala methode
////	for(Personne pers: service.findAllpersonnesConnexion()) {// pour affichage pers avec cx 
////		System.out.println(pers +" "+ pers.getConnexion());
//// 	

////	service.supprimerAdresse(service.getAdresse(20));
//		for(Personne pers1: service.findAllpersonnesAdresse()) {// pour affichage pers avec adresse 
//			System.out.println(pers1 +" "+ pers1.getAdresse());
//		
		}
}