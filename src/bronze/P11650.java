package bronze;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//좌표정렬하기 (나이순 정렬 응용) list.sort(Comparator.comparingInt((Dot d) -> d.x)
                            //  .then(Comparator.comparintInt(Dot d) -> d.y));
public class P11650 {
    static class Dot{
        int x;
        int y;

        Dot(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Dot> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Dot(sc.nextInt(), sc.nextInt()));
        }
        sc.close();
        list.sort(Comparator.comparingInt((Dot d) -> d.x)
                .thenComparingInt((Dot d) -> d.y));
        for (Dot dot : list) {
            System.out.println(dot.x + " " + dot.y);
        }
    }

}
