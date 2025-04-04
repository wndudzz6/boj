package remind.w;

import java.util.Scanner;

//1. n개의 문을 n번 반복해서 열었다가 닫았다가 할거임. 처음에 모든 문을 연다
// ex) 2일 때 2의 배수인 문을 닫음  3일 때 3의 배수인 문을 닫음. (닫혀있는 문은 연다)
//n번 반복했을 때 열려있는 문의 개수는?

public class NDoor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }

    static int solution(int n) {
        int answer = 0;
        int[] door = new int[n+1]; //열려있는게 0
        for(int i = 2; i <= n; i++) {
            for(int j = i; j <= n; j = j+i) { //에라토스테네스 체
                if(door[j] == 0){
                    door[j] = 1;
                } else {
                    door[j] = 0;
                }
            }
        }
        for(int i = 1 ; i <= n; i++) {
            if(door[i] == 0){
                answer++;
            }
        }

        return answer;
    }
}
