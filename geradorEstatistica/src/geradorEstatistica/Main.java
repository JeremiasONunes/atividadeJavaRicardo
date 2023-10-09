package geradorEstatistica;

public class Main {

	public static void main(String[] args) {
		Jogo jogo = new Jogo(2, 4, 21, 30, 10, 22, 18, 20, 70, 96, 32, 1, 0, 24, 1, 1);
		GerenciadorEstatisticas faltasCartoes = new GerenciadorEstatisticas(new FaltasCartoes());
		GerenciadorEstatisticas golsChute = new GerenciadorEstatisticas(new GolsChute());
		GerenciadorEstatisticas tempoJogo = new GerenciadorEstatisticas(new TempoJogo());
		
		tempoJogo.imprimir(jogo);
		golsChute.imprimir(jogo);
		faltasCartoes.imprimir(jogo);

	}

}
