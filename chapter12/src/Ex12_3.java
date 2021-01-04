//import java.util.ArrayList;
//
//class Fruit implements Eatable {
//    public String toString() {
//        return "Fruit";
//    }
//}
//
//interface Eatable {
//}
//
//class Apple extends Fruit {
//    @Override
//    public String toString() {
//        return "Apple";
//    }
//}
//
//class Grape extends Fruit {
//    @Override
//    public String toString() {
//        return "Grape";
//    }
//}
//
//class Toy {
//    @Override
//    public String toString() {
//        return "Toy";
//    }
//
//    class Ex12_3 {
//        public void main(String[] args) {
//        }
//    }
//
//    class FruitBox<T extends Fruit & Eatable> extends Box<T> {
//    }
//
//    class Box<T> {
//        ArrayList<T> list = new ArrayList<>();
//
//        void add(T item) {
//            list.add(item);
//        }
//
//        T get(int i) {
//            return list.get(i);
//        }
//
//        int size() {
//            return list.size();
//        }
//
//        public String toString() {
//            return list.toString();
//        }
//    }