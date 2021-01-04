package kr.poly;

public class Radio implements RemoCon {

    @Override
    public void chUp() {
        System.out.println("Radio 채널을 올린다.");
    }

    @Override
    public void chDown() {
        System.out.println("Radio 채널을 내린다.");
    }

    @Override
    public void internet() {
        System.out.println("Radio는 인터넷을 지원하지 않는다..");
    }
}
