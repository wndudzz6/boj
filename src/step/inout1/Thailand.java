package step.inout1;

import java.util.Scanner;

public class Thailand {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 543;
        int y = sc.nextInt();
        if(y < 1000 || y>3000){
            return;
        }

        System.out.println((y-num));
    }

}
