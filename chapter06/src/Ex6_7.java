public class Ex6_7 {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        System.out.println(d.x);  // 10;

        chage(d);  // 1000;
        System.out.println(d.x);  // 1000;

    }

    static void chage(Data2 d) {
        d.x = 1000;
        System.out.println(d.x);
    }
}

class Data2 {
    int x;
}