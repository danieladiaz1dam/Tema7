package ejercicio3;

import java.util.HashMap;

public class Ejercicio3 {
	public static void main(String[] args) {
		final String TEXTO= "En un agujero en el suelo, vivía un hobbit. "
				+ "No un agujero húmedo, sucio, repugnante, con restos de "
				+ "gusanos y olor a fango, ni tampoco un agujero, seco, "
				+ "desnudo y arenoso, sin nada en que sentarse o que comer:"
				+ " era un agujero-hobbit, y eso significa comodidad";
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for (char letra : TEXTO.toCharArray()) {
			if (Character.isLetter(letra)) {
				letra = Character.toLowerCase(letra);
				map.put(letra, map.getOrDefault(letra, 0) + 1);
			}
		}
		
		System.out.println("Frecuencia de cada letra");
		
		for (Character key : map.keySet()) {
			System.out.printf("%c: %d \n", key, map.get(key));
		}
	}
}
