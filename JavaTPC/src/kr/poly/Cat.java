package kr.poly;

public class Cat extends Animal {
    public void night() {
        System.out.println("밤에 눈에서 빛이난다..");
    }

    @Override
    public void eat() {
        System.out.println("고양이처럼 먹는다..");
    }

    public Cat() {
        super();  // new Animal();
    }
}