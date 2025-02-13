package step.step4;

import java.util.Scanner;

public class MaxOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[9];
        int max = 0;
        int order = 0;
        for(int i =0; i<nums.length; i++){
            nums[i] = sc.nextInt();
            sc.nextLine();
            if(nums[i]>max){
                max = nums[i];
                order = i;
            }
        }
        System.out.println(max);
        System.out.println(order+1);
    }
}
