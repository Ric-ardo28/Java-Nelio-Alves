package com.livro;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/livro")
public class LivroController {
	List<Livro> livros = new ArrayList<Livro>();

	private Long proximoId = 1L;

	public LivroController() {
		livros.add(new Livro(proximoId++, "Dom Casmurro", "Machado de Assis", 1899));
		livros.add(new Livro(proximoId++, "O Alquimista", "Paulo Coelho", 1988));
		livros.add(new Livro(proximoId++, "Capitães da Areia", "Jorge Amado", 1937));
		livros.add(new Livro(proximoId++, "Grande Sertão: Veredas", "João Guimarães Rosa", 1956));
		livros.add(new Livro(proximoId++, "A Hora da Estrela", "Clarice Lispector", 1977));
	}

	@GetMapping
	public List<Livro> getLivros() {
		return livros;
	}

	@GetMapping("/{id}")
	public Livro getLivro(@PathVariable Long id) {
		for (Livro livro : livros) {
			if (livro.getId().equals(id)) {
				return livro;
			}
		}

		throw new RuntimeException("Livro não encontrado");
	}
	@GetMapping("/autor")
	public Livro getAutor(@RequestParam String autor) {
		for (Livro livro : livros) {
			if (livro.getAutor().equals(autor)) {
				return livro;
			}
		}
		throw new RuntimeException("Autor não encontrado");
	}

}

