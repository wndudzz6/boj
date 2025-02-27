package step.step6;

import java.util.Scanner;

//팰린드롬인지 확인하기
public class P10988 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int result = palindrome(word);
        System.out.println(result);
    }

    static int palindrome(String s) {
        for(int i = 0 ; i<s.length();i++) {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
                return 0;
        }
        return 1;
    }
}
