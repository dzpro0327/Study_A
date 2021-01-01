import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC19 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();

        Cat cat = new Cat();
        cat.eat();
        cat.night();
    }
}
