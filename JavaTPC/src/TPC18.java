import com.google.gson.Gson;
import kr.tpc.BookVO;
import kr.tpc.Myutil;

public class TPC18 {
    public static void main(String[] args) {

        // 1. java에서 제공해주는 class들.. API
        // 문자열(String)
        String str = new String("APPLE");
        System.out.println(str.toLowerCase());

        // 2. 직접 만들어서 사용하는 class들.. DTO/VO, DAO, Utility ... API
        Myutil my = new Myutil();
        System.out.println(my.hap(10));

        // 3. 다른 회사에서 만든 class들... API
        // Gson
        Gson g = new Gson();
        BookVO vo = new BookVO("자바", 13000, "영진", 800);
        String json = g.toJson(vo);
        System.out.println(json);

        
    }
}
