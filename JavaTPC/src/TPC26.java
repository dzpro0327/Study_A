import kr.poly.Radio;
import kr.poly.RemoCon;
import kr.poly.TV;

public class TPC26 {
    public static void main(String[] args) {
        RemoCon r = new TV();
        System.out.println("=========== TV =========");
        r.chUp();
        r.chDown();
        r.internet();

        r = new Radio();
        System.out.println("=========== Radio =========");
        r.chUp();
        r.chDown();
        r.internet();
    }
}
