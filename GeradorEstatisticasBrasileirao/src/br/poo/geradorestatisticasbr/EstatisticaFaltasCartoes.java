package br.poo.geradorestatisticasbr;

public class EstatisticaFaltasCartoes implements Estatistica{
	private DadosJogo dados;
	
	
	public EstatisticaFaltasCartoes(DadosJogo dados) {
		super();
		this.dados = dados;
	}
	public String CalcularPorcentagemDeCartoes() {
		double PorcentagemFaltasTimeVisitante = ((double)dados.getTotalFaltasTimeVisitante() / dados.getTotalFaltas() ) * 100;
		double getPorcentagemFaltasTimeMandante = ((double)dados.getTotalFaltasTimeMandante() / dados.getTotalFaltas()) * 100;
		return "Total de Faltas: " + dados.getTotalFaltas() + System.lineSeparator() +
				"O time mandante teve " + getPorcentagemFaltasTimeMandante + "% das faltas do jogo" + System.lineSeparator() +
				"O time visitante teve " + PorcentagemFaltasTimeVisitante + "% das faltas do jogo" + System.lineSeparator() +
				"Total de cartões amarelos do time visitante: " + dados.getTotalCartoesAmarelosTimeVisitante() + System.lineSeparator() +
				"Total de cartões vermelhos do time visitante: " + dados.getTotalCartoesVermelhosTimeVisitante() + System.lineSeparator() +
				"Total de cartões amarelos do time mandante: " + dados.getTotalCartoesAmarelosTimeMandante() + System.lineSeparator() +
				"Total de cartões vermelhos do time mandante: " + dados.getTotalCartoesVermelhosTimeMandante() + System.lineSeparator();
		
	}
@Override
	public void imprimir() {
		System.out.println(CalcularPorcentagemDeCartoes());
	}
}
