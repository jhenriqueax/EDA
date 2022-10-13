import java.util.Scanner;

public class warmUp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // coletando o "\n"
        String seq = sc.nextLine();
        String[] novaSeq = seq.split(" ");
        for (String num : novaSeq) {
            int inteiro = Integer.parseInt(num);
            int novo = inteiro * n;
            System.out.print(novo);
            if (num != novaSeq[novaSeq.length - 1]){
            System.out.print(" ");
            }
        }
        System.out.println();
    }
}