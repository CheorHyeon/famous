package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("== 명언 앱 ==");
        System.out.print("명령) ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String famous;
        String writer;

        while (true) {
            if (input.equals("종료")) {
                break;
            }

            if (input.equals("등록")) {
                System.out.print("명언 : ");
                famous = sc.nextLine();
                System.out.print("작가 : ");
                famous = sc.nextLine();
                System.out.print("명령) ");
                input = sc.nextLine();
            }

        }
    }
}