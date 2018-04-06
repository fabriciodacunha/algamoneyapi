package com.algamoney.algamoneyapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algamoney.algamoneyapi.model.Lancamento;
import com.algamoney.algamoneyapi.model.Pessoa;
import com.algamoney.algamoneyapi.repository.LancamentoRepository;
import com.algamoney.algamoneyapi.repository.PessoaRepository;
import com.algamoney.algamoneyapi.service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {
	
	@Autowired
	private PessoaRepository pessoaRepository ;
	
	@Autowired
	private LancamentoRepository lancamentoRepository ;

	public Lancamento salvar(Lancamento lancamento) {
		Pessoa pessoa = pessoaRepository.findOne(lancamento.getPessoa().getCodigo());
		
		if(pessoa == null || pessoa.isInativo()) {
			throw new PessoaInexistenteOuInativaException();
		}
			
		return lancamentoRepository.save(lancamento);
	}

}