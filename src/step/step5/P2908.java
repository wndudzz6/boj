package step.step5;

import java.util.Scanner;

//상수
public class P2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();
        int x = Integer.parseInt(inverse(a));
        int y = Integer.parseInt(inverse(b));
        System.out.println(x>y ? x:y);
    }

    static String inverse(String a) {
        char[] chars = new char[a.length()];
        for (int i = 0; i < a.length(); i++) {
            chars[i] = a.charAt(a.length()-1-i);
        }
        return new String(chars);
    }
}
