public class Ex3_14 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.printf("\"abc\" == \"abc\" ? %b%n", "abc" == "abc");
        System.out.printf(" str1 == \"abc\" ? %b%n", str1 == "abc");
        System.out.printf(" str2 == \"abc\" ? %b%n", str2 == "abc");
        System.out.printf(" str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
        System.out.printf(" str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
        System.out.printf(" str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));

        // 대소문자 구분없이 할때는 equalsIgnoreCase() 메서드 사용..
        System.out.printf(" str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));

    }
}
