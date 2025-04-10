package Exercicio_07;

public class Main07 {

	public static void main(String[] args) {
		Estoque est = new Estoque();
		int a;
		do {
			System.out.printf(
					"[1] Adicionar Produto%n[2] Remover Produtos%n[3] Exibir relatório%n[4] Atualizar info%n[5] Sair%n%n");
			a = inputHelper.inputInt("Escolha uma opção: ");
			System.out.println();
			System.out.println();
			switch (a) {
			case 1:
				String nomeProd = inputHelper.pegarInput(">>Digite o nome: ");
				System.out.println();
				String codProd = inputHelper.pegarInput(">>Digite o código: ");
				System.out.println();
				int qtdProd = inputHelper.inputInt(">>Digite a quantidade: ");
				System.out.println();
				double precoProd = inputHelper.inputDouble(">>Digite o preço: ");
				System.out.println();
				Produto prod = new Produto(nomeProd, codProd, qtdProd, precoProd);
				est.adcProd(prod);
				System.out.println();
				System.out.println();
				break;
			case 2:
				String delete = inputHelper.pegarInput(">>Digite o código do produto que deseja remover: ");
				est.deleteProd(delete);
				System.out.println();
				System.out.println();
				System.out.println("Produto Deletado!");

				break;
			case 3:
				est.listProds();
				System.out.printf("%nO valor total do estoque é: R$ %.2f%n%n%n", est.valorTotal());
				break;
			case 4:
				String buscarCodProd = inputHelper.pegarInput(">>Digite o codigo do produto que deseja atualizar: ");
				Produto buscadoCodProd = est.buscarProd(buscarCodProd);
				if (buscadoCodProd != null) {
					System.out.printf(
							"[1] Alterar nome%n[2] Alterar preco%n[3] Alterar quantidade%n[4] Alterar tudo%n%n");
					int alterar = inputHelper.inputInt("Escolha uma opção: ");
					System.out.println();
					System.out.println();

					switch (alterar) {
					case 1:
						String novoNome = inputHelper.pegarInput(">>Novo nome: ");
						buscadoCodProd.setNome(novoNome);
						System.out.println();
						break;
					case 2:
						double novoPreco = inputHelper.inputDouble(">>Novo preco: ");
						buscadoCodProd.setPreco(novoPreco);
						System.out.println();
						break;
					case 3:
						int novoQtd = inputHelper.inputInt(">>Nova quantidade: ");
						buscadoCodProd.setQtd(novoQtd);
						System.out.println();
						break;
					case 4:
						String novoNome1 = inputHelper.pegarInput(">>Novo nome: ");
						buscadoCodProd.setNome(novoNome1);
						System.out.println();
						double novoPreco1 = inputHelper.inputDouble(">>Novo preco: ");
						buscadoCodProd.setPreco(novoPreco1);
						System.out.println();
						int novoQtd1 = inputHelper.inputInt(">>Nova quantidade: ");
						buscadoCodProd.setQtd(novoQtd1);
						System.out.println();
						break;
					default:
						System.out.println("Opção inválida.");
						break;

					}

				} else {
					System.out.println("Produto não encontrado.");
				}

				break;
			case 5:
				System.out.println();
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}

		} while (a != 5);

		System.out.println("Programa Encerrado!");
		

	}

}
