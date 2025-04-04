package remind.w;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

//4번 가장 작은 제곱수를 차례대로 배열에 넣는 문제. 구현이 안됨
public class SpecialSquareSequence {
    public static void main(String[] args) {
        int n = 10; // 배열의 크기
        List<Integer> squares = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();

        // 1^1을 먼저 추가
        squares.add(1);
        seen.add(1);

        // 모든 가능한 base에 대해 exponent를 증가시키며 제곱 계산
        for (int base = 2; base <= n; base++) {
            int exponent = 2;
            while (true) {
                int value = (int) Math.pow(base, exponent);
                if (value > Math.pow(n, exponent)) break; // 너무 큰 값은 계산하지 않음
                if (!seen.contains(value)) {
                    squares.add(value);
                    seen.add(value);
                }
                exponent++;
            }
        }

        // 리스트 정렬
        Collections.sort(squares);

        // 배열에 값 할당
        int[] sequence = new int[n];
        for (int i = 0; i < n; i++) {
            sequence[i] = squares.get(i);
        }

        // 배열 출력
        for (int i = 0; i < n; i++) {
            System.out.println("Term " + (i + 1) + ": " + sequence[i]);
        }
    }
}
