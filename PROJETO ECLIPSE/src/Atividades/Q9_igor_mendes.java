package Atividades;

import java.util.Scanner;

public class Q9_igor_mendes {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		String palavra = entrada.nextLine();
		int tamanho = palavra.length();
		palavra.toCharArray();
		char[] tempCharArray = new char[tamanho];
		char[] charArray = new char[tamanho];

		for (int i = 0; i < tamanho; i += 1) {
			tempCharArray[i] = palavra.charAt(i);
		}
		for (int j = 0; j < palavra.length(); j += 1) {
			charArray[j] = tempCharArray[tamanho - 1 - j];
		}
		String reversePalavra = new String(charArray);
		System.out.println(reversePalavra);
	}
}