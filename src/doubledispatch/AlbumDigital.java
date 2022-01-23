package doubledispatch;

public class AlbumDigital extends Album{
	private double tamanhoDownload;
	
	public AlbumDigital(double preco, double tamanhoDownload) {
		super(preco);
		this.tamanhoDownload = tamanhoDownload;
	}
	
	@Override
	public void addPropriedades(Carrinho carrinho) {
		super.addPropriedades(carrinho);
		carrinho.addPropriedade(PropriedadesCarrinho.TAMANHO_DOWNLOAD, tamanhoDownload);
	}

}
