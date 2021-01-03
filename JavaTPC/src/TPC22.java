import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC22 {
    public static void main(String[] args) {
        //upcasting
        Animal ani = new Cat();
        Object ani1 = new Cat();
        ani.eat(); // 컴파일시점 --> Animal, 실행시점 --> dog

        // ani.night();
        // Cat c = (Cat) ani;
        // c.night();
        ((Cat)ani).night(); // downcasting

        ani = new Dog();
        ani.eat();
        // 다형성
        // 상위 클래스가 하위클래스에게 동일한 메세지로 서로 다르게 동작시키는 객체지행 원리

        Object o = new Dog();
        ((Dog)o).eat();
    }
}
