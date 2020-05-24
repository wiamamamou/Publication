package org.sid.dao;

import org.sid.entities.Association;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface AssociationRepository extends JpaRepository<Association, Long>{

}
