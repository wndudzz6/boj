package bronze;

import java.util.Scanner;

//더하기 사이클 문제를 일단 이해하는 것이 중요하고 논리에 맞게 %와 /를 쓴다
public class P1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = n;
        sc.close();

        int count = 0;
        while(true) {
            n = (n%10*10) + ((n/10+n%10)%10);
            count++;
            if(start == n) {
                break;
            }
        }
        System.out.println(count);

    }
}
