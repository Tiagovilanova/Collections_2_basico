package Nutrition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Professores {
	private String nome;
	private List<Disciplina> disciplina = new ArrayList<Disciplina>();

	public Professores(String nome) {
		super();
		this.nome = nome;
	}

	public List<Disciplina> getDisciplina() {
		return Collections.unmodifiableList(disciplina);
	}

	public String getNome() {
		return nome;
	}
	public void adicionar(Disciplina disciplina) {
		this.disciplina.add(disciplina);
	}
	
	@Override
	public String toString() {
		
		return "[ Nome dos professores: "+this.nome+"]";
	}

}
