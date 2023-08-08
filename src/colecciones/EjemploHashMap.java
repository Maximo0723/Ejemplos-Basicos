package colecciones;

import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {

	public static void main(String[] args) {
		Map<String, Integer> edades= new HashMap<>();
		edades.put("Juan", 17);
		edades.put("Beto", 35);
		edades.put("Juan", 45);
		for(Map.Entry<String, Integer> entry: edades.entrySet()) {
			System.out.println("Nombre: " + entry.getKey() + "- edad: " + entry.getValue());
		}
		if (!edades.containsKey("Romina")) {//Con el uso de el signo de admiración verifica el caso contrario a que la lista contenga a Romina que sería que no la contenga.
			System.out.println("No contiene a Romina");
		}
	}

}
