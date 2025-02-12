package step.step3;

import java.util.Scanner;

public class Sum5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int sum = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 && b == 0) {
                return;
            }
            sum = a + b;
            System.out.println(sum);
        }
    }
}
