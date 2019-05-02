package com.infotel.TpMavenSpringData.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.TpMavenSpringData.metier.Adresse;


@Transactional

public interface AdresseRepository extends JpaRepository <Adresse, Integer>{

	@Query ("select a from Adresse a where a.ville like :x")
	public List<Adresse> rechercherParMCAdresse(@Param("x")String ville);

}
