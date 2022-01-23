package fluent;

public class Banda {
	
	private String nome;
	private String dataRegistro;
	private Estilo estilo;

	public Banda nomeBanda(String nome) {
		this.nome = nome;
		return this;
	}
	
	public Banda registro(String dataRegistro) {
		this.dataRegistro = dataRegistro;
		return this;
	}
	
	public Banda e(Estilo estilo) {
		this.estilo = estilo;
		return this;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(String dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	public Estilo getEstilo() {
		return estilo;
	}

	public void setEstilo(Estilo estilo) {
		this.estilo = estilo;
	}
	
}