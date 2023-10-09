package geradorEstatistica;

public class FaltasCartoes implements Estatistica {

	@Override
	public String imprimir(Jogo jogo) {
		return 
				"Total de Faltas: " + (jogo.getFaltasTimeMandante() + jogo.getFaltasTimeVisitante()) + System.lineSeparator() +
				"O time mandante teve " + (((double)jogo.getFaltasTimeMandante() / (jogo.getFaltasTimeMandante() + jogo.getFaltasTimeVisitante())) * 100) + "% das faltas do jogo" + System.lineSeparator() +
				"O time visitante teve " + (((double)jogo.getFaltasTimeVisitante() / (jogo.getFaltasTimeMandante() + jogo.getFaltasTimeVisitante())) * 100) + "% das faltas do jogo" + System.lineSeparator() +
				"Total de cartões amarelos do time visitante: " + jogo.getCartoesAmarelosVisitante() + System.lineSeparator() +
				"Total de cartões vermelhos do time visitante: " + jogo.getCartoesVermelhosVisitante() + System.lineSeparator() +
				"Total de cartões amarelos do time mandante: " + jogo.getCartoesAmarelosMandante() + System.lineSeparator() +
				"Total de cartões vermelhos do time mandante: " + jogo.getCartoesVermelhosMandante() + System.lineSeparator();
	}

}
