package br.poo.geradorestatisticasbr;

public class EstatisticaGolsChutes implements Estatistica{
	
	private DadosJogo dados;
	
	
	public EstatisticaGolsChutes(DadosJogo dados) {
		super();
		this.dados = dados;
	}


	public String CalcularTotalDeGols() {
		return "Total de gols no jogo: " + dados.getTotalGols()  + System.lineSeparator() +
				"O time mandante fez " + dados.getGolsTimeMandante() + " gols" + System.lineSeparator() +
				"O time visitante fez " + dados.getGolsTimeVisitante() + " gols" + System.lineSeparator() +
				"O time mandante chutou " + dados.getChutesAGolTimeMandante() + " vezes no gol" + System.lineSeparator() +
				"O time visitante chutou " + dados.getChutesAGolTimeVisitante() + " vezes no gol" + System.lineSeparator();
	}
	
	
	@Override
	public void imprimir() {
		System.out.println(CalcularTotalDeGols());
	}
}
