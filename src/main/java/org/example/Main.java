package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("== 명언 앱 ==");
        Scanner sc = new Scanner(System.in);
        String input;

        Map<Integer, 명언> 명언저장소 = new HashMap<>();
        int count = 1;

        String famous;
        String writer;

        while (true) {
            System.out.print("명령) ");
            input = sc.nextLine();
            if (input.equals("종료")) {
                break;
            }

            if (input.equals("등록")) {
                System.out.print("명언 : ");
                famous = sc.nextLine();
                System.out.print("작가 : ");
                writer = sc.nextLine();
                명언저장소.put(count, new 명언(famous, writer));
                System.out.println( "1번 명언이 등록되었습니다.");

                //count++;

            }

        }
        sc.close();
    }
}

class 명언 {
    private String famous;
    private String writer;

    명언(String famous, String writer) {
        this.famous = famous;
        this.writer = writer;
    }
}