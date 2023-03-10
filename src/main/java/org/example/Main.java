package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("== 명언 앱 ==");
        Scanner sc = new Scanner(System.in);
        String input;

        List<명언> 명언저장소 = new ArrayList<>();
        int count = 1;  // 명언 번호 변수

        String famous;  // 명언
        String writer;  // 작가

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
                for (int k = 명언저장소.size() - 1; k >= 0; k--) {
                    System.out.printf("%d / %s / %s \n", 명언저장소.get(k).getNum(), 명언저장소.get(k).getFamous(), 명언저장소.get(k).getWriter());
                }
            }

            if (input.contains("삭제")) {
                String[] input_arr = input.split("=");
                int id = Integer.valueOf(input_arr[1]);
                명언 삭제명언 = null;

                for (int r = 0; r < 명언저장소.size(); r++) {
                    if (id == 명언저장소.get(r).getNum()) {
                        삭제명언 = 명언저장소.get(r);
                    }
                }

                if (삭제명언 == null) {
                    System.out.println(id + "번 명언은 존재하지 않습니다.");
                } else {
                    명언저장소.remove(삭제명언);
                    System.out.println(id + "번 명언이 삭제되었습니다.");
                }
            }

            if(input.contains("수정")) {
                String[] input_arr = input.split("=");
                int id = Integer.valueOf(input_arr[1]);
                명언 수정명언 = null ;


                for(int r = 0 ; r<명언저장소.size(); r++)
                {
                    if(id==명언저장소.get(r).getNum()) {
                        수정명언 = 명언저장소.get(r);
                    }
                }

                if(수정명언 ==null) {
                    System.out.println(id+ "수정할 명언은 존재하지 않습니다.");
                }
                else
                {
                    System.out.println("명언(기존) : " + 수정명언.getFamous());
                    System.out.print("명언 : ");
                    String temp = sc.nextLine();
                    수정명언.setFamous(temp);

                    System.out.println("작가(기존) : " + 수정명언.getWriter());
                    System.out.print("작가 : ");
                    String temp2 = sc.nextLine();
                    수정명언.setWriter(temp2);
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

        public void setFamous(String famous) {
            this.famous = famous;
        }

        public void setWriter(String writer) {
            this.writer = writer;
        }

        public void setNum(int num) {
            this.num = num;
        }

        private String famous;
        private String writer;

        public int getNum() {
            return num;
        }

        private int num;

        명언(int num, String famous, String writer) {
            this.num = num;
            this.famous = famous;
            this.writer = writer;
        }
    }