package Exercicio_05;

public class Carro {
	private String marca;
	private String modelo;
	private int ano;
	private String placa;
	private int velAtual;

	Carro(String marca, String modelo, int ano, String placa, int velAtual) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.placa = placa;
		this.velAtual = velAtual;
	}

	public void setVel(int newVel) {
		this.velAtual = newVel;
	}

	public String getMarca() {
		return this.marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public int getAno() {
		return this.ano;

	}

	public String getPlaca() {
		return this.placa;
	}

	public int getVel() {
		return this.velAtual;
	}
	
	public void acelerar(int aceleraMuito) {
		this.velAtual += aceleraMuito;
		
	}
	
	public void freiar(int frei) {
		this.velAtual -= frei;
		
	}
	
	public void exibirInfo() {
		System.out.printf("Marca: %s%n", this.marca);
		System.out.printf("Modelo: %s%n", this.modelo);
		System.out.printf("Ano: %d%n", this.ano);
		System.out.printf("Placa: %s%n", this.placa);
		System.out.printf("Vel. Atual: %dKm/h%n%n", this.velAtual);
		
	}
	
}
