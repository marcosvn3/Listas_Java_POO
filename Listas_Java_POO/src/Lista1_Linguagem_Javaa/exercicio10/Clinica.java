package Lista1_Linguagem_Javaa.exercicio10;

public class Clinica {
	public static void main(String[] args) {
		Paciente paciente1 = new Paciente("Marocs","M",24,73,1.84);
		
		;
		
		System.out.printf("Valor da consulta e de: %.2fR$.",valorConsulta(paciente1));
	}
	
	public static double valorConsulta(Paciente p){
		double valor = p.getAltura()*(p.getAltura()+p.getIdade());
		return valor;
	}
}
