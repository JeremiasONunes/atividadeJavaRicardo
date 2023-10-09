package geradorEstatistica;

public class TempoJogo implements Estatistica {

	@Override
	public String imprimir(Jogo jogo) {
		return
		"A bola ficou rolando por " + (((double)jogo.getTempoTotalBolaRolandoEmMin() / jogo.getTempoTotalJogoEmMin()) * 100) + "% do tempo de jogo" + System.lineSeparator() +
		"O time mandante ficou " + (((double)jogo.getPosseBolaTimeMandanteDefesaEmMin() / (jogo.getPosseBolaTimeMandanteDefesaEmMin() + jogo.getPosseBolaTimeMandanteAtaqueEmMin())) * 100) + "% do tempo de jogo na defesa" + System.lineSeparator() +
		"O time mandante ficou " + (((double)jogo.getPosseBolaTimeMandanteAtaqueEmMin() / (jogo.getPosseBolaTimeMandanteDefesaEmMin() + jogo.getPosseBolaTimeMandanteAtaqueEmMin())) * 100) + "% do tempo de jogo no ataque" + System.lineSeparator() +
		"O time visitante ficou " + (((double)jogo.getPosseBolaTimeVisitanteDefesaEmMin() / (jogo.getPosseBolaTimeVisitanteDefesaEmMin() + jogo.getPosseBolaTimeVisitanteAtaqueEmMin())) * 100) + "% do tempo de jogo na defesa" + System.lineSeparator() +
		"O time visitante ficou " + (((double)jogo.getPosseBolaTimeVisitanteAtaqueEmMin() / (jogo.getPosseBolaTimeVisitanteDefesaEmMin() + jogo.getPosseBolaTimeVisitanteAtaqueEmMin())) * 100) + "% do tempo de jogo no ataque" + System.lineSeparator();
	}

}