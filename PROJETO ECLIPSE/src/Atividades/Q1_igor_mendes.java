package Atividades;

import java.util.Scanner;

public class Q1_igor_mendes {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int valor = entrada.nextInt();
		for (int inicio = 0; inicio <= valor; inicio += 2) {
			System.out.println(inicio);
		}
	}

}
