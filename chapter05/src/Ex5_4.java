import java.util.Arrays;

public class Ex5_4 {
    public static void main(String[] args) {
        int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(numArr));

        for(int i=0; i<numArr.length; i++) {
            int n = (int)(Math.random() * 10);  // 0 ~ 9 사이의 아무 숫자를 추출
            int tmp = numArr[0];  // tmp = 0;
            numArr[0] = numArr[n];  // 0 = 0~9사이의 숫자 numArr[] 배열의 첫번째 있는 요소가 다시 값을 가짐
            numArr[n] = tmp;
        }
        System.out.println(Arrays.toString(numArr));
    }
}
