package org.senaiapi.senaiapi.controller;

import org.senaiapi.senaiapi.model.Produto;
import org.senaiapi.senaiapi.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


	@RestController
	@RequestMapping("/produtos")
	public class ProdutoController {

		private ProdutoService produtoService;

		public ProdutoController(ProdutoService produtoService) {
			this.produtoService = produtoService;
		}

		@GetMapping
		public List<Produto> findAll(){
			return produtoService.findAll();
		}

		@GetMapping("/{id}")
		public Produto findById(@PathVariable Long id){
			return produtoService.findById(id);
		}
		@DeleteMapping("/{id}")
		public Produto deletar(@PathVariable Long id){
			return produtoService.deletar(id);
		}

		@PostMapping
		public Produto salvar(@RequestBody Produto produto){
			return produtoService.save(produto);
		}
	}


