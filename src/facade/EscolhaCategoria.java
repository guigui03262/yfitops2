package facade;

public class EscolhaCategoria {
	
	private Categoria humor;
	private Categoria educacao;
	
	public EscolhaCategoria() {
		humor = new Humor();
		educacao = new Educacao();
	}
	
	public void escolhaHumor() {
		humor.escolha();
	}
	
	public void escolhaEducacao() {
		educacao.escolha();
	}
	
}
