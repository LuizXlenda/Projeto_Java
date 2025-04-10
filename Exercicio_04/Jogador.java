package Exercicio_04;

public class Jogador {
	private String nome;
	private int pontuacao;
	private int nivel;
	
	Jogador(String nome, int pont, int nivel){
		this.nome = nome;
		this.pontuacao = pont;
		this.nivel = nivel;
	}
	
	public void setPont(int pont) {
		this.pontuacao = pont;
	}
	
	public void setNivel(int nivel) {
		this.nivel = nivel;
		
	}
	
	public String getNome(){
		return this.nome;
		
	}
	
	public int getPont() {
		return this.pontuacao;
		
	}
	
	public int getNivel(){
		return this.nivel;
	}
	
	
	
	
	
	
	
	
	
	
}
