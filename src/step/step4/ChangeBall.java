package step.step4;

import java.util.Scanner;

public class ChangeBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums = new int[n];
        sc.nextLine();
        for(int i = 0; i < n; i++){
            nums[i] = i+1;
        }
        for(int i = 0; i < m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = nums[a-1]; //중간 꼭 필요함
            nums[a-1] = nums[b-1];
            nums[b-1] = c;
        }

        for(int num : nums){
            System.out.print(num+" ");
        }
    }
}
