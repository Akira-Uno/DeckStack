package Deck;

import java.util.Scanner;

public class TesteCarta {
	public static void main(String[] args) {
		Cartas<Integer> c = new Cartas<>();
		boolean sairMenu = false;
		Scanner scanner = new Scanner(System.in);

		do {
			ExibirMenu();
			int menu = scanner.nextInt();
			switch (menu) {
			case 1:
				System.out.println("Digite a carta");
				c.add(scanner.nextInt());
				break;
			case 2:
				c.exibir();
				break;
			case 3:
				c.removerTopo();
				break;
			case 0:
				sairMenu = true;
				System.out.println("...");
				break;
			default:
				System.out.println("invalido");
			}

		} while (sairMenu != true);

	}

	public static void ExibirMenu() {
		System.out.println("1 - adicionar carta");
		System.out.println("2 - exibir");
		System.out.println("3 - remover topo");
		System.out.println("0 - sair");
	}
}