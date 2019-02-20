package com.npi.br.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npi.br.model.Pessoa;
import com.npi.br.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public void salvarContato(Pessoa pessoa) {
		pessoaRepository.save(pessoa);
	}
	
	public List<Pessoa> listarContatos(){
		return pessoaRepository.findAll();
	}
	
	public Pessoa buscarContato(Long id) {
		return pessoaRepository.getOne(id);
	}
	
	public void excluirContato(Long id) {
		pessoaRepository.deleteById(id);
	}
}
