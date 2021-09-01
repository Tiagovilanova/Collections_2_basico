package Collections_2_inicio;

import java.util.Collections;
import java.util.List;

public class TestaCurso {
	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do java", "Paulo Silveira");
		// List<Aula> aulas = javaColecoes.getAulas();
		// System.out.println(aulas);
		// aulas.add(new Aula("Trabalhando com ArrayList", 21));
		// System.out.println(aulas);
		// javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		System.out.println(javaColecoes.getAulas());

	}
}
