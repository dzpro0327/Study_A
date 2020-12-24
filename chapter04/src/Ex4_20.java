import java.util.Scanner;

public class Ex4_20 {
    public static void main(String[] args) {

        int menu = 0, num = 0;
        Scanner scanner = new Scanner(System.in);

        outer:
        while (true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료:0)>");

            String tmp = scanner.nextLine();
            menu = Integer.parseInt(tmp);

            if (menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (!(1 <= menu && menu <= 3)) {
                System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
                continue;
            }

            for (; ; ) {
                System.out.println("계산할 값을 입력하세요.(계산 종료:0, 전체 종료:99)>");
                tmp = scanner.nextLine();
                num = Integer.parseInt(tmp);

                if (num == 0)
                    break;  // for 문을 벗어나고 다시 while 문 조건식으로 돌아감...

                if (num == 99)
                    break outer; // while 문을 벗어남...

                switch (menu) {
                    case 1:
                        System.out.println("result=" + num * num);
                        break;
                    case 2:
                        System.out.println("result=" + Math.sqrt(num));
                        break;
                    case 3:
                        System.out.println("result=" + Math.log(num));
                        break;
                }  // switch
            }  // for
        }  // while
    }  // main
}
