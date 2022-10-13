import java.util.Iterator;
import java.util.Scanner;

public class elementosDuplicados {

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
	}
}
