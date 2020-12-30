package kr.tpc;

public class Myutil {
    int a = 0;

    public int hap(int a) {
        this.a = a;
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        return sum;
    }
}
