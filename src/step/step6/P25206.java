package step.step6;

import java.util.Scanner;

//너의 평점은
public class P25206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[20];
        Double[] scores = new Double[20];
        String[] grades = new String[20];

        for(int i = 0; i <19; i++){
            names[i] = sc.next();
            scores[i] = sc.nextDouble();
            grades[i] = sc.next();
        }
        double sum = 0;
        int count = 0;
        for(int i = 0; i <19; i++){
            if(grades[i].equals("A+")){
                sum += 4.5 * scores[i];
                count+=scores[i];
            } else if(grades[i].equals("A0")){
                sum += 4.0* scores[i];
                count+=scores[i];
            }else if(grades[i].equals("B+")){
                sum += 3.5* scores[i];
                count+=scores[i];
            }else if(grades[i].equals("B0")){
                sum += 3.0* scores[i];
                count+=scores[i];
            }else if(grades[i].equals("C+")){
                sum += 2.5* scores[i];
                count+=scores[i];
            }else if(grades[i].equals("C0")){
                sum += 2.0* scores[i];
                count+=scores[i];
            }else if(grades[i].equals("D+")){
                sum += 1.5* scores[i];
                count+=scores[i];
            }else if(grades[i].equals("D0")){
                sum += 1.0* scores[i];
                count+=scores[i];
            }else if(grades[i].equals("F")){
                sum += 0;
                count+=scores[i];
            }else if(grades[i].equals("P")){
                count -= scores[i];
            }
        }
        System.out.println(sum/count);
    }
}
