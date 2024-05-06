package ejercicio5;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio5 {
	static final Scanner sc = new Scanner(System.in);

	static int menu() {
		int opt = 0;

		System.out.println("1. Agregar serie");
		System.out.println("2. Buscar serie");
		System.out.println("3. Eliminar serie");
		System.out.println("4. Listar series");
		System.out.println("0. Salir");

		opt = sc.nextInt();
		sc.nextLine();
		return opt;
	}

	public static void main(String[] args) {
		TreeMap<String, Float> series = new TreeMap<>();
		int opt;
		String nombre;
		float valoracion;

		do {
			opt = menu();

			switch (opt) {
			case 1:
				System.out.println("Nombre de la serie:");
				nombre = sc.nextLine();
				System.out.println("Valoracion:");
				valoracion = sc.nextFloat();
				sc.nextLine();

				series.put(nombre, valoracion);
				break;

			case 2:
				System.out.println("Nombre de la serie:");
				nombre = sc.nextLine();

				if (series.containsKey(nombre))
					System.out.println("Valoracion: " + series.get(nombre));
				else
					System.out.println("No disponible");
				break;

			case 3:
				System.out.println("Nombre de la serie:");
				nombre = sc.nextLine();

				if (series.containsKey(nombre)) {
					series.remove(nombre);
					System.out.println("Done!");
				} else
					System.out.println("No disponible");
				break;

			case 4:
				System.out.println("|     Serie     |  Valoracion  |");
				
				for (Entry<String, Float> entry : series.entrySet()) {
					System.out.printf("| %-13s | %-12.2f |\n", entry.getKey(), entry.getValue());
				}
				break;

			}

		} while (opt != 0 || opt < 0 || opt > 3);

		System.out.println("Bye *ฅ^•ﻌ•^ฅ*");

		sc.close();
	}
}
