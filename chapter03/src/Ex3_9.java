public class Ex3_9 {
    public static void main(String[] args) {
        int a = 1_000_000;  // 백만
        int b = 2_000_000;  // 이백만

        long c = a * b;

        System.out.println(c);  // int 형으로 연산하고 변수 c에 담기기 떄문에 오버플로 발생으로 기대값이 다르게 나온다..
    }
}
