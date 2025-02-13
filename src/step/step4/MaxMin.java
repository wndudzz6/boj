package step.step4;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] nums = new int[n];
        int max = -1000000;
        int min = 1000000;
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
            if (max<nums[i]){
                max = nums[i];
            }
            if(min>nums[i]){
                min = nums[i];
            }
        }
        System.out.println(min+" "+max);
        sc.close();
    }
}
