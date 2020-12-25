public class TPC07 {
    public static void main(String[] args) {

        int a = 20;
        float b = 56.7f;

        // call by value!!
        float v = sum(a, b);
        System.out.println(v);  // 76.7

        int[] arr = {1, 2, 3, 4, 5};

        // call by reference!!
        int v2 = sum1(arr);
        System.out.println(v2);

    }

    public static float sum(int a, float b) {
        float v = a + b;
        return v;
    }

    public static int sum1(int[] a) {
        int sum = 0;
        for (int j : a) {
            sum += j;
        }
        return sum;
    }
}
