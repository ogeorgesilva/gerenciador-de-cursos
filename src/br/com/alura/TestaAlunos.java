package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {

	public static void main(String[] args) {

		Collection<String> alunos = new HashSet<>();
		alunos.add("Ghabriel Winicius");
		alunos.add("Anacleto Joseph");
		alunos.add("Renato Lopes");
		alunos.add("Ryan Araújo");
		alunos.add("Kevin Sleiman");
		alunos.add("Paulo Sérgio Filho");
		alunos.add("Renato Lopes");
		
		boolean pauloEstaMatriculado = alunos.contains("Ghabriel Winicius");
		alunos.remove("Anacleto Joseph");
		
		System.out.println(pauloEstaMatriculado);
		
		System.out.println(alunos.size());
		System.out.println();
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		System.out.println();
		
		alunos.forEach(aluno -> System.out.println(aluno));
		System.out.println();
		
		System.out.println(alunos);
		System.out.println();
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		
	}

}
