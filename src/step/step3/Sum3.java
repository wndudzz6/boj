package step.step3;

import java.util.Scanner;

public class Sum3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int sum = 0;
        for (int j = 1; j <= n; j++) {
            sum = 0;
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += a + b;
            System.out.println("Case #"+j+": "+sum);
        }


    }
}
