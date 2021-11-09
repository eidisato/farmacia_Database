package br.org.generation.famarcia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.famarcia.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List <Produto> findAllByNomeContainingIgnoreCase(String nome);
	
	public List <Produto> findByNomeAndFabricante(String nome, String fabricante);
	
	public List <Produto> findByNomeOrFabricante(String nome, String fabricante);
}