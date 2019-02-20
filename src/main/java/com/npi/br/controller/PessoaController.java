package com.npi.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.npi.br.model.Pessoa;
import com.npi.br.service.PessoaService;

@RestController
@RequestMapping("/contatos/")
public class PessoaController {
	
	@Autowired
    private PessoaService pessoaService;
	
	@GetMapping("/listar")
    public List<Pessoa> findAll(){
        return pessoaService.listarContatos();
    }
	
	 @GetMapping("/buscar/{id}")
	 public Pessoa get(@PathVariable(value = "id") long id){
	    return pessoaService.buscarContato(id);
	 }
     
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pessoa create(@RequestBody Pessoa pessoa){
        pessoaService.salvarContato(pessoa);
        return pessoa;
    }
 
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("excluir/{id}")
    public void delete(@PathVariable(value = "id") long id){
        pessoaService.excluirContato(id);
    }
}