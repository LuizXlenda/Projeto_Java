package Exercicio_08;

public class Pedido {
	private String codPedido;
	private String tipoPizza;
	private String tamanhoPizza;
	private String enderecoPizza;
	private double preco;
	
	
	Pedido(String codPedido, String tipoPizza, String tamanhoPizza, String enderecoPizza, double preco){
		this.codPedido = codPedido;
		this.tipoPizza = tipoPizza;
		this.tamanhoPizza = tamanhoPizza;
		this.enderecoPizza = enderecoPizza;
		this.preco = preco;
	}
	
	public String getCodPedido() {
		return this.codPedido;
	}
	
	public String getSabor() {
		return this.tipoPizza;
	}
	
	public String getTamanho() {
		return this.tamanhoPizza;
	}
	
	
	public String getEndereco() {
		return this.enderecoPizza;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public String toString() {
		return "- Numero do pedido: " + this.codPedido + " - Pizza: " + this.tipoPizza + " - Tamanho: " + this.tamanhoPizza + " - Endereço: " + this.enderecoPizza + " - Preço: R$ " + this.preco;
	} 
}
