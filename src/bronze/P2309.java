package bronze;

import java.util.Arrays;
import java.util.Scanner;

public class P2309 {
    public static void main(String[] args) {
        int[] num = new int[9];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        sc.close();

        // 모든 난쟁이의 키의 합을 계산합니다.
        int sum = Arrays.stream(num).sum();

        // 정렬
        Arrays.sort(num);

        int a = 0, b = 0;
        boolean found = false;

        // 두 난쟁이를 찾습니다.
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (sum - num[i] - num[j] == 100) { // 총합에서 두 난쟁이의 키를 뺀 값이 100이면
                    a = i;
                    b = j;
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        // 정답 출력
        for (int i = 0; i < num.length; i++) {
            if (i != a && i != b) {
                System.out.println(num[i]);
            }
        }
    }
}
