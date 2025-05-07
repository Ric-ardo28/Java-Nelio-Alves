package org.senaiapi.senaiapi.service;

import org.senaiapi.senaiapi.model.Produto;
import org.senaiapi.senaiapi.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

	private ProdutoRepository produtoRepository;

	public ProdutoService(ProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}

	public List<Produto> findAll() {
		return produtoRepository.findAll();
	}
	public Produto findById(Long id) {
		return produtoRepository.findById(id).get();
	}
	public Produto deletar(Long id) {
		produtoRepository.deleteById(id);
		return null;
	}

	public Produto save(Produto produto) {
		return produtoRepository.save(produto);
	}
}
