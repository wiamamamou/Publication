package org.sid;
import java.util.Date;

import org.sid.dao.AssociationRepository;
import org.sid.dao.DonateurRepository;
import org.sid.dao.PublicationRepository;
import org.sid.entities.Association;
import org.sid.entities.Donateur;
import org.sid.entities.Publication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class BenevolatApplication implements CommandLineRunner{
	@Autowired
	private AssociationRepository associationRepository;
	
	@Autowired
	private DonateurRepository donateurRepository;
	
	@Autowired
	private PublicationRepository publicationRepository;

	public static void main(String[] args) {
		SpringApplication.run(BenevolatApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		Association a = associationRepository.save(new Association(null,"assoction","test","test","test","test",new Date(),"test","test","test",null,null));
		Donateur d = donateurRepository.save(new Donateur(null,"test","test","test","test","test","test",a,null));
		publicationRepository.save(new Publication(null,new Date(),"Publication1",false,"test",0,a,d));
		
*/
	
	}

}
