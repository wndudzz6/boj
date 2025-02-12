package step.step3;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum = a + b;
            System.out.println(sum);

        }
    }
}
