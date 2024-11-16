package br.dev.barbearia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.barbearia.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
}
