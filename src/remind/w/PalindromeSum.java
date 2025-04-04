package remind.w;

import java.util.Scanner;

//3번. 1~n까지의 수를 이진수로 바꿔서 팰린드롬인 수끼리 합을 반환 이야 이걸 못 풀어?
public class PalindromeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        for(int i = 1 ; i <= n ; i++) {
            if(isPalindrome(Integer.toBinaryString(i))){
                sum += i;
            }
        }
        System.out.println(sum);

    }

    static boolean isPalindrome(String s){
        String sr = new StringBuilder(s).reverse().toString();
        if(sr.equals(s)){
            return true;
        }
        return false;
    }
}
