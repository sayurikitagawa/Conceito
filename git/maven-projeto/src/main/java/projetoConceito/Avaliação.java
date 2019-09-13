package projetoConceito;

public class Avaliação{
  private String avaliação;
  private float valorAvaliação;
  private boolean corrigida=false;
  
public Avaliação(String avaliação, float valorAvaliação) {
	if(avaliação==null || avaliação.trim().length()==0) {
		throw new RuntimeException("Avaliação não pode ser nula nem vazia!");
	}
	if(valorAvaliação<0 || valorAvaliação>10) {
		throw new RuntimeException("Não é permitido avaliação com valor menor que 0 ou maior que 10");
	}
	this.avaliação = avaliação;
	this.valorAvaliação = valorAvaliação;
}

public String getAvaliação() {
	return avaliação;
}

public void setAvaliação(String avaliação) {
	if(avaliação==null || avaliação.trim().length()==0) {
		throw new RuntimeException("Avaliação não pode ser nula nem vazia!");
	}
	this.avaliação = avaliação;
}

public float getValorAvaliação() {
	return valorAvaliação;
}

public void setValorAvaliação(float valorAvaliação) {
	if(valorAvaliação<0 || valorAvaliação>10) {
		throw new RuntimeException("Não é permitido avalição com valor menor que 0 ou maior que 10");
	}
	this.valorAvaliação = valorAvaliação;
}

public boolean getCorrigida() {
	return corrigida;
}

public void setCorrigida(boolean corrigida) {
	this.corrigida = corrigida;
}
  

  
}
