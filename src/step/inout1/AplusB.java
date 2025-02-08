package step.inout1;

import java.util.ArrayList;
import java.util.Scanner;

public class AplusB {
    public static void main(String[] args) {

        //ArrayList<Integer> numbers = new ArrayList<>();
        //근데 이걸 쓰려면 그만 받을 때까지 고려해야해서 코드가 길어짐
        int [] numbers = new int[2];
        System.out.println("A+B = ?");
        System.out.print("A B 입력 ");
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] parts = input.split(" ");

        for(int i=0; i<parts.length; i++){
            numbers[i] = Integer.parseInt(parts[i]);
        }

        int sum = 0;
        for (int num : numbers){
            sum += num;
        }
        System.out.print("A+B = "+sum);
    }
}
