import java.util.Iterator;
import java.util.Scanner;

public class trocaVizinhos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] seq = scan.nextLine().split(" ");

		int tamanho = seq.length;

		if (tamanho % 2 == 0) {

			for (int i = 0; i < seq.length; i += 2) {

				String buffer = seq[i];
				seq[i] = seq[i + 1];
				seq[i + 1] = buffer;

			}
		}

		else {

			for (int i = 0; i < seq.length -1; i += 2) {

				String buffer = seq[i];
				seq[i] = seq[i + 1];
				seq[i + 1] = buffer;

			}
		}

		for (int i = 0; i < seq.length; i++) {
			System.out.print(seq[i] + " ");
		}

	}
}
