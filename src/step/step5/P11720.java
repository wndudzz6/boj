package step.step5;

import java.util.Scanner;

public class P11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String num = sc.next();
        int[] nums = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        sc.close();
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        System.out.println(sum);
    }
    //굳이 배열을 만들어서 저장하지 않고 for문에서 int 형 변수에
    //num.charAt(i)-'0'을 일일이 넣어서 더할 수도 있다.
}
