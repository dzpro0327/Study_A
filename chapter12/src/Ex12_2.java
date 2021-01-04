import java.util.ArrayList;
import java.util.Iterator;

public class Ex12_2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("이동주1", 1, 1));
        list.add(new Student("이동주2", 1, 2));
        list.add(new Student("이동주3", 2, 1));

        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.name + ", " + s.ban + ", " + s.no);
        }
    }
}

class Student {
    String name = "";
    int ban;
    int no;

    Student(String name, int ban, int no) {
        this.name = name;
        this.ban = ban;
        this.no = no;
    }
}