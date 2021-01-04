package kr.poly;

public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("개처럼 먹는다.!! 왈왈!!");
    }

    public Dog() {
        super();  // new Animal();
    }
}
