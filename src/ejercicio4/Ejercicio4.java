package ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ejercicio4 {
	static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		LinkedHashSet<String> nombres = new LinkedHashSet<>();
		int contador = 0;
		String nombre;

		while (contador <= 5) {
			System.out.println("Introduce un nombre: ");
			nombre = sc.nextLine();

			if (!nombres.contains(nombre)) {
				nombres.add(nombre);
				contador++;
			} else
				System.out.println("Ese nombre ya se ha añadido");
		}

		// -------------------------- v1
		System.out.println("Nombres:");

		String[] arrNombres = new String[5];
		arrNombres = nombres.toArray(arrNombres);

		for (int i = arrNombres.length - 1; i >= 0; i--)
			System.out.println(arrNombres[i]);

		// -------------------------- v2
		System.out.println("\nNombres v2:");

		ArrayList<String> listNombres = new ArrayList<>(nombres);
		Collections.reverse(listNombres);

		for (String n : listNombres)
			System.out.println(n);

		// -------------------------- v3
		System.out.println("\nNombres v3:");

		Stream<String> stream = nombres.stream().sorted(Comparator.reverseOrder());
		stream.forEach(n -> System.out.println(n));

		sc.close();
	}
}
