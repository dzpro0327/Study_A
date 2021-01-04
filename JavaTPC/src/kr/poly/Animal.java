package kr.poly;

public abstract class Animal {
    public abstract void eat(); // 불완전한 메서드, 추상 메서드
    public void move() {
        System.out.println("움직인다.");
    }
}
