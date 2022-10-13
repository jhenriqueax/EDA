import java.util.Arrays;
import java.util.Scanner;

public class InsereUltimo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String[] array = scan.nextLine().split(" ");

		int ultimo = Integer.parseInt(array[array.length - 1]);
		for (int i = 0; i < array.length; i++) {
			int compara = Integer.parseInt(array[i]);

			if (ultimo < compara) {
				String buffer = array[i];
				array[i] = Integer.toString(ultimo);
				ultimo = Integer.parseInt(buffer);
			}

		}
		array[array.length - 1] = Integer.toString(ultimo);
		
		System.out.println(Arrays.toString(array));

	}

}
