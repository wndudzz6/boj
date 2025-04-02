package bronze;

import java.util.Scanner;

//ROT13
public class P11655 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.nextLine().toCharArray();

        for(int i = 0; i < chars.length; i++){
            char ch = chars[i];

            if(ch >='A' && ch<='Z'){
                ch+=13;
                if(ch>'Z'){
                    ch-=26;
                }
            }else if (ch >='a' && ch<='z'){
                ch+=13;
                if(ch>'z'){
                    ch-=26;
                }
            }
            System.out.print(ch);
        }

    }
}
