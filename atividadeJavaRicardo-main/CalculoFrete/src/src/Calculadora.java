package src;

public class Calculadora {
private Frete tipoFrete;
	
	public Calculadora(Frete frete) {
		this.tipoFrete = frete;
	}
	
	public void calcularFrete(Produto produto) {
		System.out.println("Frete é de: R$" + tipoFrete.calcular(produto));
	}
}
