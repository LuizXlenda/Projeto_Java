package Exercicio_03;

public class Main03 {

	public static void main(String[] args) {
		ContaBancaria[] banco = new ContaBancaria[3];

		for (int i = 0; i < banco.length; i++) {
			int conta = inputHelper.inputInt("Digite o numero da conta " + (i + 1) + ": ");
			String titular = inputHelper.pegarInput("Digite o nome do titular " + (i + 1) + ": ");
			double saldo = inputHelper.inputDouble("Digite o saldo da conta " + (i + 1) + ": ");
			System.out.println();
			banco[i] = new ContaBancaria(conta, titular, saldo);

		}

		int numConta = inputHelper.inputInt("Digite o digito (1, 2 ou 3) da conta que deseja acessar: ");

		switch (numConta) {
		// Conta 1
		case 1:
			int num1;
			do {
				System.out.printf("[1] Sacar%n[2] Depositar%n[3] Exibir saldo%n[4] Sair%n%n");
				num1 = inputHelper.inputInt("Escolha uma opção: ");
				System.out.println();
				switch (num1) {
				case 1:
					double saque1 = inputHelper.inputDouble("Digite a quantidade do saque: ");
					System.out.println();
					double saldoAtual1 = banco[0].getSaldo();
					double newSaldo1 = saldoAtual1 - saque1;
					banco[0].setSaldo(newSaldo1);
					System.out.printf("Saque realizado!%nSaldo atual: %.2f ", banco[0].getSaldo());
					System.out.println();
					break;
				case 2:
					double saque2 = inputHelper.inputDouble("Digite a quantidade do depósito: ");
					System.out.println();
					double saldoAtual2 = banco[0].getSaldo();
					double newSaldo2 = saldoAtual2 + saque2;
					banco[0].setSaldo(newSaldo2);
					System.out.printf("Deposito realizado!%nSaldo atual: %.2f ", banco[0].getSaldo());
					System.out.println();
					break;
				case 3:
					System.out.printf("Seu saldo atual é: %.2f", banco[0].getSaldo());
					System.out.println();
					System.out.println();
					break;
				case 4:
					System.out.println();
					break;
				default:
					System.out.println("Opção invalida.");
					System.out.println();
					break;
				}

			} while (num1 != 4);

			System.out.println("Programa encerrado!");

			break;
		// Conta 2
		case 2:
			int num2;
			do {
				System.out.printf("[1] Sacar%n[2] Depositar%n[3] Exibir saldo%n[4] Sair%n%n");
				num2 = inputHelper.inputInt("Escolha uma opção: ");
				System.out.println();
				switch (num2) {
				case 1:
					double saque1 = inputHelper.inputDouble("Digite a quantidade do saque: ");
					System.out.println();
					double saldoAtual1 = banco[1].getSaldo();
					double newSaldo1 = saldoAtual1 - saque1;
					banco[1].setSaldo(newSaldo1);
					System.out.printf("Saque realizado!%nSaldo atual: %.2f ", banco[1].getSaldo());
					System.out.println();
					break;
				case 2:
					double saque2 = inputHelper.inputDouble("Digite a quantidade do depósito: ");
					System.out.println();
					double saldoAtual2 = banco[1].getSaldo();
					double newSaldo2 = saldoAtual2 + saque2;
					banco[1].setSaldo(newSaldo2);
					System.out.printf("Deposito realizado!%nSaldo atual: %.2f ", banco[1].getSaldo());
					System.out.println();
					break;
				case 3:
					System.out.printf("Seu saldo atual é: %.2f", banco[1].getSaldo());
					System.out.println();
					System.out.println();
					break;
				case 4:
					System.out.println();
					break;
				default:
					System.out.println("Opção invalida.");
					System.out.println();
					break;
				}

			} while (num2 != 4);

			System.out.println("Programa encerrado!");

			break;
		// Conta 3
		case 3:
			int num3;
			do {
				System.out.printf("[1] Sacar%n[2] Depositar%n[3] Exibir saldo%n[4] Sair%n%n");
				num3 = inputHelper.inputInt("Escolha uma opção: ");
				System.out.println();
				switch (num3) {
				case 1:
					double saque1 = inputHelper.inputDouble("Digite a quantidade do saque: ");
					System.out.println();
					double saldoAtual1 = banco[2].getSaldo();
					double newSaldo1 = saldoAtual1 - saque1;
					banco[2].setSaldo(newSaldo1);
					System.out.printf("Saque realizado!%nSaldo atual: %.2f ", banco[2].getSaldo());
					System.out.println();
					break;
				case 2:
					double saque2 = inputHelper.inputDouble("Digite a quantidade do depósito: ");
					System.out.println();
					double saldoAtual2 = banco[2].getSaldo();
					double newSaldo2 = saldoAtual2 + saque2;
					banco[2].setSaldo(newSaldo2);
					System.out.printf("Deposito realizado!%nSaldo atual: %.2f ", banco[2].getSaldo());
					System.out.println();
					break;
				case 3:
					System.out.printf("Seu saldo atual é: %.2f", banco[2].getSaldo());
					System.out.println();
					System.out.println();
					break;
				case 4:
					System.out.println();
					break;

				default:
					System.out.println("Opção invalida.");
					System.out.println();
					break;
				}

			} while (num3 != 4);

			System.out.println("Programa encerrado!");

			break;
		default:
			System.out.println("Opção Invalida!");
			break;

		}

	}

}
