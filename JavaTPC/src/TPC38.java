import kr.tpc.BookDTO;

import java.util.ArrayList;
import java.util.List;

public class TPC38 {
    public static void main(String[] args) {

        List<BookDTO> list = new ArrayList<>();
        list.add(new BookDTO("자바", 600, 1200, "이지스"));
        list.add(new BookDTO("C언어", 700, 17000, "에이콘"));
        list.add(new BookDTO("Python", 600, 15000, "제이펍"));

        for (Object o : list) {
            BookDTO vo = (BookDTO) o;
            System.out.println(vo.toString());
        }
    }
}