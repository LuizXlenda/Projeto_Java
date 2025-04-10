package Exercicio_03;

public class ContaBancaria {
	private int numeroConta;
	private String titular;
	private double saldo;
	
	ContaBancaria(int numeroconta, String titular, Double saldo){
		this.numeroConta = numeroconta;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public void setSaldo(double setsaldo) {
		this.saldo = setsaldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public int getConta() {
		return this.numeroConta;
	}
	
	
	
	
	
	
	
	
	
	
	public void exibirSaldo() {
		
		
	}
}
