package proxyanddecorator;

import java.util.HashMap;
import java.util.Map;

public class ArtistaProxy implements ArtistaInterface {
	private Map<String, Artista> artista;

	public ArtistaProxy() {
		this.artista = new HashMap<>();

	}

	public void addArtista(String nome) {
		this.artista.put(nome, new Artista(nome));
	}

	public void removeArtista(String nome) {
		this.artista.remove(nome);
	}

	public Artista getArtista(String nome) {
		return artista.get(nome);
	}
}
