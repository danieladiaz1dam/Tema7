package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio1 {

	public static void main(String[] args) {
		ArrayList<Integer> original = new ArrayList<>();

		for (int i = 1; i <= 10; i++) {
			original.add(i);
		}
		System.out.println("Original:");
		System.out.println(original);
		
		Collections.shuffle(original);

		System.out.println("Desordenada");
		System.out.println(original);
	}
}
