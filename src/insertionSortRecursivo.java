
/**
 * Escreva um programa que ordena um array de inteiros utilizando o insertion sort. 
 * No entanto, dessa vez, sua implementação deve ser recursiva.
 * Seu programa deve imprimir o status do array a inserção ordenada (exceto a primeira).
 */

import java.util.Arrays;
import java.util.Scanner;

public class insertionSortRecursivo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[] array = scan.nextLine().split(" ");

		scan.close();

		insertionSort(array);

	}

	public static void insertionSort(String[] array) {

		for (int j = 1; j < array.length; j++) {

			int i = array.length - 1;

			while (i > 0 && Integer.parseInt(array[i]) < Integer.parseInt(array[i - 1])) {

				String buffer = array[i];
				array[i] = array[i - 1];
				array[i - 1] = buffer;
				i--;

			}
		}
		System.out.println(Arrays.toString(array));
	}

}