package Exercicio_05;

public class Main05 {

	public static void main(String[] args) {
		Carro[] carros = new Carro[3];

		for (int i = 0; i < carros.length; i++) {
			String marca = inputHelper.pegarInput("Digite a marca do Carro " + (i + 1) + ": ");
			String modelo = inputHelper.pegarInput("Digite o modelo do Carro " + (i + 1) + ": ");
			int ano = inputHelper.inputInt("Digite o ano do Carro " + (i + 1) + ": ");
			String placa = inputHelper.pegarInput("Digite a placa do Carro " + (i + 1) + ": ");
			int vel = inputHelper.inputInt("Digite a velocidade atual do Carro " + (i + 1) + ": ");
			System.out.println();
			carros[i] = new Carro(marca, modelo, ano, placa, vel);
		}

		int numCar = inputHelper.inputInt("Digite o Nº do Carro que deseja dirigir (1, 2 ou 3): ");
		System.out.println();

		switch (numCar) {
		// Carro 1
		case 1:
			int car1;
			do {
				System.out.printf("[1] Exibir Info%n[2] Acelerar%n[3] Frear%n[4] Sair%n%n");
				car1 = inputHelper.inputInt("Escolha uma opção: ");
				System.out.println();
				System.out.println();
				switch (car1) {
				case 1:
					carros[0].exibirInfo();
					System.out.println();
					System.out.println();
					break;
				case 2:
					int acelera = inputHelper.inputInt("Digite a velocidade que deseja incrementar: ");
					carros[0].acelerar(acelera);
					System.out.printf("Carro acelerado!%nNova velocidade: %dKm/h", carros[0].getVel());
					System.out.println();
					System.out.println();
					break;
				case 3:
					int freia = inputHelper.inputInt("Digite a velocidade que deseja decrementar: ");
					carros[0].freiar(freia);
					System.out.printf("Carro freado!%nNova velocidade: %dKm/h", carros[0].getVel());
					System.out.println();
					System.out.println();
					break;
				case 4:
					System.out.println();
					break;
				default:
					System.out.println("Opção inválida!");
					break;
				}

			} while (car1 != 4);
			System.out.println("Programa encerrado!");
			System.out.println();

			break;
		// Carro 2
		case 2:
			int car2;
			do {
				System.out.printf("[1] Exibir Info%n[2] Acelerar%n[3] Frear%n[4] Sair%n%n");
				car2 = inputHelper.inputInt("Escolha uma opção: ");
				System.out.println();
				System.out.println();
				switch (car2) {
				case 1:
					carros[1].exibirInfo();
					System.out.println();
					System.out.println();
					break;
				case 2:
					int acelera = inputHelper.inputInt("Digite a velocidade que deseja incrementar: ");
					carros[1].acelerar(acelera);
					System.out.printf("Carro acelerado!%nNova velocidade: %dKm/h", carros[1].getVel());
					System.out.println();
					System.out.println();
					break;
				case 3:
					int freia = inputHelper.inputInt("Digite a velocidade que deseja decrementar: ");
					carros[1].freiar(freia);
					System.out.printf("Carro freado!%nNova velocidade: %dKm/h", carros[1].getVel());
					System.out.println();
					System.out.println();
					break;
				case 4:
					System.out.println();
					break;
				default:
					System.out.println("Opção inválida!");
					break;
				}

			} while (car2 != 4);
			System.out.println("Programa encerrado!");
			System.out.println();

			break;
		// Carro 3
		case 3:
			int car3;
			do {
				System.out.printf("[1] Exibir Info%n[2] Acelerar%n[3] Frear%n[4] Sair%n%n");
				car3 = inputHelper.inputInt("Escolha uma opção: ");
				System.out.println();
				System.out.println();
				switch (car3) {
				case 1:
					carros[2].exibirInfo();
					System.out.println();
					System.out.println();
					break;
				case 2:
					int acelera = inputHelper.inputInt("Digite a velocidade que deseja incrementar: ");
					carros[2].acelerar(acelera);
					System.out.printf("Carro acelerado!%nNova velocidade: %dKm/h", carros[2].getVel());
					System.out.println();
					System.out.println();
					break;
				case 3:
					int freia = inputHelper.inputInt("Digite a velocidade que deseja decrementar: ");
					carros[2].freiar(freia);
					System.out.printf("Carro freado!%nNova velocidade: %dKm/h", carros[2].getVel());
					System.out.println();
					System.out.println();
					break;
				case 4:
					System.out.println();
					break;
				default:
					System.out.println("Opção inválida!");
					break;
				}

			} while (car3 != 4);
			System.out.println("Programa encerrado!");
			System.out.println();

			break;
		default:
			System.out.println("Opção Invalida!");
			break;
		}

	}

}
