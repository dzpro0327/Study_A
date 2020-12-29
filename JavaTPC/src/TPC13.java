import kr.tpc.BookDTO;

public class TPC13 {
    public static void main(String[] args) {
        // DTO~~ 
        String title = "스프링";
        int price = 15000;
        String company = "제이펍";
        int page = 890;

        BookDTO dto; // dto(Object: 객체)
        dto = new BookDTO("JSP", 750, 15000, "길벗"); // dto(Instance: 인스턴스)
        bookPrint(dto);

    }

    public static void bookPrint(BookDTO bookDTO) {
        System.out.println(bookDTO.title);
        System.out.println(bookDTO.price);
        System.out.println(bookDTO.page);
        System.out.println(bookDTO.company);
    }
}
