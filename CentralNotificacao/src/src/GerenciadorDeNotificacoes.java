package src;

public class GerenciadorDeNotificacoes {
	public void enviarNotificacao(Notificacao notificacao) {
		System.out.println("Você recebeu uma notificação do tipo " + notificacao.getTipoString() + "!");
	}
}