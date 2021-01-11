import kr.poly.A;

public class TPC28 {
    public static void main(String[] args) {
        A a = new A();
        a.display();
        System.out.println(a.toString());  // 재정의 toString 메서드
        System.out.println(a);  // object클래스의 toString이 실행

        Object o = new A();
        ((A) o).display();
        System.out.println(o);  // 재정의된 메서드가 나옴
    }
}
