package doubledispatch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Carrinho {
	private List<Album> albuns;
	private Map<PropriedadesCarrinho, Double> propriedades;

	public void addAlbum(Album album) {
		getAlbum().add(album);
		album.addPropriedades(this);
	}

	public void addPropriedade(PropriedadesCarrinho tipo, double valor) {
		getPropriedades().put(tipo, getPropriedades().get(tipo) + valor);
	}
	public double getTotal() {
		if (albuns.isEmpty())
			return 0.0;

		double total = 0;
		total += getPropriedades().get(PropriedadesCarrinho.PRECO);
		total += getPropriedades().get(PropriedadesCarrinho.FRETE);
		
		return total;
	}
	
	public double getTamanhoDownload() {
		return getPropriedades().get(PropriedadesCarrinho.TAMANHO_DOWNLOAD);
	}

	private List<Album> getAlbum() {
		if (albuns == null)
			albuns = new ArrayList<Album>();
		return albuns;
	}

	private Map<PropriedadesCarrinho, Double> getPropriedades() {
		if (propriedades == null) {
			propriedades = new HashMap<PropriedadesCarrinho, Double>();
			for (PropriedadesCarrinho tipo : PropriedadesCarrinho.values())
				propriedades.put(tipo, 0.0);
		}
		return propriedades;

	}

}