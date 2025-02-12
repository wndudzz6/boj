package step.step3;

import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.nextLine();
        int y = scanner.nextInt();
        int sum = 0;
        for(int i =0; i<y;i++){
            int price = scanner.nextInt();
            int quantity = scanner.nextInt();
            sum += price*quantity;
        }
        if(sum == x){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}
