import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex10_10 {
    public static void main(String[] args) {
        String pattern = "yyyy/MM/dd";
        DateFormat df = new SimpleDateFormat(pattern);
        Scanner s = new Scanner(System.in);

        Date inDate = null;

        System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요.. ( ex) 2021/01/01 ");

        while (s.hasNextLine()) {
            try {
                inDate = df.parse(s.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("날짜를 형태에 맞게 입력하세요..");
            }
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(inDate);
        Calendar today = Calendar.getInstance();
        long day = (calendar.getTimeInMillis() - today.getTimeInMillis()) / (60 * 60 * 1000);

        System.out.println("입력하신 날짜는 현재와 " + day + "시간 차이가 있습니다.");
    }
}
