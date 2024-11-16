package br.dev.barbearia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.barbearia.model.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Integer> {
}
