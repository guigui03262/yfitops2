package staticfactory_singleton;

public class Conta {
	private String nomeUsuario;
	private String email;
	private String paisOUregiao;
	private static Conta conta;

	private Conta(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
		this.email = "nenhum email registrado";
		this.paisOUregiao = "nenhum pais ou regiao registrado ";
	}

	private Conta(String nomeUsuario, String email) {
		this.nomeUsuario = nomeUsuario;
		this.email = email;
		this.paisOUregiao = "nenhum pais ou regiao registrado";
	}

	private Conta(String nomeUsuario, String nome, String paisOUregiao) {
		this.nomeUsuario = nomeUsuario;
		this.email = nome;
		this.paisOUregiao = paisOUregiao;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		if (!validar(nomeUsuario))
			return;
		this.nomeUsuario = nomeUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (!validar(email))
			return;
		this.email = email;
	}

	public String getPaisOUregiao() {
		return paisOUregiao;
	}

	public void setPaisOUregiao(String paisOUregiao) {
		this.paisOUregiao = paisOUregiao;
	}

	public static Conta contaNomeUsuario(String nomeUsuario) {
		if (conta != null) {
			conta.setNomeUsuario(nomeUsuario);
			return conta;
		}
		if (!validar(nomeUsuario))
			return null;
		return new Conta(nomeUsuario);
	}

	public static Conta contaNomeUsuarioEmail(String nomeUsuario, String email) {
		if (conta != null) {
			conta.setNomeUsuario(nomeUsuario);
			conta.setEmail(email);
			return conta;
		}
		if (!validar(nomeUsuario))
			return null;
		if (!validar(email))
			return null;
		return new Conta(nomeUsuario, email);

	}

	public static Conta contaNomeUsuarioRegiao(String nomeUsuario, String paisOUregiao) {
		if (conta != null) {
			conta.setNomeUsuario(nomeUsuario);
			return conta;
		}
		if (!validar(nomeUsuario))
			return null;
		Conta a = new Conta(nomeUsuario);
		a.setPaisOUregiao(paisOUregiao);
		return a;

	}

	public static Conta contaCompleta(String nomeUsuario, String email, String paisOUregiao) {
		if (conta != null) {
			conta.setNomeUsuario(nomeUsuario);
			conta.setEmail(email);
			conta.setPaisOUregiao(paisOUregiao);
			return conta;
		}
		if (!validar(nomeUsuario))
			return null;
		if (!validar(email))
			return null;
		return new Conta(nomeUsuario, email, paisOUregiao);

	}

	private static boolean validar(String q) {
		return !q.contains(" ");
	}

}
