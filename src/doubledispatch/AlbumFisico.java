package doubledispatch;

public class AlbumFisico extends Album{
	private double frete;
	
	public AlbumFisico(double preco, double frete) {
		super(preco);
		this.frete = frete;
		
	}
	
	public void addPropriedades(Carrinho carrinho) {
		super.addPropriedades(carrinho);
		carrinho.addPropriedade(PropriedadesCarrinho.FRETE, frete);
	}
	
}
