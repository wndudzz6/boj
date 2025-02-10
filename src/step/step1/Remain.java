package step.step1;

import java.util.Scanner;

public class Remain {

    public static void main(String[] args) {
        System.out.println("(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?");
        System.out.println("(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?");


        System.out.println("(2 ≤ A, B, C ≤ 10000)");
        Scanner sc = new Scanner(System.in);
        System.out.println("A B C 입력");
        String input = sc.nextLine();
        String[] abc = input.split(" ");

        int a = Integer.parseInt(abc[0]);
        int b = Integer.parseInt(abc[1]);
        int c = Integer.parseInt(abc[2]);

        System.out.println((a+b)%c);
        System.out.println(((a%c) + (b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c) * (b%c))%c);
    }
}
