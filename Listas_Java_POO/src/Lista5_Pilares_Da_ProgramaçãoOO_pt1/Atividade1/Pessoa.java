package Lista5_Pilares_Da_ProgramaçãoOO_pt1.Atividade1;

public class Pessoa {
	private String nome;
	private int dia,mes,ano;
	
	public Pessoa(){};
	public Pessoa(String nome, int dia, int mes, int ano) {
		setNome(nome);
		setDia(dia);
		setMes(mes);
		setAno(ano);
		
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setMes(int mes) {
		if(mes >=1 && mes <=12) {
			this.mes = mes;
		} else {
			this.mes =1;
		}
	}
	
	public int getDia() {
		return dia;
	}
	
	public void setDia(int dia) {
		if(dia >= 1 && dia <=31) {
			this.dia = dia;
		}else{
			this.dia = 1;
		}
		
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	public void dataNascimento() {
		System.out.println(getDia()+"/"+getMes()+"/"+getAno());
	}
}
