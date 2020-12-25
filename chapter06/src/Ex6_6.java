public class Ex6_6 {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println(d.x);  // 10;
        System.out.println("========================");

        change(d.x);  // 1000
        System.out.println(d.x);  // 10
        
    }

    static void change(int x) {
        x = 1000;
        System.out.println(x);
    }
}

class Data {
    int x;
}
