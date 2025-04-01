package bronze;

import java.util.Scanner;

//블랙잭
public class P2789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] cards = new int[n];
        for(int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }

        int result = search(cards, n, m);
        System.out.println(result);
    }

    static int search(int[] cards, int n, int m) {
        int result = 0;
        //3개를 고르기 때문에 첫번째 카드는 n-2까지만 순회
        for(int i = 0; i < n-2 ; i++) {
            //두번째 카드: 첫번째 카드 다음부터 n-1까지 순회
            for(int j = i+1; j < n-1 ; j++) {
                //세번째 카드 : 두번째 카드 다음부터 n까지 순회
                for(int k = j+1; k < n ; k++) {
                    int tmp = cards[i] + cards[j] + cards[k];
                    if(tmp == m) {
                        result = tmp;
                    }

                    if(result < tmp && tmp < m ) {
                        result = tmp; //m을 넘지 않는 한도 내에서 기존 result보다 크면 반영
                    }
                }
            }
        }
        return result;
    }
}
