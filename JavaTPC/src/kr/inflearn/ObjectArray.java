package kr.inflearn;

import kr.tpc.A;

public class ObjectArray {
    private int count;
    private Object[] arr;

    public ObjectArray() {
        this(10);
    }

    public ObjectArray(int init) {
        arr = new Object[init];
    }

    public void add(A data) {
        arr[count++] = data;
    }

    public Object get(int index) {
        return arr[index];
    }

    public int size() {
        return count;
    }
}
