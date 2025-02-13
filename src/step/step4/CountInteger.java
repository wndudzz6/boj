package step.step4;

import java.util.Scanner;

public class CountInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }sc.nextLine();
        int v = sc.nextInt();
        int count = 0;
        for (int num : nums) {
            if(num == v){
                count++;
            }
        }
        System.out.println(count);
    }
}
