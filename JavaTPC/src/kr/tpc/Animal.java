package kr.tpc;

public class Animal {
    String name;
    int age;
    String type;

    public void eat() {
        System.out.println("?"); // 포괄적, 추상적
    }

    public Animal() {
        super();  // new Object();
    }
}
