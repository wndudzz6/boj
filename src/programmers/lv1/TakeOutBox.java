package programmers.lv1;

import java.util.Scanner;

public class TakeOutBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int num = sc.nextInt();
        int answer = solution(n,w,num);
        System.out.println("총 꺼내야할 상자의 수: "+answer);
        sc.close();
    }

    //n : 택배 상자 개수 w : 한 층당 상자 개수  num : 빼야할 상자 번호
   static int solution(int n, int w, int num) {
        int answer = 0;
        int h = (n+w-1)/w; //상자 총 개수를 너비로 나누어서 올림

       int[][] boxes = new int[h][w];
       int currentNum = 1;

       for (int i = 0; i < h; i++) {
           if (i % 2 == 0) { // 짝수층: 왼쪽에서 오른쪽으로 채우기
               for (int j = 0; j < w && currentNum <= n; j++) {
                   boxes[i][j] = currentNum++;
               }
           } else { // 홀수층: 오른쪽에서 왼쪽으로 채우기
               for (int j = w - 1; j >= 0 && currentNum <= n; j--) {
                   boxes[i][j] = currentNum++;
               }
           }
       }

       //상자 번호의 위치 찾기
       int numRow = 0;
       int numCol = 0;
       for(int i=0; i<h; i++) {
           for(int j=0; j<w; j++) {
               if(boxes[i][j] == num) {
                   numRow = i;
                   numCol = j;
                   break;
               }
           }
       }
       for(int i = numRow-1; i>=0; i--) {
           if(boxes[i][numCol] != 0) {
               answer++;
           }
       }
        return answer+1;
    }


}
