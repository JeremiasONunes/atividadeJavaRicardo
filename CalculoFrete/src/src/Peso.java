package src;

public class Peso implements Frete {

	@Override
	public double calcular(Produto produto) {
		return produto.getPeso() * 0.337;
	}
}
