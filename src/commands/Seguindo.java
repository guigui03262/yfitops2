package commands;

public class Seguindo implements Comando {
	private String nomebanda;
	private String seguir;

	public Seguindo(String nomebanda, String seguir) {
		super();
		this.nomebanda = nomebanda;
		this.seguir = seguir;
	}
	
	public String seguir() {
		return nomebanda.concat(seguir + "\n" );
	}
	
	public String desseguir() {
		return nomebanda;
	}

}
