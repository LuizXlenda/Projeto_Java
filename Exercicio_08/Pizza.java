package Exercicio_08;

public class Pizza {
	private String nomePizza;
	private double precoPizza;
	private String ingredPizza;
	
	Pizza(String nomePizza, double precoPizza, String ingredPizza){
		this.nomePizza = nomePizza;
		this.precoPizza = precoPizza;
		this.ingredPizza = ingredPizza;
	}
	
	public String getNomePizza() {
		return this.nomePizza;
	}
	
	public double getPrecoPizza() {
		return this.precoPizza;
	}
	
	public String getIngredPizza() {
		return this.ingredPizza;
	}
	
	public String toString() {
		return "- Sabor: " + this.nomePizza + " - Preço: R$ " + this.precoPizza + " - " + "(" + this.ingredPizza + ")";
	} 
}
