package br.com.CookYourLasagna;

public class Lasanha {

	final int time = 40;
	public int remain;
	public int preparations;
	public int total;
	
	public Lasanha() {}
	
	public Lasanha(int remain, int preparations) {
		
		this.remain = remain;
		this.preparations = preparations;
	}
	
	public int getRemain() {
		return remain;
	}
	public void setRemain(int remain) {
		this.remain = remain;
	}
	public int getPreparation() {
		return preparations;
	}
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	//funcoes
	
	public int expectedMinutesInOven(int remain) {
		return time - remain;
	}
	
	public int preparationTimeInMinutes(int preparation) {
		
		return preparations * 2;
	}
	
	public int tempogasto() {
		return preparations + remain;
	}
	
	
}

