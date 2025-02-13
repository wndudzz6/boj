package step.step4;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] students = new int[30];

        for (int i= 0; i < 28; i++) {
            int n = scanner.nextInt();
            students[n-1] = n; //0칸에 1번
        }
        for (int i = 0; i < students.length; i++) {
            if(students[i] == 0)
            {
                System.out.println(i+1);
            }
        }

    }
}
