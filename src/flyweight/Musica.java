package flyweight;

public class Musica implements MyString{
	private final String nome;

	protected Musica(String nome) {
		this.nome = nome;
	}
	
	public String getString() {
		return nome;
	}
}
