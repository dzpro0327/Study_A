public class Ex8_3 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0/0);  // 예외처리
            System.out.println(4);  // 실행 x
        } catch (Exception e) {
            System.out.println(5);  // 예외가 생겼기 때문에 실행
        }

        System.out.println(6);
    }
}
