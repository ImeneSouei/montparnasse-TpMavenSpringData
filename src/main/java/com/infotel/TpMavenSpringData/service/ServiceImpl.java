package com.infotel.TpMavenSpringData.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotel.TpMavenSpringData.dao.AdresseRepository;
import com.infotel.TpMavenSpringData.dao.PersonneRepository;
import com.infotel.TpMavenSpringData.metier.Adresse;
import com.infotel.TpMavenSpringData.metier.Personne;
@Service
public class ServiceImpl implements Iservice {
	@Autowired
	PersonneRepository personneRepository;
	
	@Autowired
	AdresseRepository adresseRepository;
	

	public PersonneRepository getPersonneRepository() {
		return personneRepository;
	}



	public void setPersonneRepository(PersonneRepository personneRepository) {
		this.personneRepository = personneRepository;
	}



	@Override
	public Personne ajouterPersonne(Personne p) {
		// TODO Auto-generated method stub
		return personneRepository.save(p);
	}

	

	@Override
	public void supprimerPersonne(Personne p) {
		// TODO Auto-generated method stub
		 personneRepository.delete(p);
	}

	@Override
	public Personne modifierPersonne(Personne p) {
		// TODO Auto-generated method stub
		return personneRepository.save(p);
	}

	@Override
	public Iterable<Personne> findAllPersonne() {
		// TODO Auto-generated method stub
		return personneRepository.findAll();
	}

	@Override
	public Optional<Personne> getPersonne(int id) {
		// TODO Auto-generated method stub
		return personneRepository.findById(id); // "getone" aussi marche au lieu de findbyid
	}
	
	@Override
	public List<Personne> chercherParPrenom(String prenom) {
		// TODO Auto-generated method stub
		return personneRepository.findByPrenom(prenom);
	}
	
	@Override
	public List<Personne> rechercherParMC(String nom) {
		// TODO Auto-generated method stub
		return personneRepository.rechercherParMC("%" +nom+ "%");
	}
	@Override
	public int modifierNomPersonne(String nom, int id) {
		// TODO Auto-generated method stub
		
		personneRepository.modifierNomPersonne(nom, id);
		return id;
		
	}
	@Override
	public int modifierPersonneAdresse(int idAdresse, int id) {
		// TODO Auto-generated method stub
		personneRepository.modifierPersonneAdresse(idAdresse, id);
		return id;
	}




	

	@Override
	public Adresse ajouterAdresse(Adresse a) {
		// TODO Auto-generated method stub
		return adresseRepository.save(a);
	}

	@Override
	public Optional<Adresse> getAdresse(int id) {
		// TODO Auto-generated method stub
		return adresseRepository.findById(id);
	}

	

	@Override
	public void supprimerAdresse(Adresse a) {
		// TODO Auto-generated method stub
		 adresseRepository.delete(a);
	}

	@Override
	public Adresse modifierAdresse(Adresse a) {
		// TODO Auto-generated method stub
		return adresseRepository.save(a);
	}

	@Override
	public Iterable<Adresse> findAllAdresse() {
		// TODO Auto-generated method stub
		return adresseRepository.findAll();
	}

	@Override
	public List<Adresse> rechercherParMCAdresse(String ville) {
		// TODO Auto-generated method stub
		return adresseRepository.rechercherParMCAdresse("%" +ville+ "%");
	}



	



	



	


	
}
