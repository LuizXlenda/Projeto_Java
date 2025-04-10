package Exercicio_04;

public class Main04 {

	public static void main(String[] args) {
		Jogador[] player = new Jogador[3];

		for (int i = 0; i < player.length; i++) {
			String nome = inputHelper.pegarInput("Digite o Nickname do Player " + (i + 1) + ": ");
			int nivel = inputHelper.inputInt("Digite o Level do Player " + (i + 1) + ": ");
			int pont = inputHelper.inputInt("Digite o Score do Player " + (i + 1) + ": ");
			System.out.println();
			player[i] = new Jogador(nome, pont, nivel);
		}

		int numJog = inputHelper.inputInt("Digite o Nº do Player que deseja upar (1, 2 ou 3): ");
		System.out.println();

		switch (numJog) {
		// Player 1
		case 1:
			int jog1;
			do {
				System.out.printf("[1] Exibir Info%n[2] Alterar Level%n[3] Alterar Score%n[4] Sair%n%n");
				jog1 = inputHelper.inputInt("Escolha uma opção: ");
				System.out.println();
				System.out.println();
				switch (jog1) {
				case 1:
					System.out.printf("Name: %s%n", player[0].getNome());
					System.out.printf("Level: %d%n", player[0].getNivel());
					System.out.printf("Score: %d%n", player[0].getPont());
					System.out.println();
					System.out.println();
					break;
				case 2:
					int newLevel = inputHelper.inputInt("Digite quantos levels deseja upar: ");
					int levelAtual = player[0].getNivel();
					int levelUp = levelAtual + newLevel;
					player[0].setNivel(levelUp);
					System.out.printf("Novo Level Definido!%nNovo level: %d", player[0].getNivel());
					System.out.println();
					System.out.println();
					break;
				case 3:
					int newScore = inputHelper.inputInt("Digite quantos pontos deseja upar: ");
					int scoreAtual = player[0].getPont();
					int scoreUp = scoreAtual + newScore;
					player[0].setPont(scoreUp);
					System.out.printf("Novo Score Definido!%nNovo Score: %d", player[0].getPont());
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

			} while (jog1 != 4);
			System.out.println("Programa encerrado!");
			System.out.println();

			break;
		// Player 2
		case 2:
			int jog2;
			do {
				System.out.printf("[1] Exibir Info%n[2] Alterar Level%n[3] Alterar Score%n[4] Sair%n%n");
				jog2 = inputHelper.inputInt("Escolha uma opção: ");
				System.out.println();
				System.out.println();
				switch (jog2) {
				case 1:
					System.out.printf("Name: %s%n", player[1].getNome());
					System.out.printf("Level: %d%n", player[1].getNivel());
					System.out.printf("Score: %d%n", player[1].getPont());
					System.out.println();
					System.out.println();
					break;
				case 2:
					int newLevel = inputHelper.inputInt("Digite quantos levels deseja upar: ");
					int levelAtual = player[1].getNivel();
					int levelUp = levelAtual + newLevel;
					player[1].setNivel(levelUp);
					System.out.printf("Novo Level Definido!%nNovo level: %d", player[1].getNivel());
					System.out.println();
					System.out.println();
					break;
				case 3:
					int newScore = inputHelper.inputInt("Digite quantos pontos deseja upar: ");
					int scoreAtual = player[1].getPont();
					int scoreUp = scoreAtual + newScore;
					player[1].setPont(scoreUp);
					System.out.printf("Novo Score Definido!%nNovo Score: %d", player[1].getPont());
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

			} while (jog2 != 4);
			System.out.println("Programa encerrado!");
			System.out.println();

			break;
		// Player 3
		case 3:
			int jog3;
			do {
				System.out.printf("[1] Exibir Info%n[2] Alterar Level%n[3] Alterar Score%n[4] Sair%n%n");
				jog3 = inputHelper.inputInt("Escolha uma opção: ");
				System.out.println();
				System.out.println();
			switch (jog3) {
			case 1:
				System.out.printf("Name: %s%n", player[2].getNome());
				System.out.printf("Level: %d%n", player[2].getNivel());
				System.out.printf("Score: %d%n", player[2].getPont());
				System.out.println();
				System.out.println();
				break;
			case 2:
				int newLevel = inputHelper.inputInt("Digite quantos levels deseja upar: ");
				int levelAtual = player[2].getNivel();
				int levelUp = levelAtual + newLevel;
				player[2].setNivel(levelUp);
				System.out.printf("Novo Level Definido!%nNovo level: %d", player[2].getNivel());
				System.out.println();
				System.out.println();
				break;
			case 3:
				int newScore = inputHelper.inputInt("Digite quantos pontos deseja upar: ");
				int scoreAtual = player[2].getPont();
				int scoreUp = scoreAtual + newScore;
				player[2].setPont(scoreUp);
				System.out.printf("Novo Score Definido!%nNovo Score: %d", player[2].getPont());
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
			

			} while (jog3 != 4);
			System.out.println("Programa encerrado!");
			System.out.println();
			
			break;
		default:
			System.out.println("Opção Invalida!");
			break;
		}

	}

}
