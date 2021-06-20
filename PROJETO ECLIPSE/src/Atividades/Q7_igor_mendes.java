package Atividades;

import java.util.Scanner;

public class Q7_igor_mendes {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int[] valorPrincipal = new int[5];
		int tamValP = valorPrincipal.length;
		int[] valorSaida = new int[tamValP];
		int tamValPZeroBased = tamValP - 1;
		int cont = 0;
		while (true) {
			valorPrincipal[cont] = entrada.nextInt();
			cont += 1;
			if (cont >= 5) {
				break;
			}
		}
		for (int i = 0; i < tamValP; i++) {
			valorSaida[i] = valorPrincipal[tamValPZeroBased - i];
			System.out.print(valorSaida[i] + " ");
		}
	}
}
