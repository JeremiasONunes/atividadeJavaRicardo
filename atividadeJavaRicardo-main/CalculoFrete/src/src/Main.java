package src;

public class Main {
	public static void main(String[] args) {
		Calculadora fretePorPeso = new Calculadora(new Peso());
		Calculadora fretePorTamanho = new Calculadora(new Tamanho());
		Produto produto = new Produto("Sabonete", 0.1, 0.2);
		fretePorPeso.calcularFrete(produto);
		fretePorTamanho.calcularFrete(produto);
	}
}
