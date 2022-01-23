package commands;

import java.util.Stack;

public class Executor {
	private Stack<Comando> seguido;
	private Stack<Comando> desseguido;

	public Executor() {
		super();
		this.seguido = new Stack<Comando>();
		this.desseguido = new Stack<Comando>();
	}
	
	public String seguir(Comando c) {
		seguido.push(c);
		desseguido.clear();
		return c.seguir();
	}
	
	public String desseguir() {
		if (seguido.isEmpty())
			return "";
		
		Comando c = seguido.pop();
		desseguido.push(c);
		return c.desseguir();
	}
}
