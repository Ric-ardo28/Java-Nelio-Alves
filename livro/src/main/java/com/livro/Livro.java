package com.livro;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Livro {
	private Long id;
	private String titulo;
	private String autor;
	private int ano;


}
