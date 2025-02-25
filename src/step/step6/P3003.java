package step.step6;

import java.util.Scanner;

public class P3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] chess = {1,1,2,2,2,8};
        int[] white = new int[chess.length];
        for(int i = 0; i < chess.length; i++){
            white[i] = sc.nextInt();
        }
        for(int i = 0; i < chess.length; i++){
            int diff=0;
            if(chess[i] != white[i]){
                diff = chess[i]-white[i];
            } else {
                diff = 0;
            }System.out.print(diff+" ");
        }
    }
}
