package Exercicio_07;

import java.util.ArrayList;

public class Estoque {
	private ArrayList<Produto> est;

	public Estoque() {
        est = new ArrayList<>();
    }

	public void adcProd(Produto estoque) {
		est.add(estoque);
	}

	public void deleteProd(String prod) {
		est.removeIf(c -> c.getNome().equalsIgnoreCase(prod));
	}

	public Produto buscarProd(String codProd) {
		for (Produto prod : est) {
			if (prod.getProd().equalsIgnoreCase(codProd)) {
				return prod;
			}
		}
		return null;
	}

	public void listProds() {
		for (Produto prods : est) {
			System.out.println(prods);
		}
	}
	
	public double valorTotal() {
		double total = 0;
		for(Produto prods : est) {
			total += prods.getQtd() * prods.getPreco(); 
		}
		
		return total;
	}
	
	
	
}
