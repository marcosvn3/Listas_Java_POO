package Lista5_Pilares_Da_ProgramaçãoOO_pt1.Atividade1;


public class Aluno extends Pessoa {
	private double nota1,nota2,nota3;
	
	public Aluno(String nome, int dia, int mes, int ano,double nota1, double nota2, double nota3) {
		super(nome,dia,mes,ano);
		setNota1(nota1);
		setNota2(nota2);
		setNota3(nota3);
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		if(nota1 >=0 && nota1 <=10) {
			this.nota1 = nota1;
		}else {
			this.nota1 =0;
		}
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		if(nota2 >=0 && nota2 <=10) {
			this.nota2 = nota2;
		}else {
			this.nota2 =0;
		}
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		if(nota3 >=0 && nota3 <=10) {
			this.nota3 = nota1;
		}else {
			this.nota3 =0;
		}
	}
	
	public void media() {
		System.out.println((getNota1()+getNota2()+getNota3())/3) ;
	}
	
	public void infoAluno() {
		System.out.println(getNome());
		dataNascimento();
		media();
	}
}
