	package com.infotel.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.infotel.metier.Adresse;
import com.infotel.metier.Connexion;
import com.infotel.metier.Personne;

public class DaoImpl implements Idao {
	//unité de persistance
	EntityManagerFactory emf;
	//porteur de requéte
	EntityManager em;

	@Override
	public int ajouterPersonne(Personne p) {
		// ouverture unité de persistence 
		emf =Persistence.createEntityManagerFactory("demojpa-pu");// 3classes de jpa pour faciliter le travail
		em = emf.createEntityManager();//nom de l'unite dde persistence =demojpa-pu
		EntityTransaction tx =em.getTransaction(); //se ddeclare a linterieur de methode
		
		try {
			//1-débuter la transaction
			tx.begin();//je commence l'opertaion
			//2-Effectuer les requetes 
			em.persist(p);//em car responsable de faire les requetees
			//3- Valider la transaction
			tx.commit();//comme ci je ferme la voie d'autoroute car les ra requette est bien passée
			//4-fermer l'unité de persistence
			em.close();// on l'a fait aussi car c plus propre
			emf.close();
		} catch (Exception e) {
		tx.rollback();// si tx.commit marche echoue 
		}
		return p.getId();
	}

	@Override
	public Personne getPersonne(int idPersonne) {
		// ouverture unité de persistence 
		emf =Persistence.createEntityManagerFactory("demojpa-pu");// 3classes de jpa pour faciliter le travail
		em = emf.createEntityManager();//nom de l'unite dde persistence =demojpa-pu
	    Personne p = new Personne();
	    try {
	    	//effectuer la requette
			p=em.getReference(Personne.class, idPersonne);//Personne.class cest pour caster pour dire dans quel tableau on cherche l'Id
			//fermer l'unité de persistence
			em.close();
			emf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	return p;
	}
	
	
	@Override
	public int supprimerPersonne(Personne p) {
		// ouverture unité de persistence 
	    emf =Persistence.createEntityManagerFactory("demojpa-pu");// 3classes de jpa pour faciliter le travail
		em = emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();

		try {
			//1-débuter la transaction
			tx.begin();//je commence l'opertaion
			//2-Effectuer les requetes 
			em.remove(p);//em car responsable de faire les requetees
			//3- Valider la transaction
			tx.commit();//comme ci je ferme la voie d'autoroute car les ra requette est bien passée
			//4-fermer l'unité de persistence
			em.close();// on l'a fait aussi car c plus propre
			emf.close();
		} catch (Exception e) {
		tx.rollback();// si tx.commit marche echoue 
		}
		return p.getId();
	}

	@Override
	public int modifierPersonne(Personne p) {
		// ouverture unité de persistence 
	    emf =Persistence.createEntityManagerFactory("demojpa-pu");// 3classes de jpa pour faciliter le travail
		em = emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		try {
			//1-débuter la transaction
			tx.begin();//je commence l'opertaion
			//2-Effectuer les requetes 
			em.merge(p);//em car responsable de faire les requetees
			//3- Valider la transaction
			tx.commit();//comme ci je ferme la voie d'autoroute car les ra requette est bien passée
			//4-fermer l'unité de persistence
			em.close();// on l'a fait aussi car c plus propre
			emf.close();
		} catch (Exception e) {
		tx.rollback();// si tx.commit marche echoue 
		}
		return p.getId();
	}



	@Override
	public Personne affichagePersonne(int idPersonne) {
		// ouverture unité de persistence 
	    emf =Persistence.createEntityManagerFactory("demojpa-pu");// 3classes de jpa pour faciliter le travail
		em = emf.createEntityManager();
		Personne p=new Personne();
		try {
			
			p=em.find(Personne.class, idPersonne);//Personne.class cest pour caster pour dire dans quel tableau on cherche l'Id
			em.close();
			emf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	return p;
	}

	@Override
	public List<Personne> findAllPersonnes() {//j'ai pas besoin de transaction
		// ouverture unité de persistence 
		emf =Persistence.createEntityManagerFactory("demojpa-pu");// 3classes de jpa pour faciliter le travail
		em = emf.createEntityManager();//nom de l'unite dde persistence =demojpa-pu
		Query q=null; //q de type query sachant que query est requette //q est un resultset //query remplace le boucle
	   List<Personne> l=new ArrayList<Personne>();
		
		try {
			q=em.createQuery("Select p From Personne p");//je madresse a la classe Personne
			l=q.getResultList();
			em.close();
			emf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	return l;//est de type list personne
	}

	@Override
	public List<Personne> rechercherParMc(String mc) {// mc parameter
		// ouverture unité de persistence 
				emf =Persistence.createEntityManagerFactory("demojpa-pu");// 3classes de jpa pour faciliter le travail
				em = emf.createEntityManager();//nom de l'unite dde persistence =demojpa-pu
				Query q=null; //q de type query sachant que query est requette //q est un resultset //query remplace le boucle
			   List<Personne> l=new ArrayList<Personne>();
				
				try {
					q=em.createQuery("Select p From Personne p where nom like :lenom ");//lenom comme ?
					q.setParameter("lenom","%"+mc);//qlq chose contient toto (si on enleve % a gauche le nom commence par toto
					
					l=q.getResultList();
					em.close();
					emf.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			
			return l;//est de type list personne
			}

	@Override
	public int ajouterAdresse(Adresse a) {
	// ouverture unité de persistence 
	  emf =Persistence.createEntityManagerFactory("demojpa-pu");// 3classes de jpa pour faciliter le travail
      em = emf.createEntityManager();//nom de l'unite dde persistence =demojpa-pu
	  EntityTransaction tx =em.getTransaction(); //se ddeclare a linterieur de methode
				try {
			//1-débuter la transaction
				tx.begin();
			//2-Effectuer les requetes 
			    em.persist(a);//em car responsable de faire les requetees
			//3- Valider la transaction
				tx.commit();
			//4-fermer l'unité de persistence
				em.close();// on l'a fait aussi car c plus propre
				emf.close();
				} catch (Exception e) {
				tx.rollback();// si tx.commit marche echoue 
				}
				return a.getIdAdresse();
			}

	@Override
	public Adresse getAdresse(int idAdresse) {
		// ouverture unité de persistence 
		emf =Persistence.createEntityManagerFactory("demojpa-pu");// 3classes de jpa pour faciliter le travail
		em = emf.createEntityManager();//nom de l'unite dde persistence =demojpa-pu
	    Adresse a = new Adresse();
	    try {
			a=em.getReference(Adresse.class, idAdresse);//Personne.class cest pour caster pour dire dans quel tableau on cherche l'Id
			em.close();
			emf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	return a;
	}

	@Override
	public Adresse affichageAdresse(int idAdresse) {
		// ouverture unité de persistence 
	    emf =Persistence.createEntityManagerFactory("demojpa-pu");
		em = emf.createEntityManager();
		Adresse a =new Adresse ();
		try {
			a=em.find(Adresse.class, idAdresse);
			em.close();
			emf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	return a;
	}

	@Override
	public int supprimerAdresse(Adresse a) {
		// ouverture unité de persistence 
	    emf =Persistence.createEntityManagerFactory("demojpa-pu");// 3classes de jpa pour faciliter le travail
		em = emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		try {
			//1-débuter la transaction
			tx.begin();//je commence l'opertaion
			//2-Effectuer les requetes 
			em.remove(a);//em car responsable de faire les requetees
			//3- Valider la transaction
			tx.commit();//comme ci je ferme la voie d'autoroute car les ra requette est bien passée
			//4-fermer l'unité de persistence
			em.close();// on l'a fait aussi car c plus propre
			emf.close();
		} catch (Exception e) {
		tx.rollback();// si tx.commit marche echoue 
		}
		return a.getIdAdresse();
	}

	@Override
	public int modifierAdresse(Adresse a) {
		// ouverture unité de persistence 
	    emf =Persistence.createEntityManagerFactory("demojpa-pu");// 3classes de jpa pour faciliter le travail
		em = emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		try {
			//1-débuter la transaction
			tx.begin();//je commence l'opertaion
			//2-Effectuer les requetes 
			em.merge(a);//em car responsable de faire les requetees
			//3- Valider la transaction
			tx.commit();//comme ci je ferme la voie d'autoroute car les ra requette est bien passée
			//4-fermer l'unité de persistence
			em.close();// on l'a fait aussi car c plus propre
			emf.close();
		} catch (Exception e) {
		tx.rollback();// si tx.commit marche echoue 
		}
		return a.getIdAdresse();
	}

	@Override
	public List<Adresse> findAllAdresses() {
	// ouverture unité de persistence 
	    emf =Persistence.createEntityManagerFactory("demojpa-pu");
	    em = emf.createEntityManager();//nom de l'unite dde persistence =demojpa-pu
		Query q=null; //q de type query sachant que query est requette //q est un resultset //query remplace le boucle
	       List<Adresse> l=new ArrayList<Adresse>();
				
				try {
					q=em.createQuery("Select a From Adresse a");//je madresse a la classe Personne
					l=q.getResultList();
					em.close();
					emf.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			
			return l;
			}
	
	
	@Override
	public List<Adresse> rechercherParMca(String mc) {
		// ouverture unité de persistence 
		emf =Persistence.createEntityManagerFactory("demojpa-pu");
		em = emf.createEntityManager();
		Query q=null; 
	   List<Adresse> l=new ArrayList<Adresse>();
		
		try {
			q=em.createQuery("Select a From Adresse a where nomRue like :lenomru ");//lenom comme ?
			q.setParameter("lenomru", "%"+mc+"%");//qlq chose contient toto (si on enleve % a gauche le nom commence par toto
			
			l=q.getResultList();
			em.close();
			emf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	return l;//est de type list personne
	}

	@Override
	public int ajouterConnexion(Connexion c) {
	// ouverture unité de persistence 
		emf =Persistence.createEntityManagerFactory("demojpa-pu");
		em = emf.createEntityManager();//nom de l'unite dde persistence =demojpa-pu
		EntityTransaction tx =em.getTransaction(); //se ddeclare a linterieur de methode
				try {
					//1-débuter la transaction
					tx.begin();//je commence l'opertaion
					//2-Effectuer les requetes 
					em.persist(c);//em car responsable de faire les requetees
					//3- Valider la transaction
					tx.commit();//comme ci je ferme la voie d'autoroute car les ra requette est bien passée
					//4-fermer l'unité de persistence
					em.close();// on l'a fait aussi car c plus propre
					emf.close();
				} catch (Exception e) {
				tx.rollback();// si tx.commit marche echoue 
				}
				return c.getIdConnexion();
			}

	@Override
	public Connexion getConnexion(int idConnexion) {
		// ouverture unité de persistence 
		emf =Persistence.createEntityManagerFactory("demojpa-pu");
		em = emf.createEntityManager();
	   Connexion c = new Connexion();
	    try {
			c=em.getReference(Connexion.class, idConnexion);
			em.close();
			emf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	return c;
	}

	@Override
	public Connexion affichageConnexion(int idConnexion) {
		// ouverture unité de persistence 
	    emf =Persistence.createEntityManagerFactory("demojpa-pu");
		em = emf.createEntityManager();
	     Connexion c =new Connexion ();
		try {
			c=em.find(Connexion.class, idConnexion);
			em.close();
			emf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	return c;
	}


	@Override
	public int supprimerConnexion(Connexion c) {
		// ouverture unité de persistence 
	    emf =Persistence.createEntityManagerFactory("demojpa-pu");
		em = emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		try {
			//1-débuter la transaction
			tx.begin();//je commence l'opertaion
			//2-Effectuer les requetes 
			em.remove(c);//em car responsable de faire les requetees
			//3- Valider la transaction
			tx.commit();//comme ci je ferme la voie d'autoroute car les ra requette est bien passée
			//4-fermer l'unité de persistence
			em.close();// on l'a fait aussi car c plus propre
			emf.close();
		} catch (Exception e) {
		tx.rollback();// si tx.commit marche echoue 
		}
		return c.getIdConnexion();
	}


	@Override
	public int modifierConnexion(Connexion c) {
		// ouverture unité de persistence 
	    emf =Persistence.createEntityManagerFactory("demojpa-pu");
		em = emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		try {
			//1-débuter la transaction
			tx.begin();//je commence l'opertaion
			//2-Effectuer les requetes 
			em.merge(c);//em car responsable de faire les requetees
			//3- Valider la transaction
			tx.commit();//comme ci je ferme la voie d'autoroute car les ra requette est bien passée
			//4-fermer l'unité de persistence
			em.close();// on l'a fait aussi car c plus propre
			emf.close();
		} catch (Exception e) {
		tx.rollback();// si tx.commit marche echoue 
		}
		return c.getIdConnexion();
	}

	@Override
	public List<Connexion> findAllConnexion() {
		// ouverture unité de persistence 
	    emf =Persistence.createEntityManagerFactory("demojpa-pu");
	    em = emf.createEntityManager();
		Query q=null; 
	       List<Connexion> l=new ArrayList<Connexion>();
				
				try {
					q=em.createQuery("Select a From Connexion a");//je madresse a la classe Personne
					l=q.getResultList();
					em.close();
					emf.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			
			return l;
			}

	@Override
	public List<Connexion> rechercherParMcc(String mc) {
		// ouverture unité de persistence 
		emf =Persistence.createEntityManagerFactory("demojpa-pu");
		em = emf.createEntityManager();
		Query q=null; 
	   List<Connexion> l=new ArrayList<Connexion>();
		
		try {
			q=em.createQuery("Select c From Connexion c where login like :lelogin ");
			q.setParameter("lelogin", "%"+mc+"%");
			
			l=q.getResultList();
			em.close();
			emf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	return l;
	}

	@Override
	public List<Personne> findAllpersonnesConnexion() {
		// ouverture unité de persistence 
		emf = Persistence.createEntityManagerFactory("demojpa-pu");// 3classes de jpa pour faciliter le travail
		em = emf.createEntityManager();// nom de l'unite dde persistence =demojpa-pu
		Query q = null; // q de type query sachant que query est requette //q est un resultset //query
						// remplace le boucle
		List<Personne> l = new ArrayList<Personne>();

		try {
			q = em.createQuery("Select p From Personne p join p.connexion");// je madresse a la classe Personne
			l = q.getResultList();
			em.close();
			emf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return l;

	}

	@Override
	public List<Personne> findAllpersonnesAdresse() {
		// ouverture unité de persistence 
				emf = Persistence.createEntityManagerFactory("demojpa-pu");// 3classes de jpa pour faciliter le travail
				em = emf.createEntityManager();// nom de l'unite dde persistence =demojpa-pu
				Query q = null; // q de type query sachant que query est requette //q est un resultset //query
								// remplace le boucle
				List<Personne> l = new ArrayList<Personne>();

				try {
					q = em.createQuery("Select p From Personne p "+ "full join p.adresse");// je madresse a la classe Personne
					l = q.getResultList();
					em.close();
					emf.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				return l;
	}

}