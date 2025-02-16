package step.step5;

import java.util.Scanner;

public class P9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        sc.nextLine();
        for(int i=0;i<n;i++){
            String word = sc.nextLine();
            str[i] = word.substring(0,1)+word.substring(word.length()-1);
            //문자 두개를 합칠 때는 word.charAt(0)+word.charAt(word.length-1)로 하면 숫자가 나옴
            // 각각 char타입으로 반환해서 더하면 ASCII 값의 합
        }sc.close();
        for(int i=0;i<n;i++){
            System.out.println(str[i]);
        }
    }
}
