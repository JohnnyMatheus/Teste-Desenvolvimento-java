package br.dev.barbearia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.barbearia.model.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
