public class TPC04 {
    public static void main(String[] args) {
        // 4. 데이터를 이동하라(변수 vs 배열)
        int a, b, c;
        a = 10;
        b = 20;
        c = 30;

        hop(a, b, c);

        int[] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;

        hop1(arr);

    }

    public static void hop(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void hop1(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println(sum);
    }
}
