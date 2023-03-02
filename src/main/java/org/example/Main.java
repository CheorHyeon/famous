package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("== 명언 앱 ==");
        System.out.print("명령) ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if(input.equals("종료"))
            System.out.println("명령) " + input);
    }
}