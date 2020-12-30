public class Ex9_10 {
    public static void main(String[] args) {
        int iVal = 100;
        String strVal = String.valueOf(iVal);  // 기본형 --> 참조형 (int --> String)

        double dVal = 200.0;
        String strVal2 = String.valueOf(dVal);  // 기본형 --> 참조형 (int --> String)

        double sum = Integer.parseInt("+" + strVal) + Double.parseDouble(strVal2);
        double sum2 = Integer.parseInt(strVal) + Double.valueOf(strVal2);

        System.out.println(sum);
        System.out.println(sum2);
    }
}
