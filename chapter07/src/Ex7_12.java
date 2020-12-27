public class Ex7_12 {

    // 내부 클래스
    class InstanceInner {
        int iv = 100;
        final static int CONST = 100;
    }

    static class StaticClass {
        int iv = 200;
        static int cv = 200;
    }

    // Ex7_12 클래스의 메서드
    void myMethod() {
        class LocalInner {
            int iv = 300;
            final static int CONST = 300;
        }
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticClass.cv);
    }
}
