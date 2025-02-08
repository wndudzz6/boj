package step.inout1;

import java.util.Scanner;

public class Thailand {

    public static void main(String[] args) {

        System.out.print("불기 연도를 입력해주세요 : ");
        Scanner sc = new Scanner(System.in);
        int num = 543;
        int y = sc.nextInt();
        if(y < 1000){
            System.out.println(" 1000<=y<=3000");
            return;
        }
        if (y>3000){
            System.out.println(" 1000<=y<=3000");
            return;
        }

        System.out.println("서기 연도: "+ (y-num));
    }

}
