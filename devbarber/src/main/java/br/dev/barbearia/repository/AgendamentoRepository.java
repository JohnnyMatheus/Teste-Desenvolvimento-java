package br.dev.barbearia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.barbearia.model.Agendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Integer> {
}
