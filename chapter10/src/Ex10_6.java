import java.text.DecimalFormat;

public class Ex10_6 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#E0");
        double number = 1234567.89;
        System.out.println(df.format(number));
    }
}
