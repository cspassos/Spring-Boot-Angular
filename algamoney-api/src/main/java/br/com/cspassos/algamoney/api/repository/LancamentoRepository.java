package br.com.cspassos.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cspassos.algamoney.api.model.Lancamento;
import br.com.cspassos.algamoney.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery{

}
