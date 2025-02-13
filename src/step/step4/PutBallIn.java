package step.step4;

import java.util.Scanner;

public class PutBallIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] baskets = new int[n];

        for(int i = 0; i < m; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            for(int j = x-1; j <= y-1; j++){
                baskets[j] = 0;
                baskets[j] = z;
            }
        }
        for(int basket : baskets){
            System.out.print(basket+" ");
        }
    }
}
