public class TPC35 {
    public static void main(String[] args) {
        String str1 = new String("lee");
        String str2 = new String("lee");

        // 문자열로만 비교하고 싶을때는 equals
        // 주소값을 비교할 때는 == 사용..
        if (str1 == str2) {
            System.out.println("yes!");
        } else {
            System.out.println("No!");
        }

        if (str1.equals(str2)) {
            System.out.println("yes!");
        } else {
            System.out.println("No!");
        }

        String str3 = "lee";
        String str4 = "lee";

        if (str3 == str4) {
            System.out.println("Yes!");
        } else {
            System.out.println("No!");
        }

        if (str3.equals(str4)) {
            System.out.println("Yes!");
        } else {
            System.out.println("No!");
        }
    }
}