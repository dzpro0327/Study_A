import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {
    public static void main(String[] args) {
        // 관계를 이해하라.. PDT(기본형) UDDT(참조형)

        // 정수 1개를 저장하기 위한 변수를 선언하세요.
        int a;  // 변수 선언..
        a = 10;

        // 책 1권을 저장하기위한 변수를 선언하시오..
        Book b = new Book();
        b.company = "인프런";
        b.title = "자바TPC";
        b.price = 15000;
        b.page = 134;

        System.out.println(b.title);
        System.out.println(b.company);
        System.out.println(b.page);
        System.out.println(b.price);

        System.out.println("======================");
        System.out.println("======================");

        PersonVO p = new PersonVO();
        p.name = "이동주";
        p.age = 26;
        p.height = 186.5f;
        p.weight = 77.5f;

        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.height);
        System.out.println(p.weight);

        System.out.println("===============");
        System.out.println("===============");


    }
}
