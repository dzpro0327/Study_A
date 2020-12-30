public class Ex9_15 {
    public static void main(String[] args) {
        int i = 10;

        Integer intg = (Integer) i; // 10;
        Object obj = (Object) i;  // 10;

        Long lng = 100L;

        int i2 = intg + 10;  // 20;
        long l = intg + lng;  //  110L;

        Integer intg2 = new Integer(20);  // 20;
        int i3 = (int)intg2;  // 20;

        Integer intg3 = intg2 + i3;  // 40;

        System.out.println(i);
        System.out.println(intg);
        System.out.println(intg2);
        System.out.println(intg3);
        System.out.println(obj);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(lng);
        System.out.println(l);
    }
}
