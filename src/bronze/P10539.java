package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//수빈이와 수열
public class P10539 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n+1];
        int[] B = new int[n+1];

        String[] s = br.readLine().split(" ");

        for(int i = 1; i <= n; i++) {
            B[i] = Integer.parseInt(s[i-1]);
        }
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            A[i] = B[i]*i - sum;
            sum += A[i];
        }
        for(int i = 1; i <= n; i++) {
            System.out.print(A[i]+" ");
        }

    }
}
