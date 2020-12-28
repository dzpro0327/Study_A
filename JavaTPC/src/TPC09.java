public class TPC09 {
    public static void main(String[] args) {
        int a = 10, b = 20;

        TPC09 tpc09 = new TPC09();
        int add = tpc09.sum(a,b);
        System.out.println(add);
    }

    public int sum(int a, int b) {
        return a + b;
    }
}
