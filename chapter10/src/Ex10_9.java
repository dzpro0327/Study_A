import java.text.*;
import java.util.*;

public class Ex10_9 {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일 k시 m분 s초");
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

        try {
            Date d = df.parse("2021년 1월 1일 10시 32분 20초");
            System.out.println(d);
            System.out.println(df2.format(d));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
