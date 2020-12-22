public class Ex2_12 {
    public static void main(String[] args) {
        String str = "3";

        System.out.println(str.charAt(0) - '0');  // 3
        System.out.println('3' - '0' + 1); // 4
        System.out.println(Integer.parseInt("3") + 1);  // 4
        System.out.println("3" + 1); // 31
        System.out.println((char)(3 + '0'));  // 3
        System.out.println('A' + 'B');
        System.out.println('1' + '2');
        System.out.println('J' + "ava");
        System.out.println(true + "");
    }
}
