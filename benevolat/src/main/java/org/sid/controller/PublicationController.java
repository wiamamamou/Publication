package org.sid.controller;

import java.util.Date;
import java.util.List;


import org.sid.dao.PublicationRepository;
import org.sid.entities.Publication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class PublicationController {
	
	@Autowired
	private PublicationRepository publicationRepository;

	@RequestMapping(value = "/listePublications",method = RequestMethod.GET)
	public List<Publication> listPublications()
	{
		return publicationRepository.getAll();
	}
	@GetMapping(value="/rate/{id}&{rating}")
	public void evaluer(@PathVariable(name = "id") Long id,@PathVariable(name = "rating")int rating) {
		Publication publication = publicationRepository.getOne(id);
		publication.setEvaluation(rating);
		publicationRepository.save(publication);
	}
	@PostMapping(value = "/publier")
	public Publication addPublication(@RequestBody Publication p)
	{
		 p.setDate_pub(new Date());
		 p.setEtat(false);
		 p.setEvaluation(0);
		 p.setAssociation(null);
		 return publicationRepository.save(p);
	}
}
