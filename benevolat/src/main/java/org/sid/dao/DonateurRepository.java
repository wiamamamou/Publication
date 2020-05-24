package org.sid.dao;


import org.sid.entities.Donateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DonateurRepository extends JpaRepository<Donateur, Long>{

}
