import kr.inflearn.ObjectArray;
import kr.tpc.*;

public class TPC37 {
    public static void main(String[] args) {
        ObjectArray arr = new ObjectArray();
        arr.add(new A());
        arr.add(new A());
        arr.add(new A());
        arr.add(new A());
        arr.add(new A());

        for(int i=0; i<= arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}