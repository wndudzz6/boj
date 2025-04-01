package bronze;

import java.util.Scanner;

//음계
public class P2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[8];  // 음계는 8개의 숫자로 구성됩니다.
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < 8; i++) {
            num[i] = sc.nextInt();  // 숫자를 바로 정수 배열에 저장
        }
        sc.close();

        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] + 1 != num[i + 1]) {  // 연속적으로 1씩 증가하지 않으면
                ascending = false;
            }
            if (num[i] - 1 != num[i + 1]) {  // 연속적으로 1씩 감소하지 않으면
                descending = false;
            }
        }

        if (ascending) {
            System.out.println("ascending");
        } else if (descending) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
