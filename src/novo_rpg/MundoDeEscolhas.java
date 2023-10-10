package novo_rpg;

import java.util.Scanner;

import java.util.Random;

public class MundoDeEscolhas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		new MundoDeEscolhas();

		System.out.println("Bem-vindo à Esfera da Escolha!");
		System.out.println("Por favor, insira suas estatísticas de 0 a 10.");

		System.out.print("Digite de 1 a 10 o quanto FORTE você é: ");
		int forca = scanner.nextInt();

		System.out.print("Digite de 1 a 10 o quanto INTELIGENTE você é: ");
		int inteligencia = scanner.nextInt();

		System.out.print("Digite de 1 a 10 o quanto HABILIDOSO você é: ");
		int destreza = scanner.nextInt();
		System.out.println();

		if (forca >= 5 && inteligencia >= 2 && destreza >= 5) {
			System.out.println("------------------------------");
			System.out.println("Você é um guerreiro destemido!");
			System.out.println("------------------------------");
		} else if (inteligencia >= 5 && forca >= 2 && destreza >= 3) {
			System.out.println("---------------------");
			System.out.println("Você é um sábio mago!");
			System.out.println("---------------------");
		} else if (forca >= 3 && inteligencia >= 3 && destreza >= 5) {
			System.out.println("---------------------");
			System.out.println("Você é um ágil ladino!");
			System.out.println("---------------------");
		} else {
			System.out.println("-------------------");
			System.out.println("Você é um mestiço!");
			System.out.println("-------------------");

		}

		System.out.println();
		System.out.println("A partir de agora você vai começar sua aventura, escolha sua arma!");
		System.out.println();

		if (forca >= 5 && inteligencia >= 2 && destreza >= 5) {
			System.out.println("1. Espada Paladina");
			System.out.println("2. Machado Duplo de Guerra ");
			System.out.println("3. Clava Esmeralda");
		} else if (inteligencia >= 5 && forca >= 2 && destreza >= 3) {
			System.out.println("1. Cajado do Arcano Primordial");
			System.out.println("2. Grimório Arcano");
			System.out.println("3. Esfera da Visão Profética");
		} else if (forca >= 3 && inteligencia >= 3 && destreza >= 5) {
			System.out.println("1. Adaga Sombria");
			System.out.println("2. Punhal do Assassino");
			System.out.println("3. Dardos Envenenados");
		} else {
			System.out.println("1. Laminas Do Caçador");
			System.out.println("2. Arco do Nevoeiro");
			System.out.println("3. Cajado Da Tempestade ");

		}

		int escolhaArma = scanner.nextInt();

		if (escolhaArma >= 4) {
			do {
				System.out.println("Escolha uma opção (1 a 3): ");
				escolhaArma = scanner.nextInt();

				if (escolhaArma >= 4) {
					System.out.println("Opção Inválida. Por favor, escolha uma opção de 1 a 3.");
				}
			} while (escolhaArma >= 4);
		}

		System.out.println();
		System.out.println();
		System.out.println("Com sua arma em mãos vamos para a batalha..");
		System.out.println();
		System.out.println("Boa sorte em sua jornada, aventureiro!");
		System.out.println();
		System.out.println();

		System.out.println("--------------------------------------------------");
		System.out.println("Um monstro se aproxima, se prepare para a batalha!");
		System.out.println("--------------------------------------------------");
		System.out.println();

		if (escolhaArma == 1) {
			lutaComOgro(forca, inteligencia, destreza);
		} else if (escolhaArma == 2) {
			lutaComOgro(forca, inteligencia, destreza);
		} else if (escolhaArma == 3) {
			lutaComOgro(forca, inteligencia, destreza);
		}
	}

	public static void lutaComOgro(int forca, int inteligencia, int destreza) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		int vidaJogador = 40;
		int vidaOgro = 30;

		while (vidaJogador > 0 && vidaOgro > 0) {
			System.out.println("Você tem " + vidaJogador + " pontos de vida.");
			System.out.println("O Ogro tem " + vidaOgro + " pontos de vida.");
			System.out.println("Pressione Enter para atacar o Ogro...");
			scanner.nextLine();

			int danoJogador = random.nextInt(11) + 5;
			vidaOgro -= danoJogador;

			System.out.println("Você causou " + danoJogador + " pontos de dano ao ogro.\n");

			if (vidaOgro <= 0) {
				System.out.println("Você derrotou o Ogro! Parabéns!");
				System.out.println("Você acabou de ganhar 20 de HP extra!");
				System.out.println();
				System.out.println();
				System.out.println("--------------------------------------------------");
				System.out.println("Sua vida foi restaurada por completo!");
				System.out.println("Prepare-se para a próxima batalha!");
				System.out.println("--------------------------------------------------");
				System.out.println();
				System.out.println();
				lutaComDragao(forca, inteligencia, destreza); // Pula para a luta com o dragão
				break;
			}

			int danoOgro = random.nextInt(10) + 3;
			vidaJogador -= danoOgro;

			System.out.println("O Ogro causou " + danoOgro + " pontos de dano a você.\n");

			if (vidaJogador <= 0) {
				System.out.println("Você foi derrotado pelo Ogro. Boa sorte na próxima vez!");
			}
		}
	}

	public static void lutaComDragao(int forca, int inteligencia, int destreza) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		int vidaJogador = 60;
		int vidaDragao = 45;

		while (vidaJogador > 0 && vidaDragao > 0) {
			System.out.println("Agora você tem " + vidaJogador + " pontos de vida.");
			System.out.println("O Dragao tem " + vidaDragao + " pontos de vida.");
			System.out.println("Pressione Enter para atacar o Dragão...");
			scanner.nextLine();

			int danoJogador = random.nextInt(11) + 8;
			vidaDragao -= danoJogador;

			System.out.println("Você causou " + danoJogador + " pontos de dano ao Dragão.\n");

			if (vidaDragao <= 0) {
				System.out.println("Você derrotou o Dragão! Parabéns!");
				System.out.println("Você acabou de ganhar 20 de HP extra!");
				System.out.println();
				System.out.println();
				System.out.println("--------------------------------------------------");
				System.out.println("Sua vida foi restaurada por completo!");
				System.out.println("Prepare-se para a próxima batalha!");
				System.out.println("--------------------------------------------------");
				System.out.println();
				System.out.println();
				lutaComHydra(forca, inteligencia, destreza); // Mesma coisa em cima, inicia a luta com a Hydra

				break;
			}

			int danoDragao = random.nextInt(10) + 5;
			vidaJogador -= danoDragao;

			System.out.println("O Dragão causou " + danoDragao + " pontos de dano a você.\n");

			if (vidaJogador <= 0) {
				System.out.println("Você foi derrotado pelo Dragão. Boa sorte na próxima vez!");
			}

		}
	}

	public static void lutaComHydra(int forca, int inteligencia, int destreza) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		int vidaJogador = 80;
		int vidaHydra = 65;

		while (vidaJogador > 0 && vidaHydra > 0) {
			System.out.println("Agora você tem " + vidaJogador + " pontos de vida.");
			System.out.println("A Hydra tem " + vidaHydra + " pontos de vida.");
			System.out.println("Pressione Enter para atacar a Hydra...");
			scanner.nextLine();

			int danoJogador = random.nextInt(11) + 10;
			vidaHydra -= danoJogador;

			System.out.println("Você causou " + danoJogador + " pontos de dano a Hydra.\n");

			if (vidaHydra <= 0) {
				System.out.println("Você derrotou a Hydra! Parabéns!");
				System.out.println("Você acabou de ganhar 20 de HP extra!");
				aposLutaComHydra(forca, inteligencia, destreza);

				return;

			}

			int danoHydra = random.nextInt(10) + 8;
			vidaJogador -= danoHydra;

			System.out.println("A Hydra causou " + danoHydra + " pontos de dano a você.\n");

			if (vidaJogador <= 0) {
				System.out.println("Você foi derrotado pela Hydra. Boa sorte na próxima vez!");
				return;
			}

		}

	}

	public static void aposLutaComHydra(int forca, int inteligencia, int destreza) {
		Scanner scanner = new Scanner(System.in);

		System.out.println();
		System.out.println("Você derrotou a Hydra! Parabéns!");
		System.out.println();
		System.out.println();
		System.out.println("Você passou no teste! mostrou ser digno de continuar, agora você tem duas opções:");
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println("1. Ir para a Floresta Esquecida");
		System.out.println("2. Ir para o Deserto da Eternidade");

		System.out.println("--------------------------------");
		System.out.println();

		int escolhaLugar = scanner.nextInt();

		if (escolhaLugar == 1) {
			explorarFloresta(forca, inteligencia, destreza);
		} else if (escolhaLugar == 2) {
			explorarDuna(forca, inteligencia, destreza);
		} else {
			System.out.println("Escolha inválida. Por favor, escolha 1 ou 2.");
		}

		int escolhaLugar2 = scanner.nextInt();

		if (escolhaLugar2 >= 3) {
			do {
				System.out.println("Escolha uma opção (1 ou 2): ");
				escolhaLugar2 = scanner.nextInt();

				if (escolhaLugar >= 4) {
					System.out.println("Opção Inválida. Por favor, escolha uma opção de 1 ou 2.");
				}
			} while (escolhaLugar >= 4);
		}

	}

	private static void explorarFloresta(int forca, int inteligencia, int destreza) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Olá, meu nome é Eldara, a Guardiã da Floresta");
		System.out.println();
		System.out.println("Antes de adentrar, um enigma lhe dou,\r\n" + "Será que consegue, responda, por favor.");
		System.out.println();

		boolean acertouEnigma = false;

		while (!acertouEnigma) {
			System.out.println("----------------------------------------");
			System.out.println("Na floresta, um enigma a decifrar,\r\n" + "Cinco folhas caíram, quantas restam no ar?");
			System.out.println("----------------------------------------");
			int respostaEnigma = scanner.nextInt();

			if (respostaEnigma == 5) {
				acertouEnigma = true;
				System.out.println("Parabéns pela sua conquista, siga com determinação,\r\n"
						+ "A jornada está apenas começando, com muita imaginação.\r\n" + "");

				System.out.println("-----------------------------------------------");
				System.out.println(
						"Passos firmes avançam, desafio à vista,\r\n" + "Com garra e foco, a vitória conquista.!");
				System.out.println("-----------------------------------------------");
				System.out.println();

			} else {
				System.out.println("Não se aflija, o sucesso virá com firmeza,\r\n"
						+ "Continue tentando, com paciência e destreza.");
			}
		}
	}

	private static void explorarDuna(int forca, int inteligencia, int destreza) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.println("Olá, meu nome é Malik, o Navegante das Areias");
		System.out.println();
		System.out.println(
				"Para entrar em nossas Dunas você precisará passar pelo nosso dado da sorte, tire 21 no dado e você passará! Espero que você esteja com sorte.");
		System.out.println();
		System.out.println("--------------------------------------");
		System.out.println("Pressione Enter para jogar o dado...");
		System.out.println("--------------------------------------");
		scanner.nextLine();

		String aceitarOferta = "Y";

		while (aceitarOferta.equalsIgnoreCase("Y")) {
			int totalPontos = 0;
			

			while (totalPontos < 21) {
				int pontosNoDado = random.nextInt(6) + 1; // produzir um número de 1 a 6
				System.out.println("Você tirou um " + pontosNoDado);

				totalPontos += pontosNoDado;

				if (totalPontos == 21) {
					System.out.println(
							"Você tirou 21! Incrível, vejo que é uma pessoa de sorte! Seja bem vindo as dunas, cuidado com oque você pode encontrar... Boa sorte aventureiro!");
					return;

				} else if (totalPontos > 21) {
					System.out.println(
							"Você ultrapassou 21. Infelizmente você não poderá entrar, tente novamente.");
					break;
				} else {
					System.out.println("Total de pontos: " + totalPontos);
					System.out.println("Deseja girar o dado novamente? Aperte Enter");
					scanner.nextLine();
				}
			}
		}
		
	}
}
