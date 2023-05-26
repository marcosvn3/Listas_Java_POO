package Lista2_Estrutras_Condicionais.exercicio9;

public class Tempo {
	private int hora;
	private int min;
	private int sec;
	
	public Tempo(int hora, int min, int sec) {
		this.hora = hora;
		this.min= min;
		this.sec = sec;
	}
	
	public int getHora() {
		return this.hora;
	}
	public void setHora(int h) {
		this.hora = h;
	}
	
	public int getMin() {
		return this.min;
	}
	public void setMin(int m) {
		this.min = m;
	}
	
	public int getSec() {
		return this.sec;
	}
	public void setSec(int s) {
		this.sec = s;
	}
	
	public int  transformarEmSegundos() {
		int horaEmSec = (this.getHora()*60)*60;
		
		int minEmSec = this.getMin()*60;
		
		int totalSec = horaEmSec+minEmSec+this.getSec();
		
		return totalSec;
	}
	
	
	
	
	
	
}
