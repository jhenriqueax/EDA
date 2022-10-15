/**
 * Escreva um programa que leia um número inteiro N e uma sequência de inteiros
 * e multiplique cada elemento dessa sequência por N.
 */

import java.util.Scanner;

public class warmUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine(); // coletando o "\n"
        String seq = scan.nextLine();
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
        scan.close();
    }
}