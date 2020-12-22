public class prac01 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;

        int tmp1, tmp2 = 0;

        tmp1 = x; // tmp = 1;
        tmp2 = y; // tmp = 2;

        y = z; // y = 3;
        z = tmp1; // z = 1;
        x = tmp2; // x = 2;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
