package geradorEstatistica;

public class GerenciadorEstatisticas {
private Estatistica estatistica;
	
	public GerenciadorEstatisticas(Estatistica estatistica) {
		this.estatistica = estatistica;
	}
	
	public void imprimir(Jogo jogo) {
		System.out.println(estatistica.imprimir(jogo));
	}
}
