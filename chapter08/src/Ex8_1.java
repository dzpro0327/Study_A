public class Ex8_1 {
    public static void main(String[] args) {
        System.out.println(1);
        try {
            System.out.println(2);
            System.out.println(3);
        } catch (Exception e) {
            System.out.println(4);  // try 블럭안에 예외가 생겨야 발생
        }
        System.out.println(5);
    }
}
