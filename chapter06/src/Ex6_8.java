public class Ex6_8 {
    public static void main(String[] args) {
        Data3 data3 = new Data3();
        data3.x = 10;

        Data3 d2 = copy(data3);
        System.out.println(data3.x);
        System.out.println(d2.x);
    }

    static Data3 copy(Data3 data3) {
        Data3 tmp = new Data3();
        tmp.x = data3.x;

        return tmp;
    }
}

class Data3 {
    int x;
}