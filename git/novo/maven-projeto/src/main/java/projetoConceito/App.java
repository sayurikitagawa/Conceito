package projetoConceito;

import java.util.ArrayList;
import java.util.List;

public class App {

	 public static void main(String[] args) {
		List<Avaliação> avaliações= new ArrayList<Avaliação>();
	    Avaliação BD=new Avaliação("Banco de dados II",8);
	    Avaliação estatística=new Avaliação("Estatística",8);
	    avaliações.add(BD);
	    avaliações.add(estatística);
	    listarAvaliações(avaliações);	    
	
	    List<Nota> notas=new ArrayList<Nota>();
	    Nota n1=new Nota(5,BD);
	    Nota n2=new Nota(6,BD);
	    Nota n3=new Nota(estatística);

	    
	    Aluno Karina=new Aluno("Karina Castanho","Engenharia de Software 1A");
	    Aluno Letícia=new Aluno("Letícia Nikiforov","Engenharia de Software 1A");
	
	    List<Conceito> conceitos=new ArrayList<Conceito>();
	    Conceito aluno1=new Conceito("A100",Karina,n1);
	    Conceito aluno2=new Conceito("A200",Letícia,n2);
	    conceitos.add(aluno1);
	    conceitos.add(aluno2);
	    aluno1.getNotasAvaliações().get(0).requerimentoRecuperação();
	    aluno1.adicionarNotaeAvaliação(n3);
        aluno1.getNotasAvaliações().get(1).corrigirAvaliação(8);
	    listarConceitos(conceitos);
	 }
	 public static void listarConceitos(List<Conceito> conceitos) {
		 for(Conceito c: conceitos) {
			 System.out.println("------------------------------");
			 System.out.println("Aluno(a): "+c.getAluno().getNome());
			 System.out.println("Id: "+c.getId());
			 System.out.println("Turma: " +c.getAluno().getTurma());
			 System.out.println("---------------");
	        for(Nota n: c.getNotasAvaliações()) {
	        	if(n.getNota()==-1) {
		        	System.out.println("Avaliação: "+n.getAvaliação().getAvaliação() + "  Nota: -- ");
	        	}
	        	else {
	        	System.out.println("Avaliação: "+n.getAvaliação().getAvaliação() + "   Nota: "+n.getNota() +"   Situação: "+n.getSituação());
	        	}
	        }
		 }
	 }
	 
	 public static void listarAvaliações(List<Avaliação> avaliações) {
		 System.out.println("------------------------------");
		 for(Avaliação av: avaliações) {
			 System.out.println("Avaliação: "+av.getAvaliação() + " Valor: "+av.getValorAvaliação());
		 }
	 }
	 
	 public static void listarAlunos(List<Aluno> alunos) {
		 System.out.println("------------------------------");
		 for(Aluno a: alunos) {
			 System.out.println("Aluno(a): "+a.getNome() + " Turma: "+a.getTurma());
		 }
	 }
	 public static void listarNotas(List<Nota> notas) {
		 System.out.println("------------------------------");
		 for(Nota n: notas) {
			 System.out.println("Avaliação: "+n.getNota() + " Nota: "+n.getNota());
		 }
	 }
	 
	 
}
