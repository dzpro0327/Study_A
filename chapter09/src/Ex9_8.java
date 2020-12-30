public class Ex9_8 {
    public static void main(String[] args) {
        // 길이가 0인 char배열을 생성한다..
        char[] cArr = new char[0];
        String s = new String(cArr);

        System.out.println(cArr.length);
        System.out.println("@@@" + s + "@@@");  // 길이가 0이기 떄문에 문자열이 붙어서 출력된다.
    }
}
