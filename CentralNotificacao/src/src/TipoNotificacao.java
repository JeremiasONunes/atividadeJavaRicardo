package src;

public enum TipoNotificacao {
	EMAIL("E-mail"),
	APP("App"),
	PUSH("Push");
	
	private String tipo;
	
	TipoNotificacao(String tipo) {
		this.setTipo(tipo);
	}

	public String getTipo() {
		return tipo;
	}

	private void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
