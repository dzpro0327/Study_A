public class Ex4_19 {
    public static void main(String[] args) {
        // 반복문에 이름을 붙임
        Loop1 : for(int i=2; i <= 9; i++) {
            for(int j=1; j <= 9; j++) {
                if(j==5)
                    break Loop1;
                System.out.println(i + "*" + j + "=" + i*j);
            }
            System.out.println();
        }
    }
}
