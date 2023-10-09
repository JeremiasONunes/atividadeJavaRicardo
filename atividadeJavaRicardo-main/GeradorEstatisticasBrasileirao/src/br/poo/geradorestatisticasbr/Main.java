package br.poo.geradorestatisticasbr;

public class Main {

	public static void main(String[] args) {
		DadosJogo jogo = new DadosJogo(2, 3, 4, 5, 6, 7, 8,9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25);
		GeradorEstatisticas gerador = new GeradorEstatisticas();
		gerador.calcularEstatistica(new EstatisticaGolsChutes(jogo), jogo);
		gerador.calcularEstatistica(new EstatisticaTempoJogo(jogo), jogo);
		gerador.calcularEstatistica(new EstatisticaFaltasCartoes(jogo), jogo);
	}

}
