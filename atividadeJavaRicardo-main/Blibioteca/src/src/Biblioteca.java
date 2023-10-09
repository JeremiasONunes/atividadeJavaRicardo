package src;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private String nome;
	private List<Livro> livros;
	private List<Autor> autores;
	
	public Biblioteca(String nome) {
		this.nome = nome;
		this.livros = new ArrayList<>();
		this.autores = new ArrayList<>();
	}
	
	public void adicionarLivro(Livro livro) {
		this.livros.add(livro);
	}
	
	public void adicionarAutor(Autor autor) {
		this.autores.add(autor);
	}
	
	public boolean verificarDisponibilidade(String tituloLivro) {
		for(Livro livro : livros) {
			if(livro.getTitulo().equalsIgnoreCase(tituloLivro)) {
				return livro.isDisponivel();
			} 
		}
		return false;
	}
	
	public String getNome() {
		return this.nome;
	}
	public List<Livro> getLivros() {
		return this.livros;
	}
	public List<Autor> getAutores() {
		return this.autores;
	}
	

}