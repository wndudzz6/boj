package bronze;

import java.util.Scanner;

public class P1652 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] room = new char[n][n];
        for (int i = 0; i < n; i++) {
            room[i] = sc.next().toCharArray();
        }

        int horizontal = 0, vertical = 0;

        // 가로 방향 누울 자리 찾기
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (room[i][j] == '.') {
                    count++;
                } else {
                    if (count >= 2) horizontal++;
                    count = 0;
                }
            }
            if (count >= 2) horizontal++;  // 행의 끝에 도달했을 때 확인
        }

        // 세로 방향 누울 자리 찾기
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (room[j][i] == '.') {
                    count++;
                } else {
                    if (count >= 2) vertical++;
                    count = 0;
                }
            }
            if (count >= 2) vertical++;  // 열의 끝에 도달했을 때 확인
        }

        System.out.println(horizontal + " " + vertical);
    }
}
