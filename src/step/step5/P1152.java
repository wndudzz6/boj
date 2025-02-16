package step.step5;

import java.util.Scanner;

//단어의 개수
public class P1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        if(s.isEmpty()){
            System.out.println(0);
        } else {
            String[] split = s.split(" ");//하나 이상의 공백으로 문자열 분리
            System.out.println(split.length);
        }
    }
}
