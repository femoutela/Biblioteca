package com.Biblioteca.domain;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Livro {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
 private int id;
 private String titulo, 
	    nomeAutor, 
	    texto;
 
	@ManyToOne
	@JoinColumn(name = "categoria_id")
	
 private Categoria categoria;
 
 
 

public Livro() {
	super();
	
}

public Livro(int id, String titulo, String nomeAutor, String texto, Categoria categoria) {
	super();
	this.id = id;
	this.titulo = titulo;
	this.nomeAutor = nomeAutor;
	this.texto = texto;
	this.categoria = categoria;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public String getNomeAutor() {
	return nomeAutor;
}

public void setNomeAutor(String nomeAutor) {
	this.nomeAutor = nomeAutor;
}

public String getTexto() {
	return texto;
}

public void setTexto(String texto) {
	this.texto = texto;
}

public Categoria getCategoria() {
	return categoria;
}

public void setCategoria(Categoria categoria) {
	this.categoria = categoria;
}

@Override
public int hashCode() {
	return Objects.hash(id);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Livro other = (Livro) obj;
	return id == other.id;
}

 
 
 
 
}
