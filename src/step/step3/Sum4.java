package step.step3;

import java.util.Scanner;

public class Sum4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int j = 1; j <= n; j++) {
            int sum = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += a + b;
            System.out.println("Case #"+j+": "+a+" + "+b+" = "+sum);
        }
    }
}
