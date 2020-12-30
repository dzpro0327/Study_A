import kr.tpc.MovieVO;

public class TPC16 {
    public static void main(String[] args) {

        int[] a = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        int[] b = {10, 20, 30, 40, 50};

        int[] c = new int[]{10, 20, 30, 40, 50};

        for (int i : b) {
            System.out.println(i);
        }

        System.out.println("=========================================================");
        System.out.println("=========================================================");
        System.out.println("=========================================================");
        System.out.println("=========================================================");


        MovieVO mv1 = new MovieVO("비트", 12000, "정우성", 12, 1.3f);
        System.out.println(mv1);

        MovieVO[] marr = new MovieVO[3];
        marr[0] = new MovieVO("비트1", 12000, "정우성", 12, 1.3f);
        marr[1] = new MovieVO("비트2", 12000, "정우성", 12, 1.3f);
        marr[2] = new MovieVO("비트3", 12000, "정우성", 12, 1.3f);

        for (MovieVO m : marr) {
            System.out.println(m);
        }
    }
}
