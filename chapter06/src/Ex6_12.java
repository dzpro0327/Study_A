public class Ex6_12 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "white";
        c1.door = 4;
        c1.gearType = "auto";
        System.out.println(c1.color + ", " + c1.door + ", " + c1.gearType);

        System.out.println("=======================================");

        Car c2 = new Car("black", "auto", 4);
        System.out.println(c2.color + ", " + c2.gearType + ", " + c2.door);
    }
}

class Car {
    String color;
    String gearType;
    int door;

    Car() {}

    Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
