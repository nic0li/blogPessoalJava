package org.generation.blogPessoal.repository;

import java.util.List;

import org.generation.blogPessoal.model.Publicacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicacaoRepository extends JpaRepository<Publicacao, Long> {
	
	public List<Publicacao> findAllByTituloContainingIgnoreCase (String titulo);
	
}
