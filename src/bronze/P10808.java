package bronze;

import java.util.Scanner;

//알파벳 개수
public class P10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] alphabet = new int[26];
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            alphabet[ch[i] - 'a']++;
        }
        for (int i = 0; i < alphabet.length; i++) {
            System.out.print(alphabet[i] + " ");
        }
    }
}
