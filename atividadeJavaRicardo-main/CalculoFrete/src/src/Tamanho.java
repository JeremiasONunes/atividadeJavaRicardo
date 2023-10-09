package src;

public class Tamanho implements Frete {

	@Override
	public double calcular(Produto produto) {
		return produto.getTamanho() * 0.237;
	}
}
