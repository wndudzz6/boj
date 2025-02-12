package step.step3;

import java.util.Scanner;
//10분 안에 생각 못함; 별은 너무 헷갈려 삼중첩이 아닌 for문 3개가 포인트
public class Star2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= N - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
