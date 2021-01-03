import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC21 {
    public static void main(String[] args) {
        // 직접 접근
        Dog d = new Dog();
        d.eat();
        Cat c = new Cat();
        c.eat();
        c.night();

        // 간접 접근(소스파일(.java)가 없을때)
        Animal ani1 = new Dog(); // upcasting
        ani1.eat();

        //ani.night();
        //Cat cc = (Cat) ani1;
        //cc.night();
        ((Cat)ani1).night(); // downcasting

    }
}
