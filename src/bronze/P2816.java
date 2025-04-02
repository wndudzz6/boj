package bronze;

import java.util.Scanner;

//디지털 티비 이해가 잘 안됨
public class P2816 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] channel = new String[n+1];
        for(int i = 1; i <= n; i++) {
            channel[i] = sc.next();
        }
        sc.close();
        int k = 0;
        while(!channel[0].equals("KBS1")) {
            if(k >=n){//배열의 크기 넘어가면 다시 처음으로
                k = 0;
            }
            if(channel[k].equals("KBS1")) {

            }
        }
    }
}
