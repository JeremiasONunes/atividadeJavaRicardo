package src;

public class Main {
	public static void main(String[] args) {
		Notificacao notificacao = new Notificacao(TipoNotificacao.EMAIL);
		GerenciadorDeNotificacoes gerenciadorDeNotificacoes = new GerenciadorDeNotificacoes();
		gerenciadorDeNotificacoes.enviarNotificacao(notificacao);
		notificacao.setTipoNotificacao(TipoNotificacao.APP);
		gerenciadorDeNotificacoes.enviarNotificacao(notificacao);
	}

}
