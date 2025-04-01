package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//보너스 점수
public class P17389 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        char[] ox = s.toCharArray();

        int sum = 0;
        int bonus = 0;
        for(int i = 0; i < ox.length; i++){
            if(ox[i]=='O'){
                bonus++;
                sum += i+bonus;
            } else {
                bonus = 0;
            }
        }
        System.out.println(sum);
    }
}
