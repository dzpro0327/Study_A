import java.util.*;

import static java.util.Collections.*;

public class Ex11_19 {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list);

        addAll(list, 1, 2, 3, 4, 5);
        System.out.println(list);

        rotate(list, 2); // 오른쪽으로 두 칸씩 이동
        System.out.println(list);

        swap(list, 0, 2);  // 처음과 세 번째 위치를 바꿈
        System.out.println(list);

        shuffle(list);  // 썩는다.
        System.out.println(list);

        sort(list, reverseOrder());  // 역순으로 정렬
        System.out.println(list);

        sort(list);  // 정렬
        System.out.println(list);

        int idx = binarySearch(list, 3);  // 3이 저장된 위치 검색
        System.out.println("index of 3 = " + idx);

        System.out.println("max = " + max(list));
        System.out.println("min = " + min(list));
        System.out.println("min = " + max(list, reverseOrder()));

        fill(list, 9);
        System.out.println("list = " + list);

        List newList = nCopies(list.size(), 2);
        System.out.println("newList = " + newList);

        System.out.println(disjoint(list, newList));

        copy(list, newList);
        System.out.println("newList=" + newList);
        System.out.println("list=" + list);

        replaceAll(list, 2, 1);
        System.out.println("list = " + list);

        Enumeration e = enumeration(list);
        ArrayList list2 = list(e);

        System.out.println("list2 = " + list2);
    }
}
