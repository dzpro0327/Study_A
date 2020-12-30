public class Ex9_14 {
    public static void main(String[] args) {
        Integer i = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println(i == i2);  // 인스턴스의 주소가 다르기 때문에 false
        System.out.println(i.equals(i2));  // 값이 같다. true
        System.out.println(i.compareTo(i2));  // true(0)
        System.out.println(i.toString());  // 100

        System.out.println(Integer.MAX_VALUE); //
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.TYPE);
    }
}
