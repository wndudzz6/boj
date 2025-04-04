package bronze;

import java.util.Scanner;

//사과 담기 게임
public class P2828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int j = sc.nextInt();

        int answer = 0;
        int start = 1;
        int end =m;



        //사과 위치
        int[] loc = new int[j];
        for(int i = 0; i < j; i++){
            loc[i] = sc.nextInt();
        }
        sc.close();

    }
}
