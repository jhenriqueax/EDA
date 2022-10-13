import java.util.Scanner;

public class somaDois {

	public static void main(String[] args) {
		
		String[] array;

		Scanner scan = new Scanner(System.in);
		String[] seq = scan.nextLine().split(" ");
		int valor = scan.nextInt();

		for (int i = 0; i < seq.length; i++) {
			for (int j = i + 1; j < seq.length; j++) {

				int num = Integer.parseInt(seq[i]);
				int num2 = Integer.parseInt(seq[j]);
				
				if(num + num2 == valor){
					System.out.printf("[%d,%d]",num, num2);
					
					break;
				}

			}
		}
	}
}