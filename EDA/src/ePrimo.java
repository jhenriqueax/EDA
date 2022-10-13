import java.util.Scanner;

public class ePrimo {

	public static void main(String[] args) {

		int contador = 0;
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		for (int i = 1; i <= num; i++) {
			int novo = i;
			if (num % novo == 0) {
				contador += 1;
				if (contador > 2) {
					System.out.println("Não é primo");
					break;
				}
				if(contador == 2 && i == num ) {
					System.out.println("É primo");
				}
				
			}
			

		}
	}
}