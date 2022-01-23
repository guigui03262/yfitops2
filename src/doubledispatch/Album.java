package doubledispatch;

public abstract class Album {
	private double preco;

	public Album(double preco) {
		super();
		this.preco = preco;
	}

	public void addPropriedades(Carrinho carrinho) {
		carrinho.addPropriedade(PropriedadesCarrinho.PRECO, preco);
	}
}
