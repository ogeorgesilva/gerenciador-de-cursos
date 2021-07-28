package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestaListaDeAula {

	public static void main(String[] args) {
		
		Aula a1 = new Aula("Revisitando as ArrayLists", 21);
		Aula a2 = new Aula("Listas de objetos", 20);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
		
		List<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		aulas.forEach(aula -> System.out.println(aula));
		System.out.println();
		
		Collections.sort(aulas);
		aulas.forEach(aula -> System.out.println(aula));
		System.out.println();
		
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		
		aulas.forEach(aula -> System.out.println(aula));
		System.out.println();
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
		System.out.println();
		
	}
}
