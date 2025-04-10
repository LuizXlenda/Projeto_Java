package Exercicio_07;

public class Produto {
	private String nome;
	private String codProd;
	private int qtdEstoque;
	private double preco;
	
	
	Produto(String nome, String codProd, int qtdEstoque, double preco){
		this.nome = nome;
		this.codProd = codProd;
		this.qtdEstoque = qtdEstoque;
		this.preco = preco;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getProd() {
		return this.codProd;
	}
	
	public int getQtd() {
		return this.qtdEstoque;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setProd(String prod) {
		this.codProd = prod;
	}
	
	public void setQtd(int qtdEs) {
		this.qtdEstoque = qtdEs;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	public String toString() {
		return "Produto: " + this.nome + " Código: " + this.codProd + " Estoque: " + this.qtdEstoque + " Preço: R$ " + this.preco;
	} 
}
