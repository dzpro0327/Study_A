import kr.tpc.BookDTO;

public class TPC10 {
    public static void main(String[] args) {
        int a;
        a = 10;

        BookDTO b;
        b = new BookDTO();  // stack에 올림

        b.price = 15000;
        b.title = "자바의 정석";
        b.company = "도우 출판사";
        b.page = 700;

        System.out.println(b.title);
        System.out.println(b.page);
        System.out.println(b.price);
        System.out.println(b.company);

    }
}

