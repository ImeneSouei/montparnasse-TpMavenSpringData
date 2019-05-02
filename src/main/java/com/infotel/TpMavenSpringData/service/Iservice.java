package com.infotel.TpMavenSpringData.service;

import java.util.List;
import java.util.Optional;

import com.infotel.TpMavenSpringData.metier.Adresse;
import com.infotel.TpMavenSpringData.metier.Personne;

public interface Iservice {
	
	public Personne ajouterPersonne(Personne p);
	public Optional<Personne> getPersonne(int idPersonne);
	
	public void supprimerPersonne(Personne p);
    public Personne modifierPersonne(Personne p);
    public Iterable<Personne> findAllPersonne();
    public List<Personne> chercherParPrenom(String prenom);
    public List<Personne> rechercherParMC(String nom);
    public int modifierNomPersonne(String nom, int id);
    public int modifierPersonneAdresse(int idAdresse, int id);
    
    
    public Adresse ajouterAdresse(Adresse a);
   	public Optional<Adresse> getAdresse(int idAdresse);
   	
   	public void supprimerAdresse(Adresse a);
    public Adresse modifierAdresse(Adresse a);
    public Iterable<Adresse> findAllAdresse();
   
    public List<Adresse> rechercherParMCAdresse(String ville);
    

}
