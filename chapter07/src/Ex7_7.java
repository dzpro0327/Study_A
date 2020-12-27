public class Ex7_7 {
    public static void main(String[] args) {
        Car car = new Car();
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();  // water!!!!
        car = fe;  // car = (Car)fe;  자동으로 형변환
        fe2 = (FireEngine) car;  // 형변환을 안해주면 에러가 난다.. 조상 타입 --> 자손 타입 형변환 생략 불가능
        fe2.water();  // water!!!!
    }
}

class Car {
    String color;
    int door;

    void driver() {
        System.out.println("driver, Brrrr~~~");
    }

    void stop() {
        System.out.println("stop!!!!");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water!!!");
    }
}