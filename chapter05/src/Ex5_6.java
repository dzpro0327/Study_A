public class Ex5_6 {
    public static void main(String[] args) {
        String[] names = {"kim", "Park", "Yi"};

        for (int i = 0; i < names.length; i++) {
            System.out.println("name[" + i + "]: " + names[i]);
        }

        String tmp = names[2]; // tmp = "Yi"
        System.out.println("tmp: " + tmp);
        names[0] = "Yu";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
