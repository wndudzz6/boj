package step.step4;

import java.util.Scanner;

public class LessThanX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int [] nums = new int[n];
        //for-each 문은 초깃값인 0으로 모든 요소 설정됨 xx
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
            if(nums[i] < x){
                System.out.print(nums[i]+" ");
            }
        }
    }
}
