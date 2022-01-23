package flyweight;

import java.util.HashMap;
import java.util.Map;

public class NameFactory {
	private static Map<String, Musica> nomes;

	private static void init() {
		nomes = new HashMap<String, Musica>();
		nomes.put("Touch Me", new Musica("Touch Me"));
		nomes.put("Riders On The Storm", new Musica("Riders On The Storm"));
		nomes.put("Strange Days", new Musica("Strange Days"));
		nomes.put("Moonlight Drive", new Musica("Moonlight Drive"));
	}

	public static Musica get(String s) {
		if (nomes == null)
			init();

		return nomes.get(s);

	}

}
