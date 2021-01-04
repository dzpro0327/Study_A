package kr.poly;

public interface RemoCon {  // 객체생성 x
    // abstract 생략되어 있음..
    public void chUp();
    public void chDown();
    public void internet();

    // 상수
    public static final int MAXCH = 100;
    public static final int MINCH = 1;

}
