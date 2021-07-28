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
		System.out.println();

		System.out.println("O aluno " + a1.getNome() + " está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		System.out.println();
		
		Aluno Ghabriel = new Aluno("Ghabriel Winicius", 34672);
		System.out.println("O aluno " + Ghabriel.getNome() + " está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(Ghabriel));
		System.out.println();
		
		System.out.println("O a1 é equals ao Ghabriel?");
		System.out.println(a1.equals(Ghabriel));

	}

}
