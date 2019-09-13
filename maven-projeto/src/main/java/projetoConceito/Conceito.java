package projetoConceito;

import java.util.ArrayList;
import java.util.List;

public class Conceito {
	
  private String id;
  private Aluno aluno;
  private List<Nota> notasAvaliações=new ArrayList<Nota>();
  
  
public Conceito(String id, Aluno aluno, Nota nota) {
	if (id==null || id.trim().length()==0) {
		throw new RuntimeException("Id não pode ser nulo nem vazio!");
	}
  
	this.id = id;
	this.aluno = aluno;
	notasAvaliações.add(nota);
}

public Conceito(String id, Aluno aluno) {
	if (id==null || id.trim().length()==0) {
		throw new RuntimeException("Id não pode ser nulo nem vazio!");
	}
	this.id = id;
	this.aluno = aluno;
}
public String getId() {
	return id;
}
public void setId(String id) {
	if (id==null || id.trim().length()==0) {
		throw new RuntimeException("Id não pode ser nulo nem vazio!");
	}
	this.id = id;
}
public Aluno getAluno() {
	return aluno;
}
public void setAluno(Aluno aluno) {
	this.aluno = aluno;
}

public void adicionarNotaeAvaliação(Nota nota) {
	notasAvaliações.add(nota);
}
public List<Nota> getNotasAvaliações() {
	return notasAvaliações;
}
public void setNotasAvaliações(List<Nota> notasAvaliações) {
	this.notasAvaliações = notasAvaliações;
}
  
  

}
