/*
 * Escreva um programa que recebe uma sequência e verifica se esta possui ou não elementos duplicados.
 */

import java.util.Scanner;

public class checagemDeElementosDuplicados {

	public static void main(String[] args) {
		
		String retorno = "False";

		Scanner scan = new Scanner(System.in);
		String[] array = scan.nextLine().split(" ");

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].equals(array[j])) {
					retorno = "True";
					break;
				}
			}
		}
		System.out.println(retorno);
		scan.close();
	}
	
}