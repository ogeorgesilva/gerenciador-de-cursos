package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";

		List<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);
		System.out.println();

		aulas.remove(0);
		System.out.println(aulas);
		System.out.println();

		for (String aula : aulas) {
			System.out.println(aula);
		}
		System.out.println();

		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é: " + primeiraAula);
		System.out.println();

		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i));
		}
		System.out.println();

		System.out.println("O tamando do array aulas é: " + aulas.size());
		System.out.println();

		aulas.forEach(aula -> System.out.println("Aula: " + aula));
		System.out.println();
		
		aulas.add("Aumentando nosso conhecimento");
		System.out.println(aulas);
		Collections.sort(aulas); //Ordenando Aulas pro String
		System.out.println(aulas);
		
	}
}
