package strategy;

import main.Usuario;

public class PlanoFree implements Planos{
	
	public String ExibirPlano(Usuario usuario) {
		if (usuario.getPlano() == 1) {
			return "Ouve de gra�a, mas tem propaganda a todo momento! ";
		}else {
			return "Propaganda";
		}
	}
}
