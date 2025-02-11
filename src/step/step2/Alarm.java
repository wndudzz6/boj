package step.step2;

import java.util.Scanner;

public class Alarm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        if(M<45){
            int d = 45-M;
            int m = 60-d;
            if(H == 0){
                int h = 23;
                System.out.println(h+" "+m);
            } else {
                int h = H-1;
                System.out.println(h+" "+m);
            }
        }else if(M>=45){
            int m = M-45;
            int h = H;

            System.out.println(h+ " "+m);
        }
    }
}
