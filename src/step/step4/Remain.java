package step.step4;

import java.util.HashSet;
import java.util.Scanner;
//어려움 못 풀었음. - Hash set이 쉽긴 하다. - 배열로 다시 도전해보기
public class Remain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> remains = new HashSet<>();

        for(int i=0 ; i<10; i++){
            remains.add(sc.nextInt()%42);
        }
        sc.close();
        System.out.println(remains.size());
    }
}
