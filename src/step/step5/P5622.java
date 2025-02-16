package step.step5;

import java.util.Scanner;

//다이얼
public class P5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int[] quantity = new int[10];
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(ch=='A'||ch=='B'|| ch=='C'){
                quantity[1]++;
            } else if(ch=='D'||ch=='E'||ch=='F') {
                quantity[2]++;
            } else if(ch=='G'||ch=='H'||ch=='I') {
                quantity[3]++;
            } else if(ch=='J'||ch=='K'||ch=='L') {
                quantity[4]++;
            }else if (ch=='M'||ch=='N'||ch=='O') {
                quantity[5]++;
            }else if (ch=='P'||ch=='Q'||ch=='R'||ch=='S') {
                quantity[6]++;
            }else if (ch=='T'||ch=='U'||ch=='V') {
                quantity[7]++;
            }else if (ch=='W'||ch=='X'||ch=='Y'||ch=='Z') {
                quantity[8]++;
            }
        }
        int time = 0;
        for (int i = 0; i < quantity.length; i++) {
            time+=(quantity[i]*(i+2));
        }
        System.out.println(time);



    }
}
