import com.sun.source.doctree.SummaryTree;

import java.util.Arrays;

public class TPC06 {
    public static void main(String[] args) {
        // 5. 메서드 --> 동작(method), 기능(function)
        int a = 67;
        int b = 98;
        int result = add(a, b);

        System.out.println(result);

        System.out.println("=================");

        int[] arr = makeArr();
        int hop = 0;
        for (int i = 0; i < arr.length; i++) {
            hop += arr[i];
        }
        System.out.println(hop);

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int[] makeArr() {
        int x = 10;
        int y = 20;
        int z = 30;

        int[] arr = {x, y, z};

        return arr;
    }
}
