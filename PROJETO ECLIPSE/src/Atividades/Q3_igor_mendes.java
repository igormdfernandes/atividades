package Atividades;

import java.util.Scanner;

public class Q3_igor_mendes {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int valor = entrada.nextInt();
		int soma = 0;
		for (int inicio = 0; inicio <= valor; inicio += 1) {
			soma += inicio;
		}
		System.out.println("Soma dos números de 0 até " + valor + " = " + soma);
	}
}
