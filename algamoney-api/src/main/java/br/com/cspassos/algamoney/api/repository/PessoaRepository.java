package br.com.cspassos.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cspassos.algamoney.api.model.Pessoa;
import br.com.cspassos.algamoney.api.repository.pessoa.PessoaRepositoryQuery;

											//Precisa falar o nome da entidade e o tipo da chave primaria
public interface PessoaRepository extends JpaRepository<Pessoa, Long>, PessoaRepositoryQuery{
	
}

