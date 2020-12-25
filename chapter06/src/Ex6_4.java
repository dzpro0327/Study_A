public class Ex6_4 {
    public static void main(String[] args) {
        Mymath mymath = new Mymath();
        long result1 = mymath.add(5L, 3L);
        long result2 = mymath.substract(5L, 3L);
        long result3 = mymath.multiply(5L, 3L);
        double result4 = mymath.divide(5L, 3L);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}

class Mymath {
    long add(long a, long b) {
        long result = a + b;
        return result;
    }

    long substract(long a, long b) {
        return a - b;
    }

    long multiply(long a, long b) {
        return a * b;
    }

    double divide(double a, double b) {
        return a / b;
    }
}