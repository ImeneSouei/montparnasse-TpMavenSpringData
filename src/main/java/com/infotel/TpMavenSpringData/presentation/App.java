package com.infotel.TpMavenSpringData.presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotel.TpMavenSpringData.metier.Adresse;
import com.infotel.TpMavenSpringData.metier.Personne;
import com.infotel.TpMavenSpringData.service.Iservice;
import com.infotel.TpMavenSpringData.service.ServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext (1).xml");// charger le fichier de configuratin spring
	      
	       Iservice service=context.getBean("serviceImpl", ServiceImpl.class);
	       
	       //AJOUTER PERSONNE
	       
	     /* Personne p = context.getBean("personne", Personne.class);
	       p.setNom("fgtytrez");
	       p.setPrenom("jkkgdsr");
	       p.setAge(28);
	       
	       System.out.println(p);
	       
	       service.ajouterPersonne(p);*/
	       
	      // MODIFIER PERSONNE
	      /* Personne p2 = context.getBean("personne", Personne.class);
	        p2.setId(3);
			p2.setNom("SOUEI");
			p2.setPrenom("Layla");
			p2.setAge(22);
			service.modifierPersonne(p2);*/
	       
	       //MODIFIER NOM PERSONNE
	      /* Personne p2 = context.getBean("personne", Personne.class);
	       
	      
	       service.modifierNomPersonne("haddad", 3);*/
	       
	       // MODIFIER PERSONNE ADRESSE
	       
	       Personne p2 = context.getBean("personne", Personne.class);
	       Adresse a2= context.getBean("adresse", Adresse.class);
	       
		      
	       service.modifierPersonneAdresse(1, 2);
	       
	       
	       
	       
	     
			
			// SUPPRIMER PERSONNE
	      /* Personne p2 = context.getBean("personne", Personne.class);
	       p2.setId(4);
	       service.supprimerPersonne(p2);*/
	       
	       // LISTER PERSONNE
	       
	       /*System.out.println(service.findAllPersonne());*/
	       
	       // Lister personne par prenom
	       
	       /*for (Personne p4 : service.chercherParPrenom("Imene")){
				System.out.println(p4);*/
				
			// Recherche par MC
				
				/* for (Personne p5 : service.rechercherParMC("ar")){
						System.out.println(p5);	*/
	       
	       //AJOUTER Adresse
	       
		   /* Adresse a = context.getBean("adresse", Adresse.class);
		       a.setNumRue("2587");
		       a.setNomRue("khgdy");
		      a.setCp("56452");
		      a.setVille("kghfg");
		       
		       System.out.println(a);
		       
		       service.ajouterAdresse(a);*/
	       
	       // MODIFIER Adresse
		      /* Adresse a2 = context.getBean("adresse", Adresse.class);
		        a2.setIdAdresse(3);
		        a2.setNumRue("12");
		       a2.setNomRue("Rue ALEXANDRE DUMAS");
		      a2.setCp("92100");
		      a2.setVille("VIGNEUX SUR SEINE");
				
				service.modifierAdresse(a2);*/
	       
	    // SUPPRIMER Adresse
		     /* Adresse a2 = context.getBean("adresse", Adresse.class);
		       a2.setIdAdresse(4);
		       service.supprimerAdresse(a2);*/
	       
       // LISTER Adresse
	       
	      /* System.out.println(service.findAllAdresse());*/
	       
	    // Recherche Adresse par MC ville
			
			/* for (Adresse a5 : service.rechercherParMCAdresse("EI")){
					System.out.println(a5);*/
	       
    }
}



