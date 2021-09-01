package Nutrition;

public class Disciplina {
private String nome;
private int cargaHoraria;
public Disciplina(String nome, int cargaHoraria) {
	super();
	this.nome = nome;
	this.cargaHoraria = cargaHoraria;
} 

public int getCargaHoraria() {
	return cargaHoraria;
}
public String getNome() {
	return nome;
}
@Override
	public String toString() {
	
		return "[ Disicplina:  "+ this.nome+", Carga Horária: "+this.cargaHoraria+"]";
	}
}
