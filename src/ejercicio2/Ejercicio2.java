package ejercicio2;

import java.util.HashSet;

public class Ejercicio2 {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		
		
		while (set.size() < 10)
			set.add((int)(Math.random() * 21));
		
		System.out.println(set);
	}
}
