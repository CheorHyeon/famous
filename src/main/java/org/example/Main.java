package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("== 명언 앱 ==");
        Scanner sc = new Scanner(System.in);
        String input;

        List<명언> 명언저장소 = new ArrayList<>();
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
                명언저장소.add(new 명언(count, famous, writer));
                System.out.println(count + "번 명언이 등록되었습니다.");
                count++;
            }

            if (input.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println(("___________________"));
                for(int k = 명언저장소.size()-1; k>=0; k--){
                    System.out.printf("%d / %s / %s \n", (k+1), 명언저장소.get(k).getFamous(), 명언저장소.get(k).getWriter() );
                }
                }
        }
        sc.close();
    }
}

class 명언 {
    public String getFamous() {
        return famous;
    }

    public String getWriter() {
        return writer;
    }

    private String famous;
    private String writer;

    private int num;

    명언(int num, String famous, String writer) {
        this.num = num;
        this.famous = famous;
        this.writer = writer;
    }
}