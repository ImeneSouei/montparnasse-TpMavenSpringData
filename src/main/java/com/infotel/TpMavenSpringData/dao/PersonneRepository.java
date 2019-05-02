package com.infotel.TpMavenSpringData.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.TpMavenSpringData.metier.Personne;

@Transactional

public interface PersonneRepository extends JpaRepository <Personne, Integer>{
	
	public List<Personne> findByPrenom(String x);// ajouter une méthode qui n'existe pas
	
	@Query ("select p from Personne p where p.nom like :x")
	public List<Personne> rechercherParMC(@Param("x")String nom); // requete nommée
	
	@Modifying
	@Query("update Personne SET nom = :x where id = :y")
	public int modifierNomPersonne(@Param("x") String nom, @Param("y") int id);
	
	
	@Modifying
	@Query("update Personne SET adresse.idAdresse = :x where id = :y")
	
	public int modifierPersonneAdresse(@Param("x") int idAdresse, @Param("y") int id);
	

}


