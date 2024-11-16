package br.dev.barbearia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.barbearia.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
	
}
