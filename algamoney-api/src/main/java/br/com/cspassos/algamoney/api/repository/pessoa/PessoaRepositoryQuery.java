package br.com.cspassos.algamoney.api.repository.pessoa;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.cspassos.algamoney.api.model.Pessoa;
import br.com.cspassos.algamoney.api.repository.filter.PessoaFilter;

public interface PessoaRepositoryQuery {
	
	Page<Pessoa> filtrar(PessoaFilter pessoaFilter, Pageable pageable);
}
