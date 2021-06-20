package Atividades;

import java.util.Scanner;

public class Q8_igor_mendes {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		for (int cont = 0; cont < 5; cont += 1) {
			String valTeste = entrada.nextLine();
			if (valTeste.equals(args[0])) {
				System.out.println("Esse programa não possui menu de ajuda");
				break;
			}
		}
	}
}
