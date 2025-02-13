package step.step4;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        double max = 0;
        double sum = 0;
        double average = 0;
        sc.nextLine();
        double [] scores = new double[m];
        for (int i = 0; i < m; i++) {
            scores[i] = sc.nextDouble();
            if(scores[i] > max){
                max = scores[i];
            }
        }
        for (int i = 0; i < m; i++) {
            scores[i] = ((scores[i]/max))*100;
            sum += scores[i];
        }average = sum/m;
        System.out.println(average);
        sc.close();
    }
}
