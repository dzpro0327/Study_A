import kr.poly.Animal;
import kr.poly.Cat;
import kr.poly.Dog;

public class TPC25 {
    public static void main(String[] args) {
        // eat() ----> override!!
        // upcasting으로 활용(부모의 역할)
        Animal ani = new Dog();
        ani.eat();
        ani.move();

        ani = new Cat();
        ani.eat();
        ani.move();
        ((Cat) ani).night();
    }
}
