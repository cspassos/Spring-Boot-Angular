package br.com.cspassos.algamoney.api.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.com.cspassos.algamoney.api.model.Pessoa;
import br.com.cspassos.algamoney.api.repository.PessoaRepository;

@Service // -->> Essa classe vai ser um componente do spring
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Pessoa atualizar(Long codigo, Pessoa pessoa){
		Pessoa pessoaSalva = buscarPessoaPeloCodigo(codigo);
			//"codigo" -> é o parametro que eu nao quero que copie
		BeanUtils.copyProperties(pessoa, pessoaSalva, "codigo");
		return pessoaRepository.save(pessoaSalva);
	}

	public void atualizarPropriedadeAtivo(Long codigo, Boolean ativo){
		Pessoa pessoaSalva = buscarPessoaPeloCodigo(codigo);
		pessoaSalva.setAtivo(ativo);
		pessoaRepository.save(pessoaSalva);
	}

	public Pessoa buscarPessoaPeloCodigo(Long codigo) {
		Pessoa pessoaSalva = pessoaRepository.findOne(codigo);
		if(pessoaSalva == null){
			//EmptyResultDataAccessException é uma exeção que é lançada quando o resultado é esperado pelo menos um elemento
			//O 1 é que ele deve ter pelo menos um objeto
			throw new EmptyResultDataAccessException(1);
		}
		return pessoaSalva;
	}
	
}
