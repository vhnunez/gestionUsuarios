package com.thespringside.gestioneutenti.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.thespringside.gestioneutenti.domain.Utente;
import com.thespringside.gestioneutenti.service.RegistrazioneService;

@ManagedBean
@ViewScoped
public class ListaUtentiController {
	
	private static final Logger log = LoggerFactory.getLogger(ListaUtentiController.class);
	
	private List<Utente> listaUtenti;
	
	@ManagedProperty(value = "#{registrazioneService}")
    private RegistrazioneService registrazioneService;  
	
	
	public List<Utente> getListaUtenti() {
        if (this.listaUtenti == null) {
            this.listaUtenti = registrazioneService.listaUtenti();
        }
        return listaUtenti;
    }

	public RegistrazioneService getRegistrazioneService() {
		return registrazioneService;
	}

	public void setRegistrazioneService(RegistrazioneService registrazioneService) {
		this.registrazioneService = registrazioneService;
	}
	
	
	
	

}
