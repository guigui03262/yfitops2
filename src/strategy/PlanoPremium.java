package strategy;

import main.Usuario;

public class PlanoPremium implements Planos{

	public String ExibirPlano(Usuario usuario) {
		if(usuario.getPlano() == 2) {
			return "Ouve m�sicas onde estiver com modo offline, sem propagandas, ouve o que quiser, troca de musica quando quiser e ainda pode baixalas";
		}
		if(usuario.getPlano() == 3) {
			return "Todos os benef�cios Premium,Ouve m�sicas onde estiver com modo offline, sem propagandas, ouve o que quiser, troca de musica quando quiser e ainda pode baixalas, e um pre�o especial para estudantes universit�rios.";
		}else {
			return "Propaganda";
		}
	}

}
