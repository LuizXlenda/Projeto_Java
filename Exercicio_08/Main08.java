package Exercicio_08;
import java.util.ArrayList;

public class Main08 {

	public static void main(String[] args) {
		listaPedidos pedis = new listaPedidos();
		ArrayList<Pizza> cardapio = new ArrayList<>();
		
		cardapio.add(new Pizza("Calabresa", 25.00, "Molho de Tomate, Queijo Mussarela, Calabresa, Cebola"));
		cardapio.add(new Pizza("Frango Catupiry", 28.00, "Molho de Tomate, Queijo Mussarela, Frango desfiado, Catupiry"));
		cardapio.add(new Pizza("Frango Cheddar", 28.00, "Molho de Tomate, Queijo Mussarela, Frango desfiado, Cheddar"));
		cardapio.add(new Pizza("Margherita", 28.00, "Molho de Tomate, Queijo Mussarela, Manjericão"));
		
		int a;
		do {
			System.out.printf(
					"[1] Fazer Pedido%n[2] Cancelar Pedido%n[3] Exibir Relatório%n[4] Adicionar Pizza%n[5] Sair%n%n");
			a = inputHelper.inputInt("Escolha uma opção: ");
			System.out.println();
			System.out.println();
			switch (a) {
			case 1:
				System.out.println("Escolha uma pizza do cardápio:");
				System.out.println();
				System.out.println("======= Cardápio =======");
				System.out.println();
                for (int i = 0; i < cardapio.size(); i++) {
                    System.out.println("[" + (i+1) + "] " + cardapio.get(i));
                    }
                System.out.println();
				String codPed = inputHelper.pegarInput("- Digite o código do pedido: ");
				System.out.println();
				String saborPizza = inputHelper.pegarInput("- Digite o sabor: ");
				System.out.println();
				String tamPizza = inputHelper.pegarInput("- Digite o tamanho: ");
				System.out.println();
				String enderecoPizza = inputHelper.pegarInput("- Digite o endereço: ");
				System.out.println();
				double precoPizza = inputHelper.inputDouble("- Digite o preço: R$ ");
				System.out.println();
				
				Pedido ped = new Pedido(codPed, saborPizza, tamPizza, enderecoPizza, precoPizza);
				pedis.adcPedido(ped);
				System.out.println();
				System.out.println();
				break;
			case 2:
				String delete = inputHelper.pegarInput("- Digite o código do pedido que deseja cancelar: ");
				pedis.cancelPedido(delete);
				System.out.println();
				System.out.println();
				System.out.println("Pedido cancelado!");
				System.out.println();

				break;
			case 3:
				pedis.listPedidos();
				System.out.println();
				pedis.totalPedidos();
				System.out.println();
				System.out.println();
				break;
			case 4:
				String sabor = inputHelper.pegarInput("- Digite o sabor: ");
				double preco = inputHelper.inputInt("- Digite o preço: R$ ");
				String ingred = inputHelper.pegarInput("- Digite os ingredientes: ");
				cardapio.add(new Pizza(sabor, preco, ingred));
				System.out.println();
				System.out.println("Novo sabor adicionado!");
				System.out.println();
				
			}

		} while (a != 5);

		System.out.println("Programa Encerrado!");
		

	}

}
