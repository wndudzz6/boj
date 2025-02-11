package step.step2;

import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dice1 = sc.nextInt();
        int dice2 = sc.nextInt();
        int dice3 = sc.nextInt();
        int price = 0;
        int max = 0;

        if(dice1==dice2 && dice1==dice3){
            price = dice1*1000+10000;
            System.out.println(price);
        } else if(dice1!=dice2 && dice1!=dice3 && dice2!=dice3){
            for(int i=0;i<3;i++){
                max = dice1;
                if(max < dice2)
                    max = dice2;
                if(max < dice3)
                    max = dice3;
            }
            price = max*100;
            System.out.println(price);
        }else{ //둘만 같고 하난 다름
            if(dice1==dice2){
                price = dice1*100+1000;
            } else if(dice1==dice3){
                price = dice1*100+1000;
            }else
                price = dice2*100+1000;

            System.out.println(price);
        }
    }
}
