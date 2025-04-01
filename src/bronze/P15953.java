package bronze;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//상금 헌터
public class P15953 extends Exception {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb  = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        int[][] data = new int[num][2];
        for(int i = 0; i < num; i++){
            String[] input = br.readLine().split(" ");
            data[i][0] = Integer.parseInt(input[0]);
            data[i][1] = Integer.parseInt(input[1]);
        }


        for(int i = 0; i < num; i++){
            int money = 0;
            int first = data[i][0];
            if(first== 0){
                money += 0;
            }else {
                if (first == 1) {
                    money += 5000000;
                } else if (first <= 3) {
                    money += 3000000;
                } else if (first <= 6) {
                    money += 2000000;
                } else if (first <= 10) {
                    money += 500000;
                } else if (first <= 15) {
                    money += 300000;
                } else if (first <= 21) {
                    money += 100000;
                } else {
                    money += 0;
                }
            }

            int second = data[i][1];
            if(second== 0){
                money += 0;
            }else {
                if (second == 1) {
                    money += 5120000;
                } else if (second <= 3) {
                    money += 2560000;
                } else if (second <= 7) {
                    money += 1280000;
                } else if (second <= 15) {
                    money += 640000;
                } else if (second <= 31) {
                    money += 320000;
                } else {
                    money += 0;
                }
            }

            sb.append(money).append("\n");
        }

        System.out.println(sb.toString());

    }
}
