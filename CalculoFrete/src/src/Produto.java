package src;

public class Produto {
	private String descricao;
	private double peso;
	private double tamanho;
			
	public Produto(String descricao, double peso, double tamanho) {
		this.descricao = descricao;
		this.peso = peso;
		this.tamanho = tamanho;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	public double getPeso() {
		return this.peso;
	}
	public double getTamanho() {
		return this.tamanho;
	}
}
