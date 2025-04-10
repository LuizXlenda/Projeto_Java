package Exercicio_06;

public class Main06 {

	public static void main(String[] args) {
		Agenda ag = new Agenda();
		int a;
		do {
			System.out.printf(
					"[1] Adicionar Contato%n[2] Remover Contatos%n[3] Listar Contatos%n[4] Buscar contatos%n[5] Sair%n%n");
			a = inputHelper.inputInt("Escolha uma opção: ");
			System.out.println();
			System.out.println();
			switch (a) {
			case 1:
				String nome = inputHelper.pegarInput(">>Digite o Nome: ");
				System.out.println();
				String tel = inputHelper.pegarInput(">>Digite o Telefone: ");
				Contatos c1 = new Contatos(nome, tel);
				ag.adcCont(c1);
				System.out.println();
				System.out.println();
				break;
			case 2:
				String delete = inputHelper.pegarInput(">>Digite o nome do contato que deseja deletar: ");
				ag.deleteCont(delete);
				System.out.println();
				System.out.println();
				System.out.println("Contato Deletado!");

				break;
			case 3:
				ag.listConts();
				break;
			case 4:
				String buscar = inputHelper.pegarInput(">>Digite o nome do contato que deseja buscar: ");
				Contatos buscado = ag.buscarCont(buscar);
		        if (buscado != null) {
		            System.out.println("Encontrado: " + buscado);
		        } else {
		            System.out.println("Contato não encontrado.");
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
