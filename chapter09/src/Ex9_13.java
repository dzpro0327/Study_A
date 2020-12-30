import static java.lang.Math.*;

public class Ex9_13 {
    public static void main(String[] args) {
        double val = 90.7552;
        System.out.println(round(val));  // 91

        val *= 100;
        System.out.println(round(val));  // 9076

        System.out.println(round(val) / 100);  // 0.91
        System.out.println(round(val) / 100.0);  // 90.76
        System.out.println();

        System.out.println(ceil(1.1));  // 2.0
        System.out.println(floor(1.5));  // 1.0
        System.out.println(round(1.1));  // 1.0
        System.out.println(round(1.5));  // 2.0
        System.out.println(rint(1.5));  // 2.0
        System.out.println(round(-1.5));  // -1
        System.out.println(rint(-1.5));  // -2.000000
        System.out.println(ceil(-1.5));  // -1.0000000
        System.out.println(floor(-1.5));  // -2.000000

    }
}
