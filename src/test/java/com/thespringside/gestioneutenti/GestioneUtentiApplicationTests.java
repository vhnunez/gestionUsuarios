package com.thespringside.gestioneutenti;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.thespringside.gestioneutenti.GestioneUtentiApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = GestioneUtentiApplication.class)
@WebAppConfiguration
public class GestioneUtentiApplicationTests {

	@Test
	public void contextLoads() {
	}

}
