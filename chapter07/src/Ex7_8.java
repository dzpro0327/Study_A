import java.util.Arrays;

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint += (int) (price / 10.0);
    }
}

class Tv1 extends Product {
    Tv1() {
        super(100);
    }

    public String toString() {
        return "TV";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    Product[] cart = new Product[10];
    int i = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족합니다..");
            return;  // 잔액이 부족하면 if문 끝내고 메서드 종료.
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        cart[i++] = p;
        System.out.println(p + "을/를 구입하셨습니다.");
    }
}

public class Ex7_8 {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        buyer.buy(new Tv1());
        buyer.buy(new Computer());
        buyer.buy(new Computer());

        System.out.println("남은돈 : " + buyer.money);
        System.out.println("보너스 포인트 : " + buyer.bonusPoint);
        System.out.println("장바구니 목록 : " + Arrays.toString(buyer.cart));
    }
}
