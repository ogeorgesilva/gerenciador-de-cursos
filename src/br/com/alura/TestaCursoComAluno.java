package br.com.alura;

public class TestaCursoComAluno {
	
	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as colecoes do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com Coleções", 24));
		
		Aluno a1 = new Aluno("Ghabriel Winicius", 34672);
		Aluno a2 = new Aluno("Renato Lopes", 5617);
		Aluno a3 = new Aluno("Kevin Sleiman", 17645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(aluno -> System.out.println(aluno));

	}
	
}
