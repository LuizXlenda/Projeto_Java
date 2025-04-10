package Exercicio_08;

import java.util.ArrayList;

public class listaPedidos {
	private ArrayList<Pedido> peds;
	

	public listaPedidos() {
        peds = new ArrayList<>();
    }

	public void adcPedido(Pedido listaPeds) {
		peds.add(listaPeds);
	}

	public void cancelPedido(String pedido) {
		peds.removeIf(c -> c.getCodPedido().equalsIgnoreCase(pedido));
	}

	public Pedido buscarPedido(String pedido) {
		for (Pedido ped : peds) {
			if (ped.getCodPedido().equalsIgnoreCase(pedido)) {
				return ped;
			}
		}
		return null;
	}

	public void listPedidos() {
		for (Pedido pedidos : peds) {
			System.out.println(pedidos);
			System.out.println();
		}
	}
	

	
	
	public void totalPedidos() {
		int totalPeds = peds.size();
		double soma = 0;
		
		for (Pedido p : peds) {
			soma += p.getPreco();
		}
		
		double mediaPeds = soma / totalPeds;
		
		System.out.println("-Total de pedidos: " + totalPeds);
		System.out.printf("-Média de preço: R$ %.2f%n", mediaPeds);
	}
	
	
}
