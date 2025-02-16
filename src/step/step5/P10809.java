package step.step5;

import java.util.Scanner;

//알파벳 찾기 문제 이해가 잘 안됨
public class P10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[26];
        for(int i=0;i<arr.length;i++){
            arr[i]=-1;
        }
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(arr[ch-'a']==-1){
                arr[ch-'a']=i; //위치를 넣음
            }
        }
        for(int n : arr){
            System.out.print(n+" ");
        }
    }

}
