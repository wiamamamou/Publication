package org.sid.dao;

import java.util.List;

import org.sid.entities.Publication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PublicationRepository extends JpaRepository<Publication, Long>{
	
	@Query("select p from Publication p")
	public List<Publication> getAll();

}