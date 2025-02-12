package step.step3;

import java.util.Scanner;

public class Byte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        n/=4;
        for(int i = 1; i <= n; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
