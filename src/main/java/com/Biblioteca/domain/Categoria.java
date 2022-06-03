package com.Biblioteca.domain;

import java.util.*;

public class Categoria {
	private int id;
	private String nome,
	               descricao;
	private List<Livro> livros = new ArrayList<>();
}
