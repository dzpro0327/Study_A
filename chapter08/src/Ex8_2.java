public class Ex8_2 {
    public static void main(String[] args) {
        System.out.println(1);

        try {
            System.out.println(2);
            System.out.println(0 / 0);  // 예외가 발생하면 실행문이 실행이 안된다..
        } catch (ArithmeticException e) {
            System.out.println(3);
        }
        System.out.println(4);
    }
}
