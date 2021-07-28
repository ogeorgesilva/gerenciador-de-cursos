package br.com.alura;

import java.util.List;

public class TestaCurso {
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");
		
		List<Aula> aulas = javaColecoes.getAulas();
		
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com Cole��es", 22));
		
		aulas.forEach(aula -> System.out.println(aula));
		
	}
}
