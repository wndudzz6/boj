package step.inout1;

import java.util.Scanner;

public class Juonnas {

    public static void main(String[] args) {
        String id = "joonas";

        System.out.println("[회원가입]");
        Scanner sc = new Scanner(System.in);
        String inputId = sc.nextLine();

        if(inputId.equals(id)){
            System.out.println("joonas??!");
        }
    }

}




