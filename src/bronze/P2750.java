package bronze;

import java.util.*;

//수 정렬하기
public class P2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i<n; i++) {
            nums[i] = sc.nextInt();
            sc.nextLine();
        }
        sc.close();
        Arrays.sort(nums);
        for(int i = 0; i<n; i++) {
            System.out.println(nums[i]);
        }
    }

}
