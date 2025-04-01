package bronze;

import java.util.Scanner;

//행복
public class P15969 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        for(int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        int max = scores[0];
        int min = scores[0];
        for(int i = 0; i < n; i++) {
            max = Math.max(max, scores[i]);
            min = Math.min(min, scores[i]);
        }
        System.out.println(max-min);
    }
}
