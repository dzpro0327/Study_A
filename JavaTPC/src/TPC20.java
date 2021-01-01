import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {
    public static void main(String[] args) {

        Animal dog = new Dog();  // 업캐스팅(upcasting) 됨..
        dog.eat();  // 개처럼 먹는다.

        Animal cat = new Cat();
        cat.eat();  // 고양이처럼 먹는다..
        ((Cat) cat).night();  // 다운캐스킹(downcasting) 강제 형변환

        // 내가 Cat클래스를 설계한 경우에는 이렇게 사용
        Cat cat1 = new Cat();
        cat1.night();
    }
}
