package Atividades;

import java.util.Scanner;

public class Q4_igor_mendes {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		while (true) {
			int idade = entrada.nextInt();
			if (idade < 0) {
				System.out.println("Idade inválida, valor negativo, digite novamente");
			} else {
				System.out.println("Idade digitada: " + idade);
				System.out.println("Fim do programa");
				break;
			}
		}

	}

}
