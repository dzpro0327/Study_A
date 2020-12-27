public class Ex7_2 {
    public static void main(String[] args) {
        Child child = new Child();
        child.method();
    }
}

class Parent {
    int x = 10;
}

class Child extends Parent{
    int x = 20;

    void method() {
        System.out.println("x = " + x);  // 20
        System.out.println("this.x = " + this.x);  // 20
        System.out.println("super.x = " + super.x);  // 10 --> 부모 클래스에 있는 맴버변수를 불러옴..
    }
}
