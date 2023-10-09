package src;

public class Main {
	
	public static void main(String[] args) {
		Autor monteiroLobato = new Autor("Monteiro Lobato");
		Autor chicoXavier = new Autor("Chico Xavier");
		Livro picapauAmarelo = new Livro("O Picapau Amarelo", monteiroLobato, true);
		Livro nossoLar = new Livro("Nosso Lar", chicoXavier, true);
		Biblioteca bibliotecaLucca = new Biblioteca("Biblioteca do Lucca");
		
		bibliotecaLucca.adicionarAutor(chicoXavier);
		bibliotecaLucca.adicionarAutor(monteiroLobato);
		bibliotecaLucca.adicionarLivro(picapauAmarelo);
		bibliotecaLucca.adicionarLivro(nossoLar);
		
		System.out.println(bibliotecaLucca.verificarDisponibilidade("Nosso Lar") ? "O Livro está Disponível" : "O Livro não está disponível ou não foi encontrado!");
	}
	
}