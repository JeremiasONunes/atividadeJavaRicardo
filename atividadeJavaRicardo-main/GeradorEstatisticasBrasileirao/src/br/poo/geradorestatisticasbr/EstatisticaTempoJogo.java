package br.poo.geradorestatisticasbr;

public class EstatisticaTempoJogo implements Estatistica{

	private DadosJogo dados;
	

         
	
	public EstatisticaTempoJogo(DadosJogo dados) {
		super();
		this.dados = dados;
	}



	public String CalcularPorcentagens() {
		
		double tempoBolaRolando = ((double)dados.getTempoTotalBolaRolandoEmMin() / dados.getTempoTotalJogoEmMin()) * 100;
		double PosseBolaTimeMandanteDefesaEmPorcentagem = ((double)dados.getPosseBolaTimeMandanteDefesaEmMin() / (dados.getPosseBolaTimeMandanteDefesaEmMin() + dados.getPosseBolaTimeMandanteAtaqueEmMin())) * 100;
		double PosseBolaTimeMandanteAtaqueEmPorcentagem = ((double)dados.getPosseBolaTimeMandanteAtaqueEmMin() / (dados.getPosseBolaTimeMandanteDefesaEmMin() + dados.getPosseBolaTimeMandanteAtaqueEmMin())) * 100;
		double PosseBolaTimeVisitanteDefesaEmPorcentagem = ((double)dados.getPosseBolaTimeVisitanteDefesaEmMin() / (dados.getPosseBolaTimeVisitanteDefesaEmMin() + dados.getPosseBolaTimeVisitanteAtaqueEmMin())) * 100;
		double PosseBolaTimeVisitanteAtaqueEmPorcentagem= ((double)dados.getPosseBolaTimeVisitanteAtaqueEmMin() / (dados.getPosseBolaTimeVisitanteDefesaEmMin() + dados.getPosseBolaTimeVisitanteAtaqueEmMin())) * 100;
		
		return String.format("A bola ficou rolando por %.2f"+"%%"+" do tempo de jogo %n " + 
		"O time mandante ficou %.2f%% do tempo de jogo na defesa %n" + 
		"O time mandante ficou %.2f%% do tempo de jogo no ataque%n" + 
		"O time visitante ficou %.2f%% do tempo de jogo na defesa%n" + 
		"O time visitante ficou %.2f%% do tempo de jogo no ataque%n",tempoBolaRolando,PosseBolaTimeMandanteDefesaEmPorcentagem, PosseBolaTimeMandanteAtaqueEmPorcentagem,PosseBolaTimeVisitanteDefesaEmPorcentagem,PosseBolaTimeVisitanteAtaqueEmPorcentagem);
	}
	
	
	
	@Override
	public void imprimir() {
		 System.out.println(CalcularPorcentagens()); 
				
	}
	
	
}
