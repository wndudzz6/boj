package step.step5;

import java.util.Scanner;
//ASCII
public class P11654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ascii = str.charAt(0);
        //int ascii = sc.next().charAt(0) 으로 한번에 끝낼 수 있음
        sc.close();
        System.out.println(ascii);
    }
}
