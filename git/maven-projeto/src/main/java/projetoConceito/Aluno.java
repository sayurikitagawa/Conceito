package projetoConceito;

public class Aluno {
  private String nome;
  private String turma;
  
  
public Aluno(String nome, String turma) {
	if (nome == null || nome.trim().length()==0) {
		throw new RuntimeException("Nome do aluno não pode ser nulo nem vazio!");
	}
	if (turma == null || turma.trim().length()==0) {
		throw new RuntimeException("Nome da da yurma não pode ser nulo nem vazio!");
	}
	this.nome = nome;
	this.turma = turma;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	if (nome == null || nome.trim().length()==0) {
		throw new RuntimeException("Nome do aluno não pode ser nulo nem vazio!");
	}
	this.nome = nome;
}
public String getTurma() {
	return turma;
}
public void setTurma(String turma) {
	if (turma == null || turma.trim().length()==0) {
		throw new RuntimeException("Nome da da yurma não pode ser nulo nem vazio!");
	}
	this.turma = turma;
}
  
  
}
