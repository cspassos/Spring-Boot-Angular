package br.com.cspassos.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cspassos.algamoney.api.model.Categoria;
											//Precisa falar o nome da entidade e o tipo da chave primaria
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
//JpaRepository -> Abrange varios metodos de consulta, deletar, atualizar... 
	
}
