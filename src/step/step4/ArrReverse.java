package step.step4;

import java.util.Scanner;
//temp를 배열로 선언하고 넣는거까진 됐는데
// 기존 배열의 어느 부분부터 시작해야할지 헷갈려서 오래걸림
//변수로 선언 후 하나 하나 넣자. while이 좋은듯
public class ArrReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int temp = 0;
        int[] baskets = new int[n];
        for(int i = 0; i < baskets.length; i++){
            baskets[i] = i+1;
        }

        for(int i =0; i < m; i++){
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            while(a<b){
                temp = baskets[a];
                baskets[a] = baskets[b];
                baskets[b] = temp;
                a++;
                b--;
            }
        }sc.close();
        for(int i = 0; i < baskets.length; i++){
            System.out.print(baskets[i]+" ");
        }

    }
}
