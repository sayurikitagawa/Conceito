package projetoConceito;



public class Nota {
  private float nota=-1;
  private Avaliação avaliação;
  private String situação="--";
  private boolean recuperação=false;
  
public Nota(float nota, Avaliação avaliação) {
	  if(nota<0 || nota>10) {
			 throw new RuntimeException("Nota não pode ser menor que 0 ou maior que 10");
		 }
	  
	this.nota = nota;
	this.avaliação = avaliação;
	retornarCorrigida();
	situaçãoAluno();
}

public Nota(Avaliação avaliação) { 
	this.avaliação = avaliação;
}

private void situaçãoAluno() {
	if (nota>=6) {
		setSituação("APROVADO(A)");
	}
	else if(nota>=0 || nota<6) {
		setSituação("REPROVADO(A)");
	}
}
public String getSituação() {
	return situação;
}

private void setSituação(String situação) {
	this.situação = situação;
}

private void retornarCorrigida() {
	getAvaliação().setCorrigida(true);
}


public float getNota() {
	return nota;
}

public void setNota(float nota) {
	 if(nota<0 || nota>10) {
		 throw new RuntimeException("Nota não pode ser menor que 0 ou maior que 10");
	 }
	this.nota = nota;
}

public Avaliação getAvaliação() {
	return avaliação;
}

public void setAvaliação(Avaliação avaliação) {
	this.avaliação = avaliação;
}
public void corrigirAvaliação(float nota) {
	 if(getAvaliação().getCorrigida()) {
		throw new RuntimeException("A avaliação já foi corrigida!"); 
	 }
	 if(nota<0 || nota>10) {
		 throw new RuntimeException("Nota não pode ser menor que 0 ou maior que 10");
	 }
	 if(nota>getAvaliação().getValorAvaliação()) {
		 throw new RuntimeException("A nota não pode ser maior que o valor da avaliação: " +getAvaliação().getValorAvaliação());
	 }
	 setNota(nota);
	 getAvaliação().setCorrigida(true);
	 situaçãoAluno();
}
public void requerimentoRecuperação() {
	 if(getRecuperação()) {
			throw new RuntimeException("Já foi pedido o requerimento para recuperação"); 
		 }
	 setRecuperação(true);
	 System.out.println("Pedido de requerimento para recuperação foi enviado para a coordenação");
}

public boolean getRecuperação() {
	return recuperação;
}

private void setRecuperação(boolean recuperação) {
	this.recuperação = recuperação;
}

}
