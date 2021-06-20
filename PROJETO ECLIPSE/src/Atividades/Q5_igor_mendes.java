package Atividades;

import java.util.Scanner;

public class Q5_igor_mendes {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int[] valor = new int[5];
		int maior = 0;
		for (int cont = 0; cont < valor.length; cont += 1) {
			System.out.println("Digite o " + (cont + 1) + " Valor ");
			valor[cont] = entrada.nextInt();
			if (valor[cont] > maior) {
				maior = valor[cont];
			}
		}
		System.out.println("Maior valor: " + maior);
	}
}