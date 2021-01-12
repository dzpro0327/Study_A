public class TPC39 {
    public static void main(String[] args) {

        // 박싱방식을 자주 쓰자..
        int a = 1;
        java.lang.Integer b = new Integer(1);
        System.out.println(b.intValue());
        System.out.println(b.toString());

        Object[] obj = new Object[3];
        obj[0] = new Integer(1);
        obj[1] = new Integer(2);
        obj[2] = new Integer(3);

        // toString() 없이도 출력가능
        System.out.println(obj[0]);
        System.out.println(obj[1]);
        System.out.println(obj[2]);

        int k = new Integer(100);
        int c = new Integer(100);

        System.out.println(k + c);

        String s1 = String.valueOf(k);
        String s2 = String.valueOf(c);

        System.out.println(s1 + s2);
    }
}
