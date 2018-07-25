package com.thespringside.gestioneutenti.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.thespringside.gestioneutenti.domain.Utente;

public interface UtenteRepository extends CrudRepository<Utente, Long> {
	
	List<Utente> findByUsername(String username);
	
	List<Utente> findByEmail(String email);

}
