package bronze;

import java.util.Scanner;

//주사위 세개
public class P2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a==b && a==c){
            System.out.print(10000+a*1000);
        } else if(a==b || a==c){
            System.out.print(1000+a*1000);
        } else if(b==c){
            System.out.print(1000+b*1000);
        } else {
            System.out.println(Math.max(Math.max(a,b),c));
        }
    }
}
