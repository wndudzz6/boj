package bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

//피보나치 수
public class P2747 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] F = new int[n+1];
        F[0] = 0;
        F[1] = 1;
        for(int i=2;i<=n;i++){
            F[i] = F[i-1] + F[i-2];
        }
        System.out.print(F[n]);
    }
}
