import kr.tpc.BookVO;

public class TPC12 {
    public static void main(String[] args) {
        // 생성자 --> 객체를 생성, 초기화 --> 생성자메서드를 중복정의 가능
        BookVO b1 = new BookVO();
        BookVO b2 = new BookVO("자바", 15000, "자바", 700);

    }
}
