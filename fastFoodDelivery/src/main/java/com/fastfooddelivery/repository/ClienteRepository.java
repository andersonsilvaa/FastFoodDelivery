package com.fastfooddelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fastfooddelivery.domain.Cliente;

/**
 * Spring Data JPA repository for the User entity.
 */
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

   
}
