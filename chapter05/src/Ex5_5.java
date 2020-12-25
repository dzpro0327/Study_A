public class Ex5_5 {
    public static void main(String[] args) {
        int[] ball = new int[45];

        for (int i = 0; i < ball.length; i++)
            ball[i] = i + 1;  // 1 ~ 45 까지 배열에 넣는다..

        int tmp = 0;
        int j = 0;

        for (int i = 0; i < 6; i++) {
            j = (int) (Math.random() * 45);  // j = 0 ~ 44 중 아무 숫자를 가진다..
            tmp = ball[i];  // tmp 는 1 ~ 45 중 아무 숫자를 가진다.
            ball[i] = ball[j];  //
            ball[j] = tmp;
        }

        for (int i = 0; i < 6; i++) {
            System.out.printf("ball[%d]=%d%n", i, ball[i]);
        }
    }
}
