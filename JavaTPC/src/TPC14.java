import kr.tpc.MemberVO;

public class TPC14 {
    public static void main(String[] args) {

        MemberVO m = new MemberVO();
        m.setName("이동주");
        m.setAge(26);
        m.setTel("010-1234-1234");
        m.setAddr("서울시");

        System.out.println(m.toString());

        // toString()을 생략도 가능하다..
        System.out.println(m);
    }
}
