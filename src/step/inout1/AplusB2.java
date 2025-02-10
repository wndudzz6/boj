package step.inout1;

import java.util.Scanner;

public class AplusB2 {

    public static void main(String[] args) {

        //조건에 맞게 다시 짜기
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[2];
        String input = sc.nextLine();
        String[] parts = input.split(" ");

        for(int i=0; i<parts.length; i++){
            numbers[i] = Integer.parseInt(parts[i]);
            if(numbers[i]<0 || numbers[i]>10)
                return;
        }

        int sum = 0;
        for (int num : numbers){
            sum += num;
        }

        System.out.println(sum);



    }
}
