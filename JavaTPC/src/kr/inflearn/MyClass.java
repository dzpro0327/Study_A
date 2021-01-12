package kr.inflearn;

// default 패키지 밖에서는 접근 못함.
// 보통은 public
public class MyClass {
    public int sum(int a, int b) {
        int hap = 0;

        for (int i = a; i <= b; i++) {
            hap += i;
        }

        return hap;
    }
}
