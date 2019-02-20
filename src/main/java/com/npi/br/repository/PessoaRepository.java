package com.npi.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.npi.br.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
