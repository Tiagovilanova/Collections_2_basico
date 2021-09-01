package Nutrition;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Professores a1 = new Professores("Renata");
		List<Disciplina> disciplina = a1.getDisciplina();
		//a1.getDisciplina().add(new Disciplina("Dietoterapia", 60));
		//System.out.println(a1.getDisciplina());
		//disciplina.add(new Disciplina("Nutrição e dietética", 30));
		//System.out.println(disciplina);
		a1.adicionar(new Disciplina("Dietoterapia 2", 60));
		System.out.println(a1.getDisciplina());
		sc.close();
	}
}
