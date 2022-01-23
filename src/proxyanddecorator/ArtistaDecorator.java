package proxyanddecorator;


public class ArtistaDecorator implements ArtistaInterface {
	private static ArtistaInterface artistaDAO;

	private ArtistaInterface getDAO() {
		if (artistaDAO == null)
			artistaDAO = new ArtistaProxy();
		return artistaDAO;
	}

	
	public void addArtista(String nome) {
		if (nome.isBlank())
			throw new RuntimeException("Campo esta em branco");
		getDAO().addArtista(nome);

	}

	public void removeArtista(String nome) {
		getDAO().removeArtista(nome);

	}

	public Artista getArtista(String nome) {
		if (nome.isBlank())
			throw new RuntimeException("Campo esta em branco");
		Artista a = getDAO().getArtista(nome);
		if(a == null)
			throw new RuntimeException("Nao Encontrado");
		return a;
	}
}
