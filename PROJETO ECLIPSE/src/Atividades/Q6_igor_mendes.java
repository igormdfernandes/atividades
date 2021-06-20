package Atividades;

import java.util.Scanner;

public class Q6_igor_mendes {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int[] valor = new int[5];
		int menor = 0;
		for (int cont = 0; cont < valor.length; cont += 1) {
			System.out.println("Digite o " + (cont + 1) + " Valor ");
			valor[cont] = entrada.nextInt();
			if (valor[cont] < menor) {
				menor = valor[cont];
			}
		}
		System.out.println("Menor valor: " + menor);
	}

}
