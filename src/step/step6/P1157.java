package step.step6;

import java.util.Scanner;

//단어공부
public class P1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine().toUpperCase();
        int[] alphabet = new int[26];
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) >='A' && word.charAt(i) <='Z'){
                alphabet[word.toUpperCase().charAt(i) - 'A']++;
            }
        }
        int max = -1;
        char result = '?';
        for(int i = 0; i < alphabet.length; i++){
            if(alphabet[i] > max){
                max = alphabet[i];
                result = (char)(i+65);
            }
            else if(alphabet[i] == max){
                result = '?';
            }
        }
        System.out.println(result);


    }
}
