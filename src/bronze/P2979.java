package bronze;

import java.io.IOException;
import java.util.Scanner;

//트럭주차
public class P2979 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int ans = 0;

        int[] time = new int[101];

        for(int i = 0; i<3 ; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();

            for(int j = start; j<end;j++){
                time[j]++;
            }
        }
        for(int i : time){
            if(i==1){ //하나
                ans += i*a;
            }else if(i==2){ //둘
                ans += i*b;
            }else if(i==3){ //셋
                ans += i*c;
            }
        }

        System.out.println(ans);


    }
}
