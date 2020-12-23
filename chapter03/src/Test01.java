public class Test01 {
    public static void main(String[] args) {
        int fahrenheit = 100;
        float celcius = (int)((5/9f) * (fahrenheit-32) * 100 + 0.5) / 100f;
        float celcius2 = (5/9f) * (fahrenheit-32);
        System.out.println(celcius);
        System.out.printf("%.2f" ,celcius2);
    }
}
