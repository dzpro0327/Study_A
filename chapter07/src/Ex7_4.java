public class Ex7_4 {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(10, 20, 30);
        System.out.println(point3D.x + point3D.y + point3D.z); // x = 10, y = 20, z = 30
    }
}

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point {
    int z;

    Point3D(int x, int y, int z) {
        super(x, y);  // 부모클래스 맴버변수를 뜻함
        this.z = z;
    }
}
