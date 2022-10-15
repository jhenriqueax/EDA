/*
 * Uma palavra ou frase é um palíndromo caso possa ser lida tanto da esquerda para a direita,
 * como da direita para a esquerda, sem alterar seu sentido. Escreva um método que receba um array de char,
 * representando uma palavra,  e retorna um boolean. O método deve retornar true, caso a palavra seja um palíndromo, 
 * e false, caso o contrário. 
 */

import java.util.Scanner;

public class Palíndromo {
	
	public static void main(String[] args) {
		
		String status = "True";
		
		Scanner scan = new Scanner(System.in);
		String[] seq = scan.nextLine().split("");
		
		for (int i = 0; i < seq.length; i++) {
			
			String letra1 = seq[i];
			String letra2 = seq[(seq.length-1) -i];
			
			if(letra1.equals(letra2)){
				status = "True";
			}
			else {
				status = "False";
			}
		}
		System.out.println(status);
		scan.close();
		}

	}


