import java.util.Calendar;

public class Ex10_2 {
    public static void main(String[] args) {
        final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};

        Calendar data1 = Calendar.getInstance();
        Calendar data2 = Calendar.getInstance();

        data1.set(2019, 3, 29);
        System.out.println(toString(data1) + DAY_OF_WEEK[data1.get(Calendar.DAY_OF_WEEK)]); // 날짜 지정
        System.out.println(toString(data2) + DAY_OF_WEEK[data2.get(Calendar.DAY_OF_WEEK)]); // 현재 날짜

        System.out.println("======================================================================");
        System.out.println("======================================================================");
        System.out.println("======================================================================");

        long difference = (data2.getTimeInMillis() - data1.getTimeInMillis()) / 1000;  // 지나온 시간 밀리 세컨으로 표시
        System.out.println(difference);
        System.out.println(difference / (24 * 60 * 60));  // 24*60*60 -----> 1일을 의미
    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE) + "일 ";
    }
}
