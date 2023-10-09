package src;
public class Livro {
	private String titulo;
	private Autor autor;
	private boolean disponivel;
	
	public Livro(String titulo, Autor autor, boolean disponivel) {
		this.titulo = titulo;
		this.autor = autor;
		this.disponivel = disponivel;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	public Autor getAutor() {
		return this.autor;
	}
	public boolean isDisponivel() {
		return this.disponivel;
	}
	
}