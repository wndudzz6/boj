package remind.w;

import java.util.Scanner;

//2. 수열과 어떤 숫자가 주어졌을 때
// 수열의 연속된 항의 합이 이 숫자보다 커지는 최소한의 항의 개수
public class SequenceSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {1, 3, 5, 6, 2, 3, 4, 10}; //내가 대충 적음
        sc.close();
        System.out.println(solution(arr, n));
    }

    static int solution(int[] arr , int n){
        int answer = 100;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            int count = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                count++;
                if (sum >= n) {
                    answer = Math.min(answer, count);
                    break;
                }
            }
        }

        return answer;
    }
}


